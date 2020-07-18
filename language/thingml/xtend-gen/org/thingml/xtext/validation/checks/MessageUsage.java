package org.thingml.xtext.validation.checks;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.constraints.Types;
import org.thingml.xtext.helpers.ActionHelper;
import org.thingml.xtext.helpers.StateHelper;
import org.thingml.xtext.helpers.TyperHelper;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.Handler;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.validation.ThingMLValidatorCheck;
import org.thingml.xtext.validation.TypeChecker;

@SuppressWarnings("all")
public class MessageUsage extends ThingMLValidatorCheck {
  public boolean isSerializable(final Message m) {
    final Function1<Parameter, Boolean> _function = (Parameter p) -> {
      return Boolean.valueOf((((p.getTypeRef() != null) && (p.getTypeRef().getType() != null)) && TyperHelper.isSerializable(p.getTypeRef().getType())));
    };
    return IterableExtensions.<Parameter>forall(m.getParameters(), _function);
  }
  
  @Check(CheckType.FAST)
  public void checkSerialization(final ExternalConnector c) {
    final Function1<Message, Boolean> _function = (Message m) -> {
      boolean _isSerializable = this.isSerializable(m);
      return Boolean.valueOf((!_isSerializable));
    };
    final Set<Message> nonSerializable = IterableExtensions.<Message>toSet(IterableExtensions.<Message>filter(c.getPort().getReceives(), _function));
    final Function1<Message, Boolean> _function_1 = (Message m) -> {
      boolean _isSerializable = this.isSerializable(m);
      return Boolean.valueOf((!_isSerializable));
    };
    Iterables.<Message>addAll(nonSerializable, IterableExtensions.<Message>filter(c.getPort().getSends(), _function_1));
    int _size = nonSerializable.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final Function1<Message, CharSequence> _function_2 = (Message it) -> {
        return it.getName();
      };
      final String msg = IterableExtensions.<Message>join(nonSerializable, "Message(s) ", ", ", " is/are not serializable and cannot be used on an external connector ", _function_2);
      EObject _eContainer = c.eContainer();
      this.error(msg, c.eContainer(), ThingMLPackage.eINSTANCE.getConfiguration_Connectors(), ((Configuration) _eContainer).getConnectors().indexOf(c), "serialization");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkMessageNotSent(final Thing thing) {
    boolean _isFragment = thing.isFragment();
    if (_isFragment) {
      return;
    }
    final List<SendAction> allSendActions = ActionHelper.<SendAction>getAllActions(thing, SendAction.class);
    final Consumer<Port> _function = (Port p) -> {
      final Procedure2<Message, Integer> _function_1 = (Message m, Integer i) -> {
        final Function1<SendAction, Boolean> _function_2 = (SendAction sa) -> {
          return Boolean.valueOf(((sa.getPort() == p) && (sa.getMessage() == m)));
        };
        final boolean isSent = IterableExtensions.<SendAction>exists(allSendActions, _function_2);
        if ((!isSent)) {
          String _name = p.getName();
          String _plus = ("Message " + _name);
          String _plus_1 = (_plus + ".");
          String _name_1 = m.getName();
          String _plus_2 = (_plus_1 + _name_1);
          final String msg = (_plus_2 + " is never sent");
          final Thing t = ThingMLHelpers.findContainingThing(p);
          boolean _equals = Objects.equal(t, thing);
          if (_equals) {
            this.warning(msg, p, ThingMLPackage.eINSTANCE.getPort_Sends(), (i).intValue(), "message-never-sent");
          } else {
            this.warning(msg, thing, ThingMLPackage.eINSTANCE.getThing_Includes(), thing.getIncludes().indexOf(t), "included-messages-never-sent");
          }
        }
      };
      IterableExtensions.<Message>forEach(p.getSends(), _function_1);
    };
    ThingMLHelpers.allPorts(thing).forEach(_function);
  }
  
  @Check(CheckType.FAST)
  public void checkMessageNotReceived(final Thing thing) {
    boolean _isFragment = thing.isFragment();
    if (_isFragment) {
      return;
    }
    final Map<Port, Map<Message, List<Handler>>> handlers = StateHelper.allMessageHandlers(thing);
    final Consumer<Port> _function = (Port p) -> {
      final Procedure2<Message, Integer> _function_1 = (Message m, Integer i) -> {
        if (((handlers.get(p) == null) || (handlers.get(p).get(m) == null))) {
          String _name = p.getName();
          String _plus = ("Message " + _name);
          String _plus_1 = (_plus + ".");
          String _name_1 = m.getName();
          String _plus_2 = (_plus_1 + _name_1);
          final String msg = (_plus_2 + " is never received");
          final Thing t = ThingMLHelpers.findContainingThing(p);
          boolean _equals = Objects.equal(t, thing);
          if (_equals) {
            this.warning(msg, p, ThingMLPackage.eINSTANCE.getPort_Receives(), (i).intValue(), "message-never-used");
          } else {
            this.warning(msg, thing, ThingMLPackage.eINSTANCE.getThing_Includes(), thing.getIncludes().indexOf(t), "included-messages-never-used");
          }
        }
      };
      IterableExtensions.<Message>forEach(p.getReceives(), _function_1);
    };
    ThingMLHelpers.allPorts(thing).forEach(_function);
  }
  
  @Check(CheckType.FAST)
  public void checkSendAction(final SendAction send) {
    final Message msg = send.getMessage();
    final EList<Expression> params = send.getParameters();
    final Object parent = send.eContainer().eGet(send.eContainingFeature());
    int _size = msg.getParameters().size();
    int _size_1 = params.size();
    boolean _tripleNotEquals = (_size != _size_1);
    if (_tripleNotEquals) {
      String _name = msg.getName();
      String _plus = ("Message " + _name);
      String _plus_1 = (_plus + " is sent with a wrong number of parameters. Expected ");
      int _size_2 = msg.getParameters().size();
      String _plus_2 = (_plus_1 + Integer.valueOf(_size_2));
      String _plus_3 = (_plus_2 + ", sent with ");
      int _size_3 = params.size();
      final String m = (_plus_3 + Integer.valueOf(_size_3));
      if ((parent instanceof EList)) {
        this.error(m, send.eContainer(), send.eContainingFeature(), ((EList) parent).indexOf(send), "message-send-wrong-number-parameters");
      } else {
        this.error(m, send.eContainer(), send.eContainingFeature(), "message-send-wrong-number-parameters");
      }
      return;
    }
    final Procedure2<Parameter, Integer> _function = (Parameter p, Integer i) -> {
      final Expression e = params.get((i).intValue());
      final TypeRef expected = TyperHelper.getBroadType(p.getTypeRef());
      final TypeRef actual = TypeChecker.computeTypeOf(e);
      if ((actual != null)) {
        boolean _equals = actual.equals(Types.ERROR_TYPEREF);
        if (_equals) {
          String _name_1 = msg.getName();
          String _plus_4 = ("Message " + _name_1);
          String _plus_5 = (_plus_4 + " is sent with an erroneous parameter. Expected ");
          String _string = Types.toString(expected);
          String _plus_6 = (_plus_5 + _string);
          String _plus_7 = (_plus_6 + ", sent with ");
          String _string_1 = Types.toString(TyperHelper.getBroadType(actual));
          final String m_1 = (_plus_7 + _string_1);
          if ((parent instanceof EList)) {
            this.error(m_1, send.eContainer(), send.eContainingFeature(), ((EList) parent).indexOf(send), "type");
          } else {
            this.error(m_1, send.eContainer(), send.eContainingFeature(), "type");
          }
        } else {
          boolean _equals_1 = actual.equals(Types.ANY_TYPEREF);
          if (_equals_1) {
            String _name_2 = msg.getName();
            String _plus_8 = ("Message " + _name_2);
            final String m_2 = (_plus_8 + " is sent with a parameter which cannot be typed. Consider using a cast (<exp> as <type>).");
            if ((parent instanceof EList)) {
              this.warning(m_2, send.eContainer(), send.eContainingFeature(), ((EList) parent).indexOf(send), "type-cast", p.getTypeRef().getType().getName());
            } else {
              this.warning(m_2, send.eContainer(), send.eContainingFeature(), "type-cast", p.getTypeRef().getType().getName());
            }
          } else {
            boolean _isA = TyperHelper.isA(actual, expected);
            boolean _not = (!_isA);
            if (_not) {
              String _name_3 = msg.getName();
              String _plus_9 = ("Message " + _name_3);
              String _plus_10 = (_plus_9 + " is sent with an erroneous parameter. Expected ");
              String _string_2 = Types.toString(expected);
              String _plus_11 = (_plus_10 + _string_2);
              String _plus_12 = (_plus_11 + ", sent with ");
              String _string_3 = Types.toString(TyperHelper.getBroadType(actual));
              final String m_3 = (_plus_12 + _string_3);
              if ((parent instanceof EList)) {
                this.error(m_3, send.eContainer(), send.eContainingFeature(), ((EList) parent).indexOf(send), "type");
              } else {
                this.error(m_3, send.eContainer(), send.eContainingFeature(), "type");
              }
            }
          }
        }
      }
    };
    IterableExtensions.<Parameter>forEach(msg.getParameters(), _function);
  }
}
