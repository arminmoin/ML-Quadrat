package org.thingml.xtext.validation.checks;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Connector;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.RequiredPort;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class PortsUsage extends ThingMLValidatorCheck {
  /**
   * @Check(NORMAL)
   * def checkAutotransitionCycles(Configuration cfg) {
   * val t = new Tarjan(cfg, ConfigurationHelper.allInstances(cfg));
   * val cycles = t.findStronglyConnectedComponents();
   * cycles.forEach[ cycle |
   * if (cycle !== null && cycle.size > 1) {
   * val msg = cycle.join("Dependency cycle: (",", ",")",[name])
   * cycle.forEach[ i |
   * info(msg, cfg, ThingMLPackage.eINSTANCE.configuration_Instances, cfg.instances.indexOf(i), "dependency-cycle")
   * ]
   * }
   * ]
   * }
   */
  @Check(CheckType.FAST)
  public void checkDanglingPorts(final Configuration cfg) {
    final Procedure2<Instance, Integer> _function = (Instance inst, Integer i) -> {
      final Function1<Port, Boolean> _function_1 = (Port port) -> {
        return Boolean.valueOf(((port instanceof RequiredPort) && (!((RequiredPort) port).isOptional())));
      };
      final Function1<Port, Boolean> _function_2 = (Port requiredPort) -> {
        final Function1<AbstractConnector, Boolean> _function_3 = (AbstractConnector connector) -> {
          if ((connector instanceof Connector)) {
            return Boolean.valueOf(((((Connector) connector).getCli() == inst) && (((Connector) connector).getRequired() == requiredPort)));
          } else {
            return Boolean.valueOf(((((ExternalConnector) connector).getInst() == inst) && (((ExternalConnector) connector).getPort() == requiredPort)));
          }
        };
        boolean _exists = IterableExtensions.<AbstractConnector>exists(cfg.getConnectors(), _function_3);
        return Boolean.valueOf((!_exists));
      };
      final Consumer<Port> _function_3 = (Port port) -> {
        String _name = port.getName();
        String _plus = ("Non optional required port " + _name);
        final String msg = (_plus + " is not connected");
        EReference _configuration_Instances = ThingMLPackage.eINSTANCE.getConfiguration_Instances();
        String _name_1 = inst.getName();
        String _plus_1 = (_name_1 + "/");
        String _name_2 = port.getName();
        String _plus_2 = (_plus_1 + _name_2);
        this.error(msg, cfg, _configuration_Instances, (i).intValue(), "required-ports-not-connected", _plus_2);
      };
      IterableExtensions.<Port>filter(IterableExtensions.<Port>filter(inst.getType().getPorts(), _function_1), _function_2).forEach(_function_3);
    };
    IterableExtensions.<Instance>forEach(cfg.getInstances(), _function);
  }
  
  @Check(CheckType.FAST)
  public void checkDuplicates(final Port p) {
    final Function1<Message, String> _function = (Message m) -> {
      return m.getName();
    };
    final BiConsumer<String, List<Message>> _function_1 = (String name, List<Message> messages) -> {
      int _size = messages.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        int _size_1 = messages.size();
        String _plus = ((("Message " + name) + " declared to be sent multiple (") + Integer.valueOf(_size_1));
        final String msg = (_plus + ") times");
        this.error(msg, p, ThingMLPackage.eINSTANCE.getPort_Sends(), p.getSends().indexOf(messages.get(0)), "duplicate-msg-in-port");
      }
    };
    IterableExtensions.<String, Message>groupBy(p.getSends(), _function).forEach(_function_1);
    final Function1<Message, String> _function_2 = (Message m) -> {
      return m.getName();
    };
    final BiConsumer<String, List<Message>> _function_3 = (String name, List<Message> messages) -> {
      int _size = messages.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        int _size_1 = messages.size();
        String _plus = ((("Message " + name) + " declared to be received multiple (") + Integer.valueOf(_size_1));
        final String msg = (_plus + ") times");
        this.error(msg, p, ThingMLPackage.eINSTANCE.getPort_Sends(), p.getSends().indexOf(messages.get(0)), "duplicate-msg-in-port");
      }
    };
    IterableExtensions.<String, Message>groupBy(p.getReceives(), _function_2).forEach(_function_3);
  }
  
  @Check(CheckType.FAST)
  public void checkDuplicates(final Configuration cfg) {
    final Consumer<AbstractConnector> _function = (AbstractConnector c1) -> {
      final Consumer<AbstractConnector> _function_1 = (AbstractConnector c2) -> {
        if (((c1 instanceof Connector) && (c2 instanceof Connector))) {
          final Connector conn1 = ((Connector) c1);
          final Connector conn2 = ((Connector) c2);
          if ((((((conn1 != conn2) && (conn1.getCli() == conn2.getCli())) && (conn1.getRequired() == conn2.getRequired())) && (conn1.getProvided() == conn2.getProvided())) && (conn1.getSrv() == conn2.getSrv()))) {
            final String msg = "This connector is already defined";
            this.error(msg, cfg, ThingMLPackage.eINSTANCE.getConfiguration_Connectors(), cfg.getConnectors().indexOf(c2), "duplicate-connector");
          }
        } else {
          if (((c1 instanceof ExternalConnector) && (c2 instanceof ExternalConnector))) {
            final ExternalConnector conn1_1 = ((ExternalConnector) c1);
            final ExternalConnector conn2_1 = ((ExternalConnector) c2);
            if (((((conn1_1 != conn2_1) && (conn1_1.getInst() == conn2_1.getInst())) && (conn1_1.getPort() == conn2_1.getPort())) && (conn1_1.getProtocol() == conn2_1.getProtocol()))) {
              final String msg_1 = "This connector is already defined";
              this.error(msg_1, cfg, ThingMLPackage.eINSTANCE.getConfiguration_Connectors(), cfg.getConnectors().indexOf(c2), "duplicate-connector");
            }
          }
        }
      };
      cfg.getConnectors().forEach(_function_1);
    };
    cfg.getConnectors().forEach(_function);
  }
}
