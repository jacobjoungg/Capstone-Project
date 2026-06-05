import org.code.theater.*;
import org.code.media.*;
import java.util.ArrayList;

public class CastScene extends Scene {
  private ArrayList<Actor> actors;
  private ArrayList<Singer> singers;

  public CastScene() {
    actors = new ArrayList<Actor>();
    singers = new ArrayList<Singer>();

    actors.add(new Actor("Maya", 9, "Lead", true));
    actors.add(new Actor("Leo", 6, "Side Character", true));
    actors.add(new Actor("Ava", 8, "Villain", false));
    actors.add(new Actor("Noah", 4, "Extra", false));

    singers.add(new Singer("Sophia", 10, "Finale", 8));
    singers.add(new Singer("Ethan", 7, "Opening Song", 5));
    singers.add(new Singer("Olivia", 6, "Solo", 6));
  }

  public CastScene(ArrayList<Actor> actors, ArrayList<Singer> singers) {
    this.actors = actors;
    this.singers = singers;
  }

  public ArrayList<Actor> getActors() {
    return actors;
  }

  public ArrayList<Singer> getSingers() {
    return singers;
  }

  public void setActors(ArrayList<Actor> actors) {
    this.actors = actors;
  }

  public void setSingers(ArrayList<Singer> singers) {
    this.singers = singers;
  }

  public Actor findHighestSkillActor() {
    Actor highest = actors.get(0);

    for (int i = 1; i < actors.size(); i++) {
      if (actors.get(i).getSkillLevel() > highest.getSkillLevel()) {
        highest = actors.get(i);
      }
    }

    return highest;
  }

  public Singer findHighestSkillSinger() {
    Singer highest = singers.get(0);

    for (int i = 1; i < singers.size(); i++) {
      if (singers.get(i).getSkillLevel() > highest.getSkillLevel()) {
        highest = singers.get(i);
      }
    }

    return highest;
  }

  public int countActorsWithCostumes() {
    int count = 0;

    for (int i = 0; i < actors.size(); i++) {
      if (actors.get(i).getCostume()) {
        count++;
      }
    }

    return count;
  }

  public int countSingersWithRange(int minRange) {
    int count = 0;

    for (int i = 0; i < singers.size(); i++) {
      if (singers.get(i).getVocalRange() >= minRange) {
        count++;
      }
    }

    return count;
  }

  public void selectionSortActorsBySkill() {
    for (int i = 0; i < actors.size() - 1; i++) {
      int maxIndex = i;

      for (int j = i + 1; j < actors.size(); j++) {
        if (actors.get(j).getSkillLevel() > actors.get(maxIndex).getSkillLevel()) {
          maxIndex = j;
        }
      }

      Actor temp = actors.get(i);
      actors.set(i, actors.get(maxIndex));
      actors.set(maxIndex, temp);
    }
  }

  public void selectionSortSingersBySkill() {
    for (int i = 0; i < singers.size() - 1; i++) {
      int maxIndex = i;

      for (int j = i + 1; j < singers.size(); j++) {
        if (singers.get(j).getSkillLevel() > singers.get(maxIndex).getSkillLevel()) {
          maxIndex = j;
        }
      }

      Singer temp = singers.get(i);
      singers.set(i, singers.get(maxIndex));
      singers.set(maxIndex, temp);
    }
  }

public void drawScene() {
  selectionSortActorsBySkill();
  selectionSortSingersBySkill();

  clear("black");

  setTextColor("yellow");
  drawText("Theater Audition Analyzer", 35, 35);

  setFillColor("gray");
  drawRectangle(25, 60, 350, 280);

  setFillColor("yellow");
  drawEllipse(145, 75, 110, 45);

  setTextColor("white");
  drawText("Actors", 45, 120);

  int y = 155;

  for (int i = 0; i < actors.size(); i++) {
    Actor current = actors.get(i);

    drawText((i + 1) + ". " + current.getName(), 45, y);
    drawText("Role: " + current.getRole(), 45, y + 20);
    drawText("Skill: " + current.getSkillLevel(), 230, y);

    if (current.getCostume()) {
      drawText("Costume: yes", 230, y + 20);
    } else {
      drawText("Costume: no", 230, y + 20);
    }

    y += 55;
  }

  pause(3.0);

  clear("black");

  setTextColor("yellow");
  drawText("Singer Auditions", 90, 40);

  setFillColor("gray");
  drawRectangle(25, 70, 350, 250);

  setFillColor("yellow");
  drawEllipse(145, 85, 110, 45);

  setTextColor("white");

  y = 140;

  for (int i = 0; i < singers.size(); i++) {
    Singer current = singers.get(i);

    drawText((i + 1) + ". " + current.getName(), 45, y);
    drawText("Song: " + current.getSongTitle(), 45, y + 20);
    drawText("Skill: " + current.getSkillLevel(), 230, y);
    drawText("Range: " + current.getVocalRange(), 230, y + 20);

    y += 60;
  }

  pause(3.0);

  Actor bestActor = findHighestSkillActor();
  Singer bestSinger = findHighestSkillSinger();

  clear("black");

  setTextColor("yellow");
  drawText("Final Audition Results", 65, 60);

  setFillColor("gray");
  drawRectangle(45, 90, 310, 200);

  setTextColor("white");
  drawText("Top Actor: " + bestActor.getName(), 70, 130);
  drawText("Top Singer: " + bestSinger.getName(), 70, 165);
  drawText("Actors with costumes: " + countActorsWithCostumes(), 70, 205);
  drawText("Singers with range 6+: " + countSingersWithRange(6), 70, 240);

  setFillColor("yellow");
  drawEllipse(130, 310, 140, 45);

  pause(5.0);
}
}