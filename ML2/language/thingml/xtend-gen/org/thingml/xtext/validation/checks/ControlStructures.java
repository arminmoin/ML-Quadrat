package org.thingml.xtext.validation.checks;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.constraints.Types;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.helpers.TyperHelper;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ConditionalAction;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ExternExpression;
import org.thingml.xtext.thingML.LoopAction;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.validation.ThingMLValidatorCheck;
import org.thingml.xtext.validation.TypeChecker;

@SuppressWarnings("all")
public class ControlStructures extends ThingMLValidatorCheck {
  public void checkActionExpression(final Action a, final Expression e) {
    final TypeRef actual = TypeChecker.computeTypeOf(e);
    boolean _equals = actual.equals(Types.BOOLEAN_TYPEREF);
    if (_equals) {
      return;
    }
    final Thing t = ThingMLHelpers.findContainingThing(a);
    if (((!AnnotatedElementHelper.isDefined(t, "ignore", "type-warning")) && actual.equals(Types.ANY_TYPEREF))) {
      int _size = ThingMLHelpers.<ExternExpression>getAllExpressions(e, ExternExpression.class).size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        this.warning("Condition involving extern expressions cannot be typed as Boolean. Consider using a cast, or use @ignore \"type-warning\" on the containing thing.", a, e.eContainingFeature(), "type");
      } else {
        this.warning("Condition cannot be typed as Boolean. Consider using a cast, or use @ignore \"type-warning\" on the containing thing.", a, e.eContainingFeature(), "type-cast", "Boolean");
      }
    } else {
      String _name = TyperHelper.getBroadType(actual).getType().getName();
      String _plus = ("Condition is not a Boolean (" + _name);
      String _plus_1 = (_plus + ")");
      this.error(_plus_1, a, e.eContainingFeature(), "type");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkConditionalAction(final ConditionalAction ca) {
    this.checkActionExpression(ca, ca.getCondition());
  }
  
  @Check(CheckType.FAST)
  public void checkLoopAction(final LoopAction la) {
    this.checkActionExpression(la, la.getCondition());
  }
}
