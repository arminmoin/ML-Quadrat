package org.thingml.xtext.validation.checks;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.thingML.Import;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class Imports extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkImports(final ThingMLModel model) {
    final Procedure2<Import, Integer> _function = (Import imp, Integer i) -> {
      try {
        ThingMLHelpers.getModelFromRelativeURI(ThingMLHelpers.findContainingModel(imp), imp.getImportURI(), imp.getFrom());
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.error(e.getMessage(), model, ThingMLPackage.eINSTANCE.getThingMLModel_Imports(), (i).intValue());
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    };
    IterableExtensions.<Import>forEach(model.getImports(), _function);
  }
}
