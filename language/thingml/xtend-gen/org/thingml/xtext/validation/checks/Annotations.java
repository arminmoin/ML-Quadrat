package org.thingml.xtext.validation.checks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.thingml.annotations.Annotation;
import org.thingml.annotations.AnnotationRegistry;
import org.thingml.xtext.thingML.AnnotatedElement;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.validation.ThingMLValidatorCheck;

@SuppressWarnings("all")
public class Annotations extends ThingMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkAnnotation(final PlatformAnnotation a) {
    EObject _eContainer = a.eContainer();
    final AnnotatedElement source = ((AnnotatedElement) _eContainer);
    boolean _containsKey = AnnotationRegistry.annotations.containsKey(a.getName());
    boolean _not = (!_containsKey);
    if (_not) {
      String _name = a.getName();
      String _plus = ("Annotation @" + _name);
      final String msg = (_plus + " is not registered. Non-registered annotations will be deprecated in a future version.");
      this.warning(msg, source, ThingMLPackage.eINSTANCE.getAnnotatedElement_Annotations(), source.getAnnotations().indexOf(a), "unknown-annotation");
      return;
    }
    final Annotation reg_a = AnnotationRegistry.annotations.get(a.getName());
    boolean _check = reg_a.check(source, a.getValue());
    boolean _not_1 = (!_check);
    if (_not_1) {
      String _name_1 = a.getName();
      String _plus_1 = ("Annotation @" + _name_1);
      String _plus_2 = (_plus_1 + " is invalid. ");
      final String msg_1 = (_plus_2 + reg_a);
      this.warning(msg_1, source, ThingMLPackage.eINSTANCE.getAnnotatedElement_Annotations(), source.getAnnotations().indexOf(a), "invalid-annotation");
      return;
    }
  }
}
