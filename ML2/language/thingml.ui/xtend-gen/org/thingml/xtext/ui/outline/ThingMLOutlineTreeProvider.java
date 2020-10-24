/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.ui.outline;

import com.google.inject.Inject;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.AnnotatedElement;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.InternalTransition;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.Region;
import org.thingml.xtext.thingML.Session;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.StateContainer;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.Transition;
import org.thingml.xtext.thingML.Type;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
@SuppressWarnings("all")
public class ThingMLOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Inject
  private IImageHelper imageHelper;
  
  public void _createChildren(final DocumentRootNode outlineNode, final ThingMLModel model) {
    final Consumer<Type> _function = (Type type) -> {
      this.createNode(outlineNode, type);
    };
    model.getTypes().forEach(_function);
    final Consumer<Protocol> _function_1 = (Protocol protocol) -> {
      this.createNode(outlineNode, protocol);
    };
    model.getProtocols().forEach(_function_1);
    final Consumer<Configuration> _function_2 = (Configuration config) -> {
      this.createNode(outlineNode, config);
    };
    model.getConfigs().forEach(_function_2);
  }
  
  public void _createChildren(final IOutlineNode parent, final Configuration cfg) {
    this._createChildren(parent, ((AnnotatedElement) cfg));
    final Consumer<Instance> _function = (Instance it) -> {
      this.createNode(parent, it);
    };
    cfg.getInstances().forEach(_function);
    final Consumer<AbstractConnector> _function_1 = (AbstractConnector it) -> {
      this.createNode(parent, it);
    };
    cfg.getConnectors().forEach(_function_1);
  }
  
  public void _createChildren(final IOutlineNode parent, final AnnotatedElement elt) {
    final Consumer<PlatformAnnotation> _function = (PlatformAnnotation it) -> {
      this.createNode(parent, it);
    };
    elt.getAnnotations().forEach(_function);
  }
  
  public void _createChildren(final IOutlineNode parent, final Thing thing) {
    this._createChildren(parent, ((AnnotatedElement) thing));
    final Consumer<Message> _function = (Message it) -> {
      this.createNode(parent, it);
    };
    thing.getMessages().forEach(_function);
    final Consumer<Port> _function_1 = (Port it) -> {
      this.createNode(parent, it);
    };
    thing.getPorts().forEach(_function_1);
    final Consumer<Property> _function_2 = (Property it) -> {
      this.createNode(parent, it);
    };
    thing.getProperties().forEach(_function_2);
    final Consumer<Function> _function_3 = (Function it) -> {
      this.createNode(parent, it);
    };
    thing.getFunctions().forEach(_function_3);
    CompositeState _behaviour = thing.getBehaviour();
    boolean _tripleNotEquals = (_behaviour != null);
    if (_tripleNotEquals) {
      this.createNode(parent, thing.getBehaviour());
    }
  }
  
  public boolean _isLeaf(final Port port) {
    return false;
  }
  
  public void _createChildren(final IOutlineNode parent, final Port port) {
    final Consumer<Message> _function = (Message it) -> {
      this.customNode(parent, it, "outline/open iconic/chevron-right-2x.png", it.getName());
    };
    port.getReceives().forEach(_function);
    final Consumer<Message> _function_1 = (Message it) -> {
      this.customNode(parent, it, "outline/open iconic/chevron-left-2x.png", it.getName());
    };
    port.getSends().forEach(_function_1);
  }
  
  public void _createChildren(final IOutlineNode parent, final CompositeState composite) {
    this.state(parent, composite);
    this.session(parent, composite);
    this.container(parent, composite);
  }
  
  public void _createChildren(final IOutlineNode parent, final Region region) {
    this.container(parent, region);
  }
  
  public void _createChildren(final IOutlineNode parent, final Session session) {
    this.container(parent, session);
  }
  
  public void _createChildren(final IOutlineNode parent, final State state) {
    this.state(parent, state);
  }
  
  public boolean _isLeaf(final Transition transition) {
    return true;
  }
  
  public boolean _isLeaf(final Message message) {
    return true;
  }
  
  public boolean _isLeaf(final Function function) {
    return false;
  }
  
  public boolean _isLeaf(final Property property) {
    return true;
  }
  
  /**
   * --- Helpers ---
   */
  public void container(final IOutlineNode parent, final StateContainer container) {
    final Consumer<State> _function = (State it) -> {
      this.createNode(parent, it);
    };
    container.getSubstate().forEach(_function);
  }
  
  public void state(final IOutlineNode parent, final State state) {
    final Consumer<Property> _function = (Property it) -> {
      this.createNode(parent, it);
    };
    state.getProperties().forEach(_function);
    final Consumer<Transition> _function_1 = (Transition it) -> {
      this.createNode(parent, it);
    };
    state.getOutgoing().forEach(_function_1);
    final Consumer<InternalTransition> _function_2 = (InternalTransition it) -> {
      this.createNode(parent, it);
    };
    state.getInternal().forEach(_function_2);
  }
  
  public void session(final IOutlineNode parent, final CompositeState state) {
    final Consumer<Session> _function = (Session it) -> {
      this.createNode(parent, it);
    };
    state.getSession().forEach(_function);
    final Consumer<Region> _function_1 = (Region it) -> {
      this.createNode(parent, it);
    };
    state.getRegion().forEach(_function_1);
  }
  
  public EObjectNode customNode(final IOutlineNode parent, final EObject modelElement, final String image, final String text) {
    return this.createEObjectNode(parent, modelElement, this.imageHelper.getImage(image), text, true);
  }
}
