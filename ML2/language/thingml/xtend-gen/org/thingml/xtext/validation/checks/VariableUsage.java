package org.thingml.xtext.validation.checks;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.constraints.Types;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.helpers.ThingHelper;
import org.thingml.xtext.helpers.TyperHelper;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ArrayInit;
import org.thingml.xtext.thingML.CastExpression;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ForAction;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xtext.thingML.VariableAssignment;
import org.thingml.xtext.validation.ThingMLValidatorCheck;
import org.thingml.xtext.validation.TypeChecker;

@SuppressWarnings("all")
public class VariableUsage extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkFor(final ForAction fa) {
    Expression _cardinality = fa.getArray().getProperty().getTypeRef().getCardinality();
    boolean _tripleEquals = (_cardinality == null);
    if (_tripleEquals) {
      String _name = fa.getArray().getProperty().getName();
      String _plus = ("Cannot iterate over " + _name);
      final String msg = (_plus + ". This is not an array.");
      this.error(msg, fa, ThingMLPackage.eINSTANCE.getForAction_Array());
      return;
    }
    final TypeRef vt = TyperHelper.getBroadType(fa.getVariable().getTypeRef());
    final TypeRef arrayType = TyperHelper.getBroadType(fa.getArray().getProperty().getTypeRef());
    boolean _isA = TyperHelper.isA(arrayType, Types.getTypeRef(vt, true));
    boolean _not = (!_isA);
    if (_not) {
      final TypeRef scalar = EcoreUtil.<TypeRef>copy(arrayType);
      scalar.setIsArray(false);
      scalar.setCardinality(null);
      String _name_1 = fa.getVariable().getName();
      String _plus_1 = ("Variable " + _name_1);
      String _plus_2 = (_plus_1 + " should be ");
      String _string = Types.toString(scalar);
      String _plus_3 = (_plus_2 + _string);
      String _plus_4 = (_plus_3 + ". Found ");
      String _string_1 = Types.toString(vt);
      String _plus_5 = (_plus_4 + _string_1);
      final String msg_1 = (_plus_5 + ".");
      this.error(msg_1, fa, ThingMLPackage.eINSTANCE.getForAction_Variable());
    }
    Parameter _index = fa.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      final TypeRef indexT = TyperHelper.getBroadType(fa.getIndex().getTypeRef());
      boolean _isA_1 = TyperHelper.isA(indexT, Types.INTEGER_TYPEREF);
      boolean _not_1 = (!_isA_1);
      if (_not_1) {
        String _name_2 = fa.getIndex().getName();
        String _plus_6 = ("Variable " + _name_2);
        String _plus_7 = (_plus_6 + " should be Integer. Found ");
        String _string_2 = Types.toString(indexT);
        String _plus_8 = (_plus_7 + _string_2);
        final String msg_2 = (_plus_8 + ".");
        this.error(msg_2, fa, ThingMLPackage.eINSTANCE.getForAction_Index());
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkCast(final CastExpression cast) {
    final TypeRef actual = TypeChecker.computeTypeOf(cast.getTerm());
    final TypeRef typeref = ThingMLFactory.eINSTANCE.createTypeRef();
    typeref.setType(cast.getType());
    boolean _isA = TyperHelper.isA(actual, typeref);
    boolean _not = (!_isA);
    if (_not) {
      String _name = actual.getType().getName();
      String _plus = ("Cannot cast " + _name);
      String _plus_1 = (_plus + " to ");
      String _name_1 = cast.getType().getName();
      final String msg = (_plus_1 + _name_1);
      final Object parent = cast.eContainer().eGet(cast.eContainingFeature());
      if ((parent instanceof EList)) {
        this.error(msg, cast.eContainer(), cast.eContainingFeature(), ((EList<Action>) parent).indexOf(cast), "type");
      } else {
        this.error(msg, cast.eContainer(), cast.eContainingFeature(), "type");
      }
    }
  }
  
  public void checkType(final Variable va, final Expression e, final EObject o, final EStructuralFeature f) {
    Expression _cardinality = va.getTypeRef().getCardinality();
    boolean _tripleEquals = (_cardinality == null);
    if (_tripleEquals) {
      final TypeRef expected = TyperHelper.getBroadType(va.getTypeRef());
      final TypeRef actual = TypeChecker.computeTypeOf(e);
      if ((actual != null)) {
        final TypeRef broad = TyperHelper.getBroadType(actual);
        final Thing t = ThingMLHelpers.findContainingThing(va);
        final boolean ignore = (AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") || AnnotatedElementHelper.isDefined(va, "ignore", "type-warning"));
        boolean _equals = actual.equals(Types.ERROR_TYPEREF);
        if (_equals) {
          String _name = va.getName();
          String _plus = ("Property " + _name);
          String _plus_1 = (_plus + " is assigned with an erroneous value/expression. Expected ");
          String _string = Types.toString(expected);
          String _plus_2 = (_plus_1 + _string);
          String _plus_3 = (_plus_2 + ", assigned with ");
          String _string_1 = Types.toString(broad);
          final String msg = (_plus_3 + _string_1);
          this.error(msg, o, f, "type");
        } else {
          if (((!ignore) && actual.equals(Types.ANY_TYPEREF))) {
            String _name_1 = va.getName();
            String _plus_4 = ("Property " + _name_1);
            final String msg_1 = (_plus_4 + " is assigned with a value/expression which cannot be typed. Consider using a cast (<exp> as <Type>), or use @ignore \"type-warning\"");
            this.warning(msg_1, o, f, "type-cast", va.getTypeRef().getType().getName());
          } else {
            boolean _isA = TyperHelper.isA(actual, expected);
            boolean _not = (!_isA);
            if (_not) {
              String _name_2 = va.getName();
              String _plus_5 = ("Property " + _name_2);
              String _plus_6 = (_plus_5 + " is assigned with an erroneous value/expression. Expected ");
              String _string_2 = Types.toString(expected);
              String _plus_7 = (_plus_6 + _string_2);
              String _plus_8 = (_plus_7 + ", assigned with ");
              String _string_3 = Types.toString(broad);
              final String msg_2 = (_plus_8 + _string_3);
              this.error(msg_2, o, f, "type");
            }
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkVariableAssignment(final VariableAssignment va) {
    boolean _xifexpression = false;
    Variable _property = va.getProperty();
    if ((_property instanceof Property)) {
      Variable _property_1 = va.getProperty();
      _xifexpression = ((Property) _property_1).isReadonly();
    } else {
      boolean _xifexpression_1 = false;
      Variable _property_2 = va.getProperty();
      if ((_property_2 instanceof LocalVariable)) {
        Variable _property_3 = va.getProperty();
        _xifexpression_1 = ((LocalVariable) _property_3).isReadonly();
      } else {
        _xifexpression_1 = false;
      }
      _xifexpression = _xifexpression_1;
    }
    final boolean readOnly = _xifexpression;
    if (readOnly) {
      String _name = va.getProperty().getName();
      final String msg = ("Assigning read-only variable " + _name);
      final Object parent = va.eContainer().eGet(va.eContainingFeature());
      if ((parent instanceof EList)) {
        this.error(msg, va.eContainer(), va.eContainingFeature(), ((EList<Action>) parent).indexOf(va), "property-assign-readonly");
      } else {
        this.error(msg, va.eContainer(), va.eContainingFeature(), "property-assign-readonly");
      }
    }
    if (((va.getProperty().getTypeRef().getCardinality() != null) && (va.getIndex() != null))) {
      final TypeRef actual = TypeChecker.computeTypeOf(va.getExpression());
      if ((actual.isIsArray() || (actual.getCardinality() != null))) {
        String _name_1 = va.getProperty().getName();
        String _plus = ("Cannot assign array into " + _name_1);
        final String msg_1 = (_plus + "[x].");
        final Object parent_1 = va.eContainer().eGet(va.eContainingFeature());
        if ((parent_1 instanceof EList)) {
          this.error(msg_1, va.eContainer(), va.eContainingFeature(), ((EList<Action>) parent_1).indexOf(va), "property-assign-readonly");
        } else {
          this.error(msg_1, va.eContainer(), va.eContainingFeature(), "property-assign-readonly");
        }
      }
    }
    this.checkType(va.getProperty(), va.getExpression(), va, ThingMLPackage.eINSTANCE.getVariableAssignment_Expression());
  }
  
  @Check(CheckType.FAST)
  public void checkLocalVariable(final LocalVariable v) {
    final TypeRef expected = TyperHelper.getBroadType(v.getTypeRef());
    if ((v.isReadonly() && (v.getInit() == null))) {
      String _name = v.getName();
      String _plus = ("Readonly local variable " + _name);
      final String msg = (_plus + " must be initialized on declaration");
      final Object parent = v.eContainer().eGet(v.eContainingFeature());
      if ((parent instanceof EList)) {
        this.error(msg, v.eContainer(), v.eContainingFeature(), ((EList<Action>) parent).indexOf(v), "readonly-not-init");
      } else {
        this.error(msg, v.eContainer(), v.eContainingFeature(), "readonly-not-init");
      }
    }
    Expression _init = v.getInit();
    boolean _tripleNotEquals = (_init != null);
    if (_tripleNotEquals) {
      this.checkType(v, v.getInit(), v, ThingMLPackage.eINSTANCE.getLocalVariable_Init());
    }
    Expression _cardinality = v.getTypeRef().getCardinality();
    boolean _tripleNotEquals_1 = (_cardinality != null);
    if (_tripleNotEquals_1) {
      Expression _init_1 = v.getInit();
      boolean _tripleNotEquals_2 = (_init_1 != null);
      if (_tripleNotEquals_2) {
        final TypeRef actual = TypeChecker.computeTypeOf(v.getInit());
        final Expression i = v.getInit();
        if (((i instanceof ArrayInit) && actual.equals(Types.ERROR_TYPEREF))) {
          TypeRef _typeRef = Types.getTypeRef(expected, false);
          String _plus_1 = ("Array initializer {...} contains errors. Check that all values have the type " + _typeRef);
          this.error(_plus_1, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
        } else {
          if (((i instanceof ArrayInit) && (v.getTypeRef().getCardinality() instanceof IntegerLiteral))) {
            Expression _cardinality_1 = v.getTypeRef().getCardinality();
            final IntegerLiteral lit = ((IntegerLiteral) _cardinality_1);
            ArrayInit ai = ((ArrayInit) i);
            long _intValue = lit.getIntValue();
            int _size = ai.getValues().size();
            boolean _notEquals = (_intValue != _size);
            if (_notEquals) {
              int _size_1 = ai.getValues().size();
              String _plus_2 = ("Array initializer {...} of size " + Integer.valueOf(_size_1));
              String _plus_3 = (_plus_2 + " is affected to array of size ");
              long _intValue_1 = lit.getIntValue();
              final String msg_1 = (_plus_3 + Long.valueOf(_intValue_1));
              this.error(msg_1, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
            }
          } else {
            boolean _isIsArray = actual.isIsArray();
            boolean _not = (!_isIsArray);
            if (_not) {
              TypeRef _typeRef_1 = Types.getTypeRef(expected, false);
              final String msg_2 = ("Array can only be initialized with initializer {...} or from another array (or through myArray[i]=x as independent statements) " + _typeRef_1);
              this.error(msg_2, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
            } else {
              if ((i instanceof PropertyReference)) {
                final PropertyReference pr = ((PropertyReference) i);
                Expression _cardinality_2 = pr.getProperty().getTypeRef().getCardinality();
                boolean _tripleEquals = (_cardinality_2 == null);
                if (_tripleEquals) {
                  final String msg_3 = "Arrays can only be assigned from an array initializers {...} or from another array.";
                  this.error(msg_3, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
                }
              }
            }
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkProperty(final Property v) {
    final TypeRef expected = TyperHelper.getBroadType(v.getTypeRef());
    final Object parent = v.eContainer().eGet(v.eContainingFeature());
    Expression _init = v.getInit();
    boolean _tripleNotEquals = (_init != null);
    if (_tripleNotEquals) {
      this.checkType(v, v.getInit(), v, ThingMLPackage.eINSTANCE.getProperty_Init());
    }
    Expression _cardinality = v.getTypeRef().getCardinality();
    boolean _tripleNotEquals_1 = (_cardinality != null);
    if (_tripleNotEquals_1) {
      Expression _init_1 = v.getInit();
      boolean _tripleNotEquals_2 = (_init_1 != null);
      if (_tripleNotEquals_2) {
        final TypeRef actual = TypeChecker.computeTypeOf(v.getInit());
        final Expression i = v.getInit();
        if (((i instanceof ArrayInit) && actual.equals(Types.ERROR_TYPEREF))) {
          TypeRef _typeRef = Types.getTypeRef(expected, false);
          final String msg = ("Array initializer {...} contains errors. Check that all values have the type " + _typeRef);
          this.error(msg, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
        } else {
          if (((i instanceof ArrayInit) && (v.getTypeRef().getCardinality() instanceof IntegerLiteral))) {
            Expression _cardinality_1 = v.getTypeRef().getCardinality();
            final IntegerLiteral lit = ((IntegerLiteral) _cardinality_1);
            ArrayInit ai = ((ArrayInit) i);
            long _intValue = lit.getIntValue();
            int _size = ai.getValues().size();
            boolean _notEquals = (_intValue != _size);
            if (_notEquals) {
              int _size_1 = ai.getValues().size();
              String _plus = ("Array initializer {...} of size " + Integer.valueOf(_size_1));
              String _plus_1 = (_plus + " is affected to array of size ");
              long _intValue_1 = lit.getIntValue();
              final String msg_1 = (_plus_1 + Long.valueOf(_intValue_1));
              this.error(msg_1, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
            }
          } else {
            boolean _isIsArray = actual.isIsArray();
            boolean _not = (!_isIsArray);
            if (_not) {
              TypeRef _typeRef_1 = Types.getTypeRef(expected, false);
              final String msg_2 = ("Array can only be initialized with initializer {...} or from another array (or through myArray[i]=x as independent statements) " + _typeRef_1);
              this.error(msg_2, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
            } else {
              if ((i instanceof PropertyReference)) {
                final PropertyReference pr = ((PropertyReference) i);
                Expression _cardinality_2 = pr.getProperty().getTypeRef().getCardinality();
                boolean _tripleEquals = (_cardinality_2 == null);
                if (_tripleEquals) {
                  String _name = pr.getProperty().getName();
                  final String msg_3 = (_name + " is not an array.");
                  if ((parent instanceof EList)) {
                    this.error(msg_3, v.eContainer(), v.eContainingFeature(), ((EList<Action>) parent).indexOf(v), "array-wrong-assign");
                  } else {
                    this.error(msg_3, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyUsage(final Thing thing) {
    boolean _isFragment = thing.isFragment();
    if (_isFragment) {
      return;
    }
    final List<Property> usedProperties = ThingHelper.allUsedProperties(thing);
    final Function1<Property, Boolean> _function = (Property p) -> {
      boolean _isDefined = AnnotatedElementHelper.isDefined(p, "ignore", "not-used");
      return Boolean.valueOf((!_isDefined));
    };
    final Procedure2<Property, Integer> _function_1 = (Property p, Integer i) -> {
      final boolean isUsed = usedProperties.contains(p);
      if ((!isUsed)) {
        String _name = p.getName();
        String _plus = ("Property " + _name);
        String _plus_1 = (_plus + " of Thing ");
        String _name_1 = thing.getName();
        String _plus_2 = (_plus_1 + _name_1);
        final String msg = (_plus_2 + " is never used. Consider removing (or using) it, or use @ignore \"not-used\".");
        this.warning(msg, p, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "property-not-used");
      }
    };
    IterableExtensions.<Property>forEach(IterableExtensions.<Property>filter(ThingHelper.allPropertiesInDepth(thing), _function), _function_1);
  }
}
