package org.thingml.xtext.validation.checks;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.constraints.Types;
import org.thingml.xtext.helpers.ActionHelper;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.helpers.FunctionWithMultipleImplem;
import org.thingml.xtext.helpers.ThingHelper;
import org.thingml.xtext.helpers.TyperHelper;
import org.thingml.xtext.helpers.UnimplementedFunction;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ActionBlock;
import org.thingml.xtext.thingML.ConditionalAction;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ExternStatement;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.FunctionCallExpression;
import org.thingml.xtext.thingML.FunctionCallStatement;
import org.thingml.xtext.thingML.LoopAction;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.ReturnAction;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xtext.thingML.VariableAssignment;
import org.thingml.xtext.validation.ThingMLValidatorCheck;
import org.thingml.xtext.validation.TypeChecker;

@SuppressWarnings("all")
public class FunctionUsage extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkThread(final Function f) {
    if ((AnnotatedElementHelper.isDefined(f, "fork_thread", "true") || AnnotatedElementHelper.hasFlag(f, "fork_thread"))) {
      if (((f.getTypeRef() != null) && (f.getTypeRef().getType() != null))) {
        String _name = f.getName();
        String _plus = ("Function " + _name);
        final String msg = (_plus + " forks a thread. It cannot return a result.");
        this.warning(msg, f, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "function-thread-cannot-return", f.getName());
      }
    }
  }
  
  @Check(CheckType.NORMAL)
  public void checkUsage(final Function f) {
    final Thing thing = ThingMLHelpers.findContainingThing(f);
    final Function1<FunctionCallStatement, Boolean> _function = (FunctionCallStatement call) -> {
      return Boolean.valueOf((Objects.equal(call.getFunction(), f) || Objects.equal(call.getFunction().getName(), f.getName())));
    };
    boolean _exists = IterableExtensions.<FunctionCallStatement>exists(ActionHelper.<FunctionCallStatement>getAllActions(thing, FunctionCallStatement.class), _function);
    if (_exists) {
      return;
    }
    final Function1<FunctionCallExpression, Boolean> _function_1 = (FunctionCallExpression call) -> {
      return Boolean.valueOf((Objects.equal(call.getFunction(), f) || Objects.equal(call.getFunction().getName(), f.getName())));
    };
    boolean _exists_1 = IterableExtensions.<FunctionCallExpression>exists(ThingMLHelpers.<FunctionCallExpression>getAllExpressions(thing, FunctionCallExpression.class), _function_1);
    if (_exists_1) {
      return;
    }
    final Function1<Thing, Boolean> _function_2 = (Thing included) -> {
      return Boolean.valueOf((IterableExtensions.<FunctionCallStatement>exists(ActionHelper.<FunctionCallStatement>getAllActions(included, FunctionCallStatement.class), ((Function1<FunctionCallStatement, Boolean>) (FunctionCallStatement call) -> {
        String _name = call.getFunction().getName();
        String _name_1 = f.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      })) || IterableExtensions.<FunctionCallExpression>exists(ThingMLHelpers.<FunctionCallExpression>getAllExpressions(included, FunctionCallExpression.class), ((Function1<FunctionCallExpression, Boolean>) (FunctionCallExpression call) -> {
        String _name = call.getFunction().getName();
        String _name_1 = f.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      }))));
    };
    final boolean isUsedByIncludingThings = IterableExtensions.<Thing>exists(ThingHelper.allIncludedThings(thing), _function_2);
    if ((!isUsedByIncludingThings)) {
      String _name = f.getName();
      String _plus = ("Function " + _name);
      final String msg = (_plus + " is never called.");
      this.warning(msg, f, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "function-never-called", f.getName());
    }
  }
  
  @Check(CheckType.FAST)
  public void checkConcrete(final Thing t) {
    boolean _isFragment = t.isFragment();
    if (_isFragment) {
      return;
    }
    final Function1<Function, Boolean> _function = (Function f) -> {
      return Boolean.valueOf(f.isAbstract());
    };
    final Consumer<Function> _function_1 = (Function f) -> {
      try {
        try {
          ThingHelper.getConcreteFunction(t, f);
        } catch (final Throwable _t) {
          if (_t instanceof UnimplementedFunction) {
            final UnimplementedFunction e = (UnimplementedFunction)_t;
            final Thing origin = ThingMLHelpers.findContainingThing(f);
            boolean _equals = Objects.equal(origin, t);
            if (_equals) {
              this.error(e.getMessage(), f, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "function-not-implemented", f.getName());
            } else {
              this.error(e.getMessage(), t, ThingMLPackage.eINSTANCE.getThing_Includes(), t.getIncludes().indexOf(origin), "function-not-implemented", f.getName());
            }
          } else if (_t instanceof FunctionWithMultipleImplem) {
            final FunctionWithMultipleImplem e_1 = (FunctionWithMultipleImplem)_t;
            final Thing origin_1 = ThingMLHelpers.findContainingThing(f);
            boolean _equals_1 = Objects.equal(origin_1, t);
            if (_equals_1) {
              this.error(e_1.getMessage(), t, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "function-many-impl", f.getName());
            } else {
              this.error(e_1.getMessage(), t, ThingMLPackage.eINSTANCE.getThing_Includes(), t.getIncludes().indexOf(origin_1), "function-many-impl", f.getName());
            }
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    IterableExtensions.<Function>filter(ThingMLHelpers.allFunctions(t), _function).forEach(_function_1);
  }
  
  @Check(CheckType.FAST)
  public void checkAbstract(final Function f) {
    EObject _eContainer = f.eContainer();
    Thing thing = ((Thing) _eContainer);
    if (((!thing.isFragment()) && f.isAbstract())) {
      String _name = thing.getName();
      String _plus = ("Thing " + _name);
      String _plus_1 = (_plus + " is not a fragment, so it cannot contain abstract functions");
      this.error(_plus_1, thing, f.eContainingFeature(), thing.getFunctions().indexOf(f), "abstract-function-fragment", f.getName());
    }
  }
  
  @Check(CheckType.NORMAL)
  public void checkParameters(final Function f) {
    boolean _isAbstract = f.isAbstract();
    boolean _not = (!_isAbstract);
    if (_not) {
      final List<PropertyReference> refs = ThingMLHelpers.<PropertyReference>getAllExpressions(f, PropertyReference.class);
      final List<VariableAssignment> assigns = ActionHelper.<VariableAssignment>getAllActions(f, VariableAssignment.class);
      final Procedure2<Parameter, Integer> _function = (Parameter p, Integer i) -> {
        final Function1<PropertyReference, Boolean> _function_1 = (PropertyReference pr) -> {
          Variable _property = pr.getProperty();
          return Boolean.valueOf((_property == p));
        };
        final boolean isUsed = IterableExtensions.<PropertyReference>exists(refs, _function_1);
        if ((!isUsed)) {
          String _name = p.getName();
          String _plus = ("Parameter " + _name);
          String _plus_1 = (_plus + " is never used");
          this.warning(_plus_1, f, ThingMLPackage.eINSTANCE.getFunction_Parameters(), (i).intValue(), "parameter-not-used");
        }
        final Consumer<VariableAssignment> _function_2 = (VariableAssignment va) -> {
          Variable _property = va.getProperty();
          boolean _tripleEquals = (_property == p);
          if (_tripleEquals) {
            String _name_1 = p.getName();
            String _plus_2 = ("Re-assigning parameter " + _name_1);
            String _plus_3 = (_plus_2 + " can have side effects");
            this.warning(_plus_3, va.eContainer(), va.eContainingFeature(), "parameter-reassign");
          }
        };
        assigns.forEach(_function_2);
      };
      IterableExtensions.<Parameter>forEach(f.getParameters(), _function);
    }
  }
  
  private boolean returns(final Action a) {
    if ((a instanceof ReturnAction)) {
      return true;
    }
    if ((a instanceof ActionBlock)) {
      final ActionBlock block = ((ActionBlock) a);
      final Function1<Action, Boolean> _function = (Action aa) -> {
        return Boolean.valueOf(this.returns(aa));
      };
      return IterableExtensions.<Action>exists(ListExtensions.<Action>reverseView(block.getActions()), _function);
    }
    if ((a instanceof ConditionalAction)) {
      final ConditionalAction ca = ((ConditionalAction) a);
      return ((this.returns(ca.getAction()) && (ca.getElseAction() != null)) && this.returns(ca.getElseAction()));
    }
    if ((a instanceof LoopAction)) {
      final LoopAction la = ((LoopAction) a);
      return this.returns(la.getAction());
    }
    return false;
  }
  
  @Check(CheckType.FAST)
  public void checkReturnOnlyInFunction(final ReturnAction r) {
    EObject _eContainer = r.eContainer();
    EObject parent = ((EObject) _eContainer);
    while (((parent != null) && (!(parent instanceof Function)))) {
      EObject _eContainer_1 = parent.eContainer();
      parent = ((EObject) _eContainer_1);
    }
    if (((parent == null) || ((((Function) parent).getTypeRef() == null) && (r.getExp() != null)))) {
      final Object c = r.eContainer().eGet(r.eContainingFeature());
      final String msg = "Return action is only allowed in functions with a return type.";
      if ((c instanceof EList)) {
        this.error(msg, r.eContainer(), r.eContainingFeature(), ((EList) c).indexOf(r), "return-not-allowed");
      } else {
        this.error(msg, r.eContainer(), r.eContainingFeature(), "return-not-allowed");
      }
    }
  }
  
  private int indexOfLastExtern(final ActionBlock block) {
    final Function1<Action, Boolean> _function = (Action a) -> {
      return Boolean.valueOf((a instanceof ExternStatement));
    };
    Action last = IterableExtensions.<Action>findLast(block.getActions(), _function);
    if ((last != null)) {
      return block.getActions().indexOf(last);
    }
    return (-1);
  }
  
  @Check(CheckType.FAST)
  public void checkBlock(final ActionBlock block) {
    Function _xifexpression = null;
    EObject _eContainer = block.eContainer();
    if ((_eContainer instanceof Function)) {
      EObject _eContainer_1 = block.eContainer();
      _xifexpression = ((Function) _eContainer_1);
    } else {
      _xifexpression = null;
    }
    final Function f = _xifexpression;
    if ((((f == null) || (f.getTypeRef() == null)) || (f.getTypeRef().getType() == null))) {
      return;
    }
    final int indexOfLastExtern = this.indexOfLastExtern(block);
    int indexOfFirstReturn = (-1);
    if ((indexOfLastExtern < 0)) {
      final Function1<Action, Boolean> _function = (Action a) -> {
        return Boolean.valueOf(this.returns(a));
      };
      final Action firstReturn = IterableExtensions.<Action>findFirst(block.getActions(), _function);
      indexOfFirstReturn = block.getActions().indexOf(firstReturn);
    } else {
      return;
    }
    if (((indexOfFirstReturn >= 0) && (indexOfFirstReturn < (block.getActions().size() - 1)))) {
      final String msg = "The code from here and below is unreachable (the code above will return in any case)";
      this.error(msg, block, ThingMLPackage.eINSTANCE.getActionBlock_Actions(), (indexOfFirstReturn + 1), "unreachable-code", Integer.valueOf(indexOfFirstReturn).toString());
    }
  }
  
  @Check(CheckType.FAST)
  public void checkReturnType2(final Function f) {
    if ((((!f.isAbstract()) && (f.getTypeRef() != null)) && (f.getTypeRef().getType() != null))) {
      if (((f.getBody() instanceof ReturnAction) || ((f.getBody() instanceof ConditionalAction) && this.returns(f.getBody())))) {
        return;
      }
      boolean _returns = this.returns(f.getBody());
      boolean _not = (!_returns);
      if (_not) {
        final TypeRef actualType = TyperHelper.getBroadType(f.getTypeRef());
        String _name = f.getName();
        String _plus = ("Function " + _name);
        String _plus_1 = (_plus + " must return ");
        String _string = Types.toString(actualType);
        String _plus_2 = (_plus_1 + _string);
        final String msg = (_plus_2 + ". Found no return action.");
        this.error(msg, f, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "missing-return", f.getName());
        return;
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkReturnType(final Function f) {
    boolean _isAbstract = f.isAbstract();
    boolean _not = (!_isAbstract);
    if (_not) {
      if (((f.getTypeRef() != null) && (f.getTypeRef().getType() != null))) {
        final Consumer<ReturnAction> _function = (ReturnAction ra) -> {
          final TypeRef actualType = TyperHelper.getBroadType(f.getTypeRef());
          final TypeRef returnType = TypeChecker.computeTypeOf(ra.getExp());
          final Object parent = ra.eContainer().eGet(ra.eContainingFeature());
          boolean _equals = returnType.equals(Types.ERROR_TYPEREF);
          if (_equals) {
            String _name = f.getName();
            String _plus = ("Function " + _name);
            String _plus_1 = (_plus + " should return ");
            String _string = Types.toString(actualType);
            String _plus_2 = (_plus_1 + _string);
            String _plus_3 = (_plus_2 + ". Found ");
            String _string_1 = Types.toString(returnType);
            String _plus_4 = (_plus_3 + _string_1);
            final String msg = (_plus_4 + ".");
            if ((parent instanceof EList)) {
              this.error(msg, ra.eContainer(), ra.eContainingFeature(), ((EList) parent).indexOf(ra), "type");
            } else {
              this.error(msg, ra.eContainer(), ra.eContainingFeature(), "type");
            }
          } else {
            boolean _equals_1 = returnType.equals(Types.ANY_TYPEREF);
            if (_equals_1) {
              String _name_1 = f.getName();
              String _plus_5 = ("Function " + _name_1);
              String _plus_6 = (_plus_5 + " should return ");
              String _string_2 = Types.toString(actualType);
              String _plus_7 = (_plus_6 + _string_2);
              final String msg_1 = (_plus_7 + ". Found a value/expression that cannot be typed. Consider using a cast (<exp> as <type>).");
              if ((parent instanceof EList)) {
                this.warning(msg_1, ra.eContainer(), ra.eContainingFeature(), ((EList) parent).indexOf(ra), "type-cast", f.getTypeRef().getType().getName());
              } else {
                this.warning(msg_1, ra.eContainer(), ra.eContainingFeature(), "type-cast", f.getTypeRef().getType().getName());
              }
            } else {
              boolean _isA = TyperHelper.isA(returnType, actualType);
              boolean _not_1 = (!_isA);
              if (_not_1) {
                String _name_2 = f.getName();
                String _plus_8 = ("Function " + _name_2);
                String _plus_9 = (_plus_8 + " should return ");
                String _string_3 = Types.toString(actualType);
                String _plus_10 = (_plus_9 + _string_3);
                String _plus_11 = (_plus_10 + ". Found ");
                String _string_4 = Types.toString(returnType);
                String _plus_12 = (_plus_11 + _string_4);
                final String msg_2 = (_plus_12 + ".");
                if ((parent instanceof EList)) {
                  this.error(msg_2, ra.eContainer(), ra.eContainingFeature(), ((EList) parent).indexOf(ra), "type");
                } else {
                  this.error(msg_2, ra.eContainer(), ra.eContainingFeature(), "type");
                }
              }
            }
          }
        };
        ActionHelper.<ReturnAction>getAllActions(f, ReturnAction.class).forEach(_function);
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkFunctionCallAction(final FunctionCallStatement call) {
    final Thing t = ThingMLHelpers.findContainingThing(call);
    final boolean ignore = (AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") || AnnotatedElementHelper.isDefined(call.getFunction(), "ignore", "type-warning"));
    this.checkFunctionCall(call.getFunction(), call.getParameters(), call, ignore);
  }
  
  @Check(CheckType.FAST)
  public void checkFunctionCallExpression(final FunctionCallExpression call) {
    final Thing t = ThingMLHelpers.findContainingThing(call);
    final boolean ignore = (AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") || AnnotatedElementHelper.isDefined(call.getFunction(), "ignore", "type-warning"));
    this.checkFunctionCall(call.getFunction(), call.getParameters(), call, ignore);
  }
  
  public void checkFunctionCall(final Function function, final List<Expression> params, final EObject o, final boolean ignore) {
    final Object parent = o.eContainer().eGet(o.eContainingFeature());
    int _size = function.getParameters().size();
    int _size_1 = params.size();
    boolean _tripleNotEquals = (_size != _size_1);
    if (_tripleNotEquals) {
      String _name = function.getName();
      String _plus = ("Function " + _name);
      String _plus_1 = (_plus + " is called with a wrong number of arguments. Expected ");
      int _size_2 = function.getParameters().size();
      String _plus_2 = (_plus_1 + Integer.valueOf(_size_2));
      String _plus_3 = (_plus_2 + ", called with ");
      int _size_3 = params.size();
      final String msg = (_plus_3 + Integer.valueOf(_size_3));
      if ((parent instanceof EList)) {
        this.error(msg, o.eContainer(), o.eContainingFeature(), ((EList) parent).indexOf(o), "function-call-wrong-parameter-length");
      } else {
        this.error(msg, o.eContainer(), o.eContainingFeature(), "function-call-wrong-parameter-length");
      }
      return;
    }
    final Procedure2<Parameter, Integer> _function = (Parameter p, Integer i) -> {
      final Expression e = params.get((i).intValue());
      final TypeRef expected = TyperHelper.getBroadType(p.getTypeRef());
      final TypeRef actual = TypeChecker.computeTypeOf(e);
      if ((actual != null)) {
        boolean _equals = actual.equals(Types.ERROR_TYPEREF);
        if (_equals) {
          String _name_1 = function.getName();
          String _plus_4 = ("Function " + _name_1);
          String _plus_5 = (_plus_4 + " is called with an erroneous parameter. Expected ");
          String _string = Types.toString(expected);
          String _plus_6 = (_plus_5 + _string);
          String _plus_7 = (_plus_6 + ", called with ");
          String _string_1 = Types.toString(TyperHelper.getBroadType(actual));
          final String msg_1 = (_plus_7 + _string_1);
          if ((parent instanceof EList)) {
            this.error(msg_1, o.eContainer(), o.eContainingFeature(), ((EList) parent).indexOf(o), "function-call-wrong-parameter-type");
          } else {
            this.error(msg_1, o.eContainer(), o.eContainingFeature(), "function-call-wrong-parameter-type");
          }
        } else {
          if (((!ignore) && actual.equals(Types.ANY_TYPEREF))) {
            String _name_2 = function.getName();
            String _plus_8 = ("Function " + _name_2);
            final String msg_2 = (_plus_8 + " is called with a parameter which cannot be typed. Consider using a cast (<exp> as <type>), or using @ignore \"type-warning\".");
            if ((parent instanceof EList)) {
              this.warning(msg_2, o.eContainer(), o.eContainingFeature(), ((EList) parent).indexOf(o), "function-call-wrong-parameter-type");
            } else {
              this.warning(msg_2, o.eContainer(), o.eContainingFeature(), "function-call-wrong-parameter-type");
            }
          } else {
            boolean _isA = TyperHelper.isA(actual, expected);
            boolean _not = (!_isA);
            if (_not) {
              String _name_3 = function.getName();
              String _plus_9 = ("Function " + _name_3);
              String _plus_10 = (_plus_9 + " is called with an erroneous parameter. Expected ");
              String _string_2 = Types.toString(expected);
              String _plus_11 = (_plus_10 + _string_2);
              String _plus_12 = (_plus_11 + ", called with ");
              String _string_3 = Types.toString(TyperHelper.getBroadType(actual));
              final String msg_3 = (_plus_12 + _string_3);
              if ((parent instanceof EList)) {
                this.error(msg_3, o.eContainer(), o.eContainingFeature(), ((EList) parent).indexOf(o), "function-call-wrong-parameter-type");
              } else {
                this.error(msg_3, o.eContainer(), o.eContainingFeature(), "function-call-wrong-parameter-type");
              }
            }
          }
        }
      }
    };
    IterableExtensions.<Parameter>forEach(function.getParameters(), _function);
  }
}
