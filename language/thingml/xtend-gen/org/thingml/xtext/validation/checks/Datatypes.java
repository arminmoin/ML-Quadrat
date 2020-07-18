package org.thingml.xtext.validation.checks;

import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.thingML.PrimitiveType;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Type;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class Datatypes extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkDatatypeUniqueness(final PrimitiveType t) {
    final ThingMLModel model = ThingMLHelpers.findContainingModel(t);
    final Function1<Type, Boolean> _function = (Type ty) -> {
      return Boolean.valueOf((((ty instanceof PrimitiveType) && (ty != t)) && Objects.equal(ty.getName(), t.getName())));
    };
    final Iterable<Type> duplicates = IterableExtensions.<Type>filter(ThingMLHelpers.allSimpleTypes(model), _function);
    int _size = IterableExtensions.size(duplicates);
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _name = t.getName();
      String _plus = ("Datatype " + _name);
      final String msg = (_plus + " is duplicated.");
      this.error(msg, model, ThingMLPackage.eINSTANCE.getThingMLModel_Types(), model.getTypes().indexOf(t), "duplicate-datatype");
    }
  }
}
