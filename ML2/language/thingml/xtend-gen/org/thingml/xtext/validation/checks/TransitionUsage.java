package org.thingml.xtext.validation.checks;

import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.helpers.ThingMLElementHelper;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.Event;
import org.thingml.xtext.thingML.InternalTransition;
import org.thingml.xtext.thingML.ReceiveMessage;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Transition;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class TransitionUsage extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkNonDeterministicTransition(final org.thingml.xtext.thingML.State s) {
    final Consumer<Transition> _function = (Transition t1) -> {
      final Consumer<Transition> _function_1 = (Transition t2) -> {
        if ((t1 != t2)) {
          if ((EcoreUtil.equals(t1.getEvent(), t2.getEvent()) && ((t1.getGuard() == null) || (t2.getGuard() == null)))) {
            String event = ThingMLElementHelper.getName(t1.getEvent());
            Event _event = t1.getEvent();
            if ((_event instanceof ReceiveMessage)) {
              Event _event_1 = t1.getEvent();
              final ReceiveMessage e = ((ReceiveMessage) _event_1);
              String _name = e.getPort().getName();
              String _plus = (_name + "?");
              String _name_1 = e.getMessage().getName();
              String _plus_1 = (_plus + _name_1);
              event = _plus_1;
            }
            final String msg = (("Non deterministic behaviour: Two transitions handling " + event) + 
              ", with at least one without a guard");
            this.error(msg, s, ThingMLPackage.eINSTANCE.getState_Outgoing(), s.getOutgoing().indexOf(t1), "nondeterministic-multiple-handlers");
          }
        }
      };
      s.getOutgoing().forEach(_function_1);
    };
    s.getOutgoing().forEach(_function);
  }
  
  @Check(CheckType.FAST)
  public void checkGreedyTransition(final org.thingml.xtext.thingML.State s) {
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      return Boolean.valueOf(((t.getEvent() == null) && (t.getGuard() == null)));
    };
    final Transition t = IterableExtensions.<Transition>findFirst(s.getOutgoing(), _function);
    if (((t != null) && (s.getOutgoing().size() > 1))) {
      String _name = t.getTarget().getName();
      String _plus = ("Transition -> " + _name);
      final String msg = (_plus + 
        " with no guard and no event always takes precedence over all the other transitions");
      this.warning(msg, s, ThingMLPackage.eINSTANCE.getState_Outgoing(), s.getOutgoing().indexOf(t), "greedy-transition");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkEmptyAutotransition(final Transition t) {
    final org.thingml.xtext.thingML.State source = ThingMLHelpers.findContainingState(t);
    if ((((t.getEvent() == null) && (t.getGuard() == null)) && Objects.equal(t.getTarget(), source))) {
      final String msg = "Self Transition without guard and without event. Will loop forever.";
      EObject _eContainer = t.eContainer();
      this.error(msg, t.eContainer(), ThingMLPackage.eINSTANCE.getState_Outgoing(), ((org.thingml.xtext.thingML.State) _eContainer).getInternal().indexOf(t), "self-transition-loop");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkEmptyInternal(final InternalTransition t) {
    if (((t.getEvent() == null) && (t.getGuard() == null))) {
      final String msg = "Internal Transition without guard and without event. Will loop forever.";
      EObject _eContainer = t.eContainer();
      this.error(msg, t.eContainer(), ThingMLPackage.eINSTANCE.getState_Internal(), ((org.thingml.xtext.thingML.State) _eContainer).getInternal().indexOf(t), "internal-transition-loop");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkInternalWithoutAction(final InternalTransition t) {
    Action _action = t.getAction();
    boolean _tripleEquals = (_action == null);
    if (_tripleEquals) {
      final String msg = "Internal Transition without action, consider removing.";
      EObject _eContainer = t.eContainer();
      this.warning(msg, t.eContainer(), ThingMLPackage.eINSTANCE.getState_Internal(), ((org.thingml.xtext.thingML.State) _eContainer).getInternal().indexOf(t), "internal-transition-no-action");
    }
  }
}
