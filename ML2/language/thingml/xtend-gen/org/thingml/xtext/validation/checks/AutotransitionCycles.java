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

import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.thingml.xtext.thingML.StateContainer;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.Tarjan;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class AutotransitionCycles extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkAutotransitionCycles(final StateContainer c) {
    final HashSet<org.thingml.xtext.thingML.State> verts = CollectionLiterals.<org.thingml.xtext.thingML.State>newHashSet();
    verts.addAll(c.getSubstate());
    final Tarjan<org.thingml.xtext.thingML.State> tarjan = new Tarjan<org.thingml.xtext.thingML.State>(null, verts);
    final List<List<org.thingml.xtext.thingML.State>> cycles = tarjan.findStronglyConnectedComponents();
    final Consumer<List<org.thingml.xtext.thingML.State>> _function = (List<org.thingml.xtext.thingML.State> cycle) -> {
      if (((cycle != null) && (cycle.size() > 1))) {
        final Function1<org.thingml.xtext.thingML.State, CharSequence> _function_1 = (org.thingml.xtext.thingML.State it) -> {
          return it.getName();
        };
        final String msg = IterableExtensions.<org.thingml.xtext.thingML.State>join(cycle, "Auto transition cycle: (", ", ", ")", _function_1);
        final Consumer<org.thingml.xtext.thingML.State> _function_2 = (org.thingml.xtext.thingML.State state) -> {
          this.error(msg, c, ThingMLPackage.eINSTANCE.getStateContainer_Substate(), c.getSubstate().indexOf(state), "autotransition-cycle");
        };
        cycle.forEach(_function_2);
      }
    };
    cycles.forEach(_function);
  }
}
