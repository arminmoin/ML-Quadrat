package org.thingml.xtext.validation.checks;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.FinalState;
import org.thingml.xtext.thingML.Region;
import org.thingml.xtext.thingML.Session;
import org.thingml.xtext.thingML.StateContainer;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Transition;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class StateUsage extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void chectStateUniqueness(final org.thingml.xtext.thingML.State s) {
    EObject _eContainer = s.eContainer();
    if ((_eContainer instanceof StateContainer)) {
      EObject _eContainer_1 = s.eContainer();
      final StateContainer c = ((StateContainer) _eContainer_1);
      final Function1<org.thingml.xtext.thingML.State, Boolean> _function = (org.thingml.xtext.thingML.State s2) -> {
        String _name = s2.getName();
        String _name_1 = s.getName();
        return Boolean.valueOf(Objects.equal(_name, _name_1));
      };
      final Iterable<org.thingml.xtext.thingML.State> states = IterableExtensions.<org.thingml.xtext.thingML.State>filter(c.getSubstate(), _function);
      int _size = IterableExtensions.size(states);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _name = s.getName();
        String _plus = ("State " + _name);
        final String msg = (_plus + " is duplicated.");
        this.error(msg, c, ThingMLPackage.eINSTANCE.getStateContainer_Substate(), c.getSubstate().indexOf(s), 
          "duplicate-state");
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkSessionUniqueness(final Session s) {
    EObject _eContainer = s.eContainer();
    final CompositeState c = ((CompositeState) _eContainer);
    final Function1<Session, Boolean> _function = (Session s2) -> {
      String _name = s2.getName();
      String _name_1 = s.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final Iterable<Session> sessions = IterableExtensions.<Session>filter(c.getSession(), _function);
    int _size = IterableExtensions.size(sessions);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = s.getName();
      String _plus = ("Session " + _name);
      final String msg = (_plus + " is duplicated.");
      this.error(msg, c, ThingMLPackage.eINSTANCE.getCompositeState_Session(), c.getSubstate().indexOf(s), "duplicate-session");
    }
  }
  
  @Check(CheckType.FAST)
  public void chectRegionUniqueness(final Region r) {
    EObject _eContainer = r.eContainer();
    final CompositeState c = ((CompositeState) _eContainer);
    final Function1<Region, Boolean> _function = (Region r2) -> {
      String _name = r2.getName();
      String _name_1 = r.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final Iterable<Region> regions = IterableExtensions.<Region>filter(c.getRegion(), _function);
    int _size = IterableExtensions.size(regions);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = r.getName();
      String _plus = ("Region " + _name);
      final String msg = (_plus + " is duplicated.");
      this.error(msg, c, ThingMLPackage.eINSTANCE.getCompositeState_Region(), c.getRegion().indexOf(r), "duplicate-region");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkUnreachableState(final StateContainer sc) {
    final Procedure2<org.thingml.xtext.thingML.State, Integer> _function = (org.thingml.xtext.thingML.State s, Integer i) -> {
      org.thingml.xtext.thingML.State _initial = sc.getInitial();
      boolean _tripleEquals = (_initial == s);
      if (_tripleEquals) {
        return;
      }
      final Function1<org.thingml.xtext.thingML.State, Boolean> _function_1 = (org.thingml.xtext.thingML.State st) -> {
        final Function1<Transition, Boolean> _function_2 = (Transition t) -> {
          org.thingml.xtext.thingML.State _target = t.getTarget();
          return Boolean.valueOf(Objects.equal(_target, s));
        };
        return Boolean.valueOf(IterableExtensions.<Transition>exists(st.getOutgoing(), _function_2));
      };
      final boolean isReachable = IterableExtensions.<org.thingml.xtext.thingML.State>exists(sc.getSubstate(), _function_1);
      if ((!isReachable)) {
        String _name = s.getName();
        String _plus = ("State " + _name);
        String _plus_1 = (_plus + " is unreachable");
        this.warning(_plus_1, sc, ThingMLPackage.eINSTANCE.getStateContainer_Substate(), (i).intValue(), 
          "state-unreachable", s.getName());
      }
    };
    IterableExtensions.<org.thingml.xtext.thingML.State>forEach(sc.getSubstate(), _function);
  }
  
  @Check(CheckType.FAST)
  public void checkSinkState(final CompositeState c) {
    boolean _isEmpty = c.getInternal().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      return;
    }
    boolean _isEmpty_1 = c.getOutgoing().isEmpty();
    boolean _not_1 = (!_isEmpty_1);
    if (_not_1) {
      return;
    }
    boolean _isDefined = AnnotatedElementHelper.isDefined(c, "ignore", "sink");
    if (_isDefined) {
      return;
    }
    final Procedure2<org.thingml.xtext.thingML.State, Integer> _function = (org.thingml.xtext.thingML.State s, Integer i) -> {
      if ((s instanceof CompositeState)) {
        return;
      }
      boolean _isEmpty_2 = s.getInternal().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        return;
      }
      boolean _isEmpty_3 = s.getOutgoing().isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        return;
      }
      if ((s instanceof FinalState)) {
        return;
      }
      boolean _isDefined_1 = AnnotatedElementHelper.isDefined(s, "ignore", "sink");
      if (_isDefined_1) {
        return;
      }
      String _name = s.getName();
      String _plus = ("State " + _name);
      String _plus_1 = (_plus + " is a sink state. Consider making it final or use @ignore \"sink\"");
      this.warning(_plus_1, s, ThingMLPackage.eINSTANCE.getNamedElement_Name(), "state-sink", s.getName());
    };
    IterableExtensions.<org.thingml.xtext.thingML.State>forEach(c.getSubstate(), _function);
  }
}
