import org.code.theater.*;
import org.code.media.*;

/*
 singer is a subclass of performer.
 it stores information about a performer who is auditioning with a song.
 */
public class Singer extends Performer {
    private String songTitle;
    private int vocalRange;

    public Singer() {
        super();
        songTitle = "Unknown Song";
        vocalRange = 1;
    }

  public Singer(String name, int skillLevel, String songTitle, int vocalRange) {
        // calls the performer constructor to set name and skillLevel
        super(name, skillLevel);

        this.songTitle = songTitle;
        this.vocalRange = vocalRange;
    }

  public String getSongTitle() {
        return songTitle;
    }

   public int getVocalRange() {
        return vocalRange;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public void setVocalRange(int vocalRange) {
        this.vocalRange = vocalRange;
    }

    public String toString() {
        // uses super.toString() to include the performer information
        return super.toString() + ", Song: " + songTitle + ", Vocal Range: " + vocalRange;
    }
}
