package org.thingml.xtext.validation.checks;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class ThingsUsage extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkInstance(final Instance i) {
    boolean _isFragment = i.getType().isFragment();
    if (_isFragment) {
      String _name = i.getName();
      String _plus = ("Instance " + _name);
      String _plus_1 = (_plus + " instantiate thing fragment ");
      String _name_1 = i.getType().getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + 
        ". Make thing ");
      String _name_2 = i.getType().getName();
      String _plus_4 = (_plus_3 + _name_2);
      final String msg = (_plus_4 + " concrete (not a fragment) if you want to instantiate it.");
      EObject _eContainer = i.eContainer();
      this.error(msg, i.eContainer(), i.eContainingFeature(), ((Configuration) _eContainer).getInstances().indexOf(i), "fragment-instanciation", i.getName());
    }
  }
  
  @Check(CheckType.FAST)
  public void checkInstanceUniqueness(final Instance i) {
    EObject _eContainer = i.eContainer();
    final Configuration cfg = ((Configuration) _eContainer);
    final Function1<Instance, Boolean> _function = (Instance i2) -> {
      String _name = i2.getName();
      String _name_1 = i.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final Iterable<Instance> instances = IterableExtensions.<Instance>filter(cfg.getInstances(), _function);
    int _size = IterableExtensions.size(instances);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = i.getName();
      String _plus = ("Instance " + _name);
      final String msg = (_plus + " is duplicated.");
      this.error(msg, cfg, ThingMLPackage.eINSTANCE.getConfiguration_Instances(), cfg.getInstances().indexOf(i), "duplicate-instance");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyUniqueness(final Property p) {
    final Thing thing = ThingMLHelpers.findContainingThing(p);
    final Function1<Property, Boolean> _function = (Property pr) -> {
      String _name = pr.getName();
      String _name_1 = p.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final Iterable<Property> props = IterableExtensions.<Property>filter(ThingMLHelpers.allProperties(thing), _function);
    int _size = IterableExtensions.size(props);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = p.getName();
      String _plus = ("Property " + _name);
      String _plus_1 = (_plus + " of Thing ");
      String _name_1 = thing.getName();
      String _plus_2 = (_plus_1 + _name_1);
      final String msg = (_plus_2 + 
        " is duplicated (possibly from an included thing).");
      this.error(msg, thing, ThingMLPackage.eINSTANCE.getThing_Properties(), thing.getProperties().indexOf(p), "duplicate-property");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkMessageUniqueness(final Message m) {
    final Thing thing = ThingMLHelpers.findContainingThing(m);
    final Function1<Message, Boolean> _function = (Message m2) -> {
      String _name = m2.getName();
      String _name_1 = m.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final Iterable<Message> msgs = IterableExtensions.<Message>filter(ThingMLHelpers.allMessages(thing), _function);
    int _size = IterableExtensions.size(msgs);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = m.getName();
      String _plus = ("Message " + _name);
      String _plus_1 = (_plus + " of Thing ");
      String _name_1 = thing.getName();
      String _plus_2 = (_plus_1 + _name_1);
      final String msg = (_plus_2 + 
        " is duplicated (possibly from an included thing).");
      this.error(msg, thing, ThingMLPackage.eINSTANCE.getThing_Messages(), thing.getMessages().indexOf(m), "duplicate-message");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPortUniqueness(final Port p) {
    final Thing thing = ThingMLHelpers.findContainingThing(p);
    final Function1<Port, Boolean> _function = (Port p2) -> {
      String _name = p2.getName();
      String _name_1 = p.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    final Iterable<Port> ports = IterableExtensions.<Port>filter(ThingMLHelpers.allPorts(thing), _function);
    int _size = IterableExtensions.size(ports);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = p.getName();
      String _plus = ("Port " + _name);
      String _plus_1 = (_plus + " of Thing ");
      String _name_1 = thing.getName();
      String _plus_2 = (_plus_1 + _name_1);
      final String msg = (_plus_2 + 
        " is duplicated (possibly from an included thing).");
      this.error(msg, thing, ThingMLPackage.eINSTANCE.getThing_Ports(), thing.getPorts().indexOf(p), "duplicate-port");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkFunctionUniqueness(final Function f) {
    final Thing thing = ThingMLHelpers.findContainingThing(f);
    final Function1<Function, Boolean> _function = (Function f2) -> {
      return Boolean.valueOf(((f2.isAbstract() == f.isAbstract()) && Objects.equal(f2.getName(), f.getName())));
    };
    final Iterable<Function> funcs = IterableExtensions.<Function>filter(ThingMLHelpers.allFunctions(thing), _function);
    int _size = IterableExtensions.size(funcs);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      String _name = f.getName();
      String _plus = ("Function " + _name);
      String _plus_1 = (_plus + " of Thing ");
      String _name_1 = thing.getName();
      String _plus_2 = (_plus_1 + _name_1);
      final String msg = (_plus_2 + 
        " is duplicated (possibly from an included thing).");
      this.error(msg, thing, ThingMLPackage.eINSTANCE.getThing_Functions(), thing.getFunctions().indexOf(f), "duplicate-function");
    }
  }
}
