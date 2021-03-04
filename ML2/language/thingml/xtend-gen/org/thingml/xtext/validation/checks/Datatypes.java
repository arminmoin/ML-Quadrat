/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
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
