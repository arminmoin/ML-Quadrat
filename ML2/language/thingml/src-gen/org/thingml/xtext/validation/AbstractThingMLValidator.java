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
package org.thingml.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;
import org.thingml.xtext.validation.checks.Annotations;
import org.thingml.xtext.validation.checks.AutotransitionCycles;
import org.thingml.xtext.validation.checks.ControlStructures;
import org.thingml.xtext.validation.checks.Datatypes;
import org.thingml.xtext.validation.checks.FunctionUsage;
import org.thingml.xtext.validation.checks.Imports;
import org.thingml.xtext.validation.checks.LostMessages;
import org.thingml.xtext.validation.checks.MessageUsage;
import org.thingml.xtext.validation.checks.PortsUsage;
import org.thingml.xtext.validation.checks.PropertyInitialization;
import org.thingml.xtext.validation.checks.StateUsage;
import org.thingml.xtext.validation.checks.ThingsUsage;
import org.thingml.xtext.validation.checks.TransitionUsage;
import org.thingml.xtext.validation.checks.VariableUsage;

@ComposedChecks(validators = {FunctionUsage.class, VariableUsage.class, ThingsUsage.class, StateUsage.class, TransitionUsage.class, MessageUsage.class, AutotransitionCycles.class, PortsUsage.class, ControlStructures.class, LostMessages.class, PropertyInitialization.class, Imports.class, Datatypes.class, Annotations.class})
public abstract class AbstractThingMLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.thingml.xtext.thingML.ThingMLPackage.eINSTANCE);
		return result;
	}
}
