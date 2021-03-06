package cb.petal;
import java.util.Collection;

/**
 * Represents State object
 *
 * @version $Id: State.java,v 1.8 2001/06/22 09:10:36 dahm Exp $
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
public class State extends QuidObject implements Named {
  public State(PetalNode parent, Collection params) {
    super(parent, "State", params);
  }

  public State() {
    super("State");
  }

  public void setNameParameter(String o) {
    params.set(0, o);
  }

  public String getNameParameter() {
    return (String)params.get(0);
  }

  public List getTransitions() {
    return (List)getProperty("transitions");
  }

  public void setTransitions(List o) {
    defineProperty("transitions", o);
  }

  public String getType() {
    return getPropertyAsString("type");
  }

  public void setType(String o) {
    defineProperty("type", o);
  }

  public List getActions() {
    return (List)getProperty("actions");
  }

  public void setActions(List o) {
    defineProperty("actions", o);
  }

  public StateMachine getStateMachine() {
    return (StateMachine)getProperty("statemachine");
  }

  public void setStateMachine(StateMachine o) {
    defineProperty("statemachine", o);
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
