package org.thingml.xtext.validation.checks;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.constraints.Types;
import org.thingml.xtext.helpers.TyperHelper;
import org.thingml.xtext.thingML.ArrayInit;
import org.thingml.xtext.thingML.CastExpression;
import org.thingml.xtext.thingML.ConfigPropertyAssign;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Enumeration;
import org.thingml.xtext.thingML.EnumerationLiteral;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.Literal;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyAssign;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.thingML.UnaryMinus;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xtext.validation.ThingMLValidatorCheck;
import org.thingml.xtext.validation.TypeChecker;

@SuppressWarnings("all")
public class PropertyInitialization extends ThingMLValidatorCheck {
  public Set<Property> getUninitializedProperties(final Thing t) {
    final HashSet<Property> props = CollectionLiterals.<Property>newHashSet();
    final Consumer<Property> _function = (Property prop) -> {
      Expression _init = prop.getInit();
      boolean _tripleEquals = (_init == null);
      if (_tripleEquals) {
        props.add(prop);
      }
    };
    t.getProperties().forEach(_function);
    final Consumer<Thing> _function_1 = (Thing inc) -> {
      props.addAll(this.getUninitializedProperties(inc));
    };
    t.getIncludes().forEach(_function_1);
    final Consumer<PropertyAssign> _function_2 = (PropertyAssign propAssign) -> {
      final Predicate<Property> _function_3 = (Property prop) -> {
        Property _property = propAssign.getProperty();
        return (prop == _property);
      };
      props.removeIf(_function_3);
    };
    t.getAssign().forEach(_function_2);
    return props;
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyAssign(final PropertyAssign pa) {
    boolean _isIsArray = pa.getProperty().getTypeRef().isIsArray();
    if (_isIsArray) {
      final TypeRef tr = TyperHelper.getBroadType(TypeChecker.computeTypeOf(pa.getInit()));
      if (((pa.getIndex() == null) && (!tr.isIsArray()))) {
        String _name = pa.getProperty().getName();
        String _plus = ("Property " + _name);
        final String msg = (_plus + " is an array, and can only be assigned with an array initialiser, or indexed set statements.");
        EObject _eContainer = pa.eContainer();
        EObject _eContainer_1 = pa.eContainer();
        this.error(msg, ((Thing) _eContainer), ThingMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_1).getAssign().indexOf(pa));
        return;
      }
    }
    if (((!pa.getProperty().getTypeRef().isIsArray()) && (pa.getIndex() != null))) {
      String _name_1 = pa.getProperty().getName();
      String _plus_1 = ("Property " + _name_1);
      final String msg_1 = (_plus_1 + " is not an array.");
      EObject _eContainer_2 = pa.eContainer();
      EObject _eContainer_3 = pa.eContainer();
      this.error(msg_1, ((Thing) _eContainer_2), ThingMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_3).getAssign().indexOf(pa));
      return;
    }
    final TypeRef pt = Types.getTypeRef(TyperHelper.getBroadType(pa.getProperty().getTypeRef()), false);
    final TypeRef vt = Types.getTypeRef(TypeChecker.computeTypeOf(pa.getInit()), false);
    boolean _isA = TyperHelper.isA(vt, pt);
    boolean _not = (!_isA);
    if (_not) {
      String _string = Types.toString(pt);
      String _plus_2 = ("Wrong type. Expected " + _string);
      String _plus_3 = (_plus_2 + ". Found ");
      String _string_1 = Types.toString(vt);
      final String msg_2 = (_plus_3 + _string_1);
      EObject _eContainer_4 = pa.eContainer();
      EObject _eContainer_5 = pa.eContainer();
      this.error(msg_2, ((Thing) _eContainer_4), ThingMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_5).getAssign().indexOf(pa));
    }
    Expression _index = pa.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      final TypeRef indexT = TypeChecker.computeTypeOf(pa.getIndex());
      boolean _isA_1 = TyperHelper.isA(indexT, Types.INTEGER_TYPEREF);
      boolean _not_1 = (!_isA_1);
      if (_not_1) {
        String _string_2 = Types.toString(indexT);
        final String msg_3 = ("Index must be an integer. Found " + _string_2);
        EObject _eContainer_6 = pa.eContainer();
        EObject _eContainer_7 = pa.eContainer();
        this.error(msg_3, ((Thing) _eContainer_6), ThingMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_7).getAssign().indexOf(pa));
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyAssign(final ConfigPropertyAssign pa) {
    final TypeRef tr = TyperHelper.getBroadType(TypeChecker.computeTypeOf(pa.getInit()));
    if ((pa.getProperty().getTypeRef().isIsArray() && ((pa.getIndex() == null) && (!tr.isIsArray())))) {
      String _name = pa.getProperty().getName();
      String _plus = ("Property " + _name);
      final String msg = (_plus + " is an array, and can only be assigned with an array initialiser, or indexed set statements.");
      EObject _eContainer = pa.eContainer();
      EObject _eContainer_1 = pa.eContainer();
      this.error(msg, ((Configuration) _eContainer), ThingMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_1).getPropassigns().indexOf(pa));
      return;
    }
    if (((pa.getProperty().getTypeRef().getCardinality() == null) && (pa.getIndex() != null))) {
      String _name_1 = pa.getProperty().getName();
      String _plus_1 = ("Property " + _name_1);
      final String msg_1 = (_plus_1 + " is not an array.");
      EObject _eContainer_2 = pa.eContainer();
      EObject _eContainer_3 = pa.eContainer();
      this.error(msg_1, ((Configuration) _eContainer_2), ThingMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_3).getPropassigns().indexOf(pa));
      return;
    }
    final TypeRef pt = Types.getTypeRef(TyperHelper.getBroadType(pa.getProperty().getTypeRef()), false);
    final TypeRef vt = Types.getTypeRef(TypeChecker.computeTypeOf(pa.getInit()), false);
    boolean _isA = TyperHelper.isA(vt, pt);
    boolean _not = (!_isA);
    if (_not) {
      String _string = Types.toString(pt);
      String _plus_2 = ("Wrong type. Expected " + _string);
      String _plus_3 = (_plus_2 + ". Found ");
      String _string_1 = Types.toString(vt);
      final String msg_2 = (_plus_3 + _string_1);
      EObject _eContainer_4 = pa.eContainer();
      EObject _eContainer_5 = pa.eContainer();
      this.error(msg_2, ((Configuration) _eContainer_4), ThingMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_5).getPropassigns().indexOf(pa));
    }
    Expression _index = pa.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      final TypeRef indexT = TypeChecker.computeTypeOf(pa.getIndex());
      boolean _isA_1 = TyperHelper.isA(indexT, Types.INTEGER_TYPEREF);
      boolean _not_1 = (!_isA_1);
      if (_not_1) {
        String _string_2 = Types.toString(indexT);
        final String msg_3 = ("Index must be an integer. Found " + _string_2);
        EObject _eContainer_6 = pa.eContainer();
        EObject _eContainer_7 = pa.eContainer();
        this.error(msg_3, ((Configuration) _eContainer_6), ThingMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_7).getPropassigns().indexOf(pa));
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyInitialization(final Configuration cfg) {
    final Procedure2<Instance, Integer> _function = (Instance inst, Integer i) -> {
      final Function1<Property, Boolean> _function_1 = (Property p) -> {
        return Boolean.valueOf(p.isReadonly());
      };
      final Set<Property> props = IterableExtensions.<Property>toSet(IterableExtensions.<Property>filter(this.getUninitializedProperties(inst.getType()), _function_1));
      final Consumer<ConfigPropertyAssign> _function_2 = (ConfigPropertyAssign propAssign) -> {
        final Predicate<Property> _function_3 = (Property prop) -> {
          Property _property = propAssign.getProperty();
          return (prop == _property);
        };
        props.removeIf(_function_3);
      };
      cfg.getPropassigns().forEach(_function_2);
      boolean _isEmpty = props.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Function1<Property, CharSequence> _function_3 = (Property it) -> {
          return it.getName();
        };
        final String msg = IterableExtensions.<Property>join(props, "Properties (", ", ", ") are not initialized", _function_3);
        this.error(msg, cfg, ThingMLPackage.eINSTANCE.getConfiguration_Instances(), (i).intValue(), "properties-not-initialized");
      }
    };
    IterableExtensions.<Instance>forEach(cfg.getInstances(), _function);
  }
  
  @Check(CheckType.FAST)
  public void checkArray(final Variable p) {
    Expression _cardinality = p.getTypeRef().getCardinality();
    boolean _tripleNotEquals = (_cardinality != null);
    if (_tripleNotEquals) {
      Expression _cardinality_1 = p.getTypeRef().getCardinality();
      if ((_cardinality_1 instanceof PropertyReference)) {
        Expression _cardinality_2 = p.getTypeRef().getCardinality();
        final Variable prop = ((PropertyReference) _cardinality_2).getProperty();
        boolean isReadonly = false;
        if ((prop instanceof Property)) {
          isReadonly = ((Property) prop).isReadonly();
        } else {
          if ((prop instanceof LocalVariable)) {
            isReadonly = ((LocalVariable) prop).isReadonly();
          }
        }
        if ((!isReadonly)) {
          String _name = prop.getName();
          String _plus = ("Array cardinality must be an integer literal or a read-only property/variable. Variable " + _name);
          final String msg = (_plus + " is not read-only.");
          this.error(msg, p, ThingMLPackage.eINSTANCE.getNamedElement_Name());
        }
        final TypeRef actualType = TyperHelper.getBroadType(prop.getTypeRef());
        boolean _isA = TyperHelper.isA(actualType, Types.INTEGER_TYPEREF);
        boolean _not = (!_isA);
        if (_not) {
          String _name_1 = prop.getName();
          String _plus_1 = ("Array cardinality must resolve to Integer. Property/Variable " + _name_1);
          String _plus_2 = (_plus_1 + " is ");
          String _string = Types.toString(actualType);
          String _plus_3 = (_plus_2 + _string);
          final String msg_1 = (_plus_3 + ".");
          this.error(msg_1, p, ThingMLPackage.eINSTANCE.getNamedElement_Name());
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkEnumInitialization(final Enumeration e) {
    TypeRef _typeRef = e.getTypeRef();
    boolean _tripleNotEquals = (_typeRef != null);
    if (_tripleNotEquals) {
      final Function1<EnumerationLiteral, Boolean> _function = (EnumerationLiteral l) -> {
        Literal _init = l.getInit();
        return Boolean.valueOf((_init == null));
      };
      boolean _exists = IterableExtensions.<EnumerationLiteral>exists(e.getLiterals(), _function);
      if (_exists) {
        String _name = e.getName();
        String _plus = ("Enumeration " + _name);
        final String msg = (_plus + " is typed. All literals must be initialized.");
        ThingMLModel _findContainingModel = ThingMLHelpers.findContainingModel(e);
        this.error(msg, ThingMLHelpers.findContainingModel(e), ThingMLPackage.eINSTANCE.getThingMLModel_Types(), ((ThingMLModel) _findContainingModel).getTypes().indexOf(e));
      }
      final Procedure2<EnumerationLiteral, Integer> _function_1 = (EnumerationLiteral l, Integer i) -> {
        Literal _init = l.getInit();
        boolean _tripleNotEquals_1 = (_init != null);
        if (_tripleNotEquals_1) {
          final TypeRef litType = TypeChecker.computeTypeOf(l.getInit());
          boolean _isA = TyperHelper.isA(litType, e.getTypeRef());
          boolean _not = (!_isA);
          if (_not) {
            String _name_1 = l.getName();
            String _plus_1 = ("Literal " + _name_1);
            String _plus_2 = (_plus_1 + " must be of type ");
            String _name_2 = TyperHelper.getBroadType(e.getTypeRef()).getType().getName();
            String _plus_3 = (_plus_2 + _name_2);
            String _plus_4 = (_plus_3 + ". Found ");
            String _string = Types.toString(TyperHelper.getBroadType(litType));
            final String msg_1 = (_plus_4 + _string);
            this.error(msg_1, e, ThingMLPackage.eINSTANCE.getEnumeration_Literals(), (i).intValue());
          }
        }
      };
      IterableExtensions.<EnumerationLiteral>forEach(e.getLiterals(), _function_1);
    }
  }
  
  public boolean isLiteralOrReadOnly(final Expression e) {
    if ((e instanceof Literal)) {
      return true;
    } else {
      if ((e instanceof PropertyReference)) {
        final PropertyReference pr = ((PropertyReference) e);
        Variable _property = pr.getProperty();
        if ((_property instanceof Property)) {
          Variable _property_1 = pr.getProperty();
          return ((Property) _property_1).isReadonly();
        } else {
          Variable _property_2 = pr.getProperty();
          if ((_property_2 instanceof LocalVariable)) {
            Variable _property_3 = pr.getProperty();
            return ((LocalVariable) _property_3).isReadonly();
          }
        }
      } else {
        if ((e instanceof UnaryMinus)) {
          final UnaryMinus um = ((UnaryMinus) e);
          return this.isLiteralOrReadOnly(um.getTerm());
        } else {
          if ((e instanceof CastExpression)) {
            final CastExpression cast = ((CastExpression) e);
            return this.isLiteralOrReadOnly(cast.getTerm());
          }
        }
      }
    }
    return false;
  }
  
  @Check(CheckType.FAST)
  public void checkArrayInit(final ArrayInit ai) {
    final Procedure2<Expression, Integer> _function = (Expression e, Integer i) -> {
      boolean _isLiteralOrReadOnly = this.isLiteralOrReadOnly(e);
      boolean _not = (!_isLiteralOrReadOnly);
      if (_not) {
        final String msg = "Arrays can only be initialized with (cast to) literals or references to read-only properties.";
        this.error(msg, ai, ThingMLPackage.eINSTANCE.getArrayInit_Values(), (i).intValue());
      }
    };
    IterableExtensions.<Expression>forEach(ai.getValues(), _function);
  }
}
