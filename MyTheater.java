import org.code.theater.*;
import org.code.media.*;

public class MyTheater {
  public static void main(String[] args) {
    CastScene scene = new CastScene();
    scene.drawScene();


    Theater.playScenes(scene);
  }
}