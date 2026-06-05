import org.code.theater.*;
import org.code.media.*;

/* the performer class is the superclass 
  it stores general information about a performer 
  */
public class Performer {
  
private String name;
private int skillLevel;

  public static final int MAX_SKILL = 10;

  /* creaters a default performer object
  Precondition: none
  PostCondition: name is to Unknown and skillLevel is set to 1
  */
public Performer() {
  name = "Unknown";
  skillLevel = 1;
}

  /* this creates a performer object with a given name and skill level 
  that the user wants */
  public Performer(String name, int skillLevel) {
    this.name = name;
    this.skillLevel = limitSkill(skillLevel);
  }

  /* limits a skill level so it does not go below 1 or above max_skill.
  Precondition: skillLevel is an int
  Postcondition: a valid skill level between 1 and MAX_SKILL is returned
  */
  public static int limitSkill(int skillLevel) {
    if(skillLevel < 1) {
      return 1;
    }

    if (skillLevel > MAX_SKILL) {
      return MAX_SKILL;
    }
    return skillLevel;
  }

  //Returns the performers name
  //is a getter method
  public String getName() {
    return name;
  }

  //Returns skillLevel
  //is a getter method
  public int getSkillLevel() {
    return skillLevel;
  }

  /* Changes the performers name
  Precondition: make sure name is not null
  Postcondition: performers name is updated
  */
  public void setName(String name) {
    this.name = name;
  }

  /* Changes skill Level
  precondition: make sure skill level is a valid int
  postcondition: updates performers skill level
  */
  public void setSkillLevel(int skillLevel) {
    this.skillLevel = limitSkill(skillLevel);
  }

  //Returns a string version of the Performer object
  public String toString() {
    return "Name: " + name + "Skill Level: " + skillLevel;
  }
}
