import org.code.theater.*;
import org.code.media.*;

/* the actor class is a subclass of the performer super class
  it represents a performer auditioning for an acting role 
  */
public class Actor extends Performer {

  private String role;
  private boolean hasCostume;

  public Actor() {
    super();
    role = "Extra";
    hasCostume = false;
  }

  public Actor(String name, int skillLevel, String role, boolean hasCostume) {
    super(name, skillLevel);
    this.role = role;
    this.hasCostume = hasCostume;
  }

  public String getRole() {
    return role;
  }

  public boolean getCostume() {
    return hasCostume;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setCostume(boolean hasCostume) {
    this.hasCostume = hasCostume;
  }

  public String toString() {
    return super.toString() + ", Role: " + role + " , Has Costume: " + hasCostume;
  }
}
