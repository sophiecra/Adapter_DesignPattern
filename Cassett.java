import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    public ArrayList<String> songs = new ArrayList<String>();
    public int currentIndex;
    
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String play() {
        return "Playing song " + currentIndex + ": " + songs.get(currentIndex);
    }

    public String rewind() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Rewinding to song " + currentIndex + ": " + songs.get(currentIndex);
        } else {
            return "Fully Re-Wound";
        }
    }

    public String ffwd() {
        if (currentIndex < songs.size()) {
            currentIndex++;
            return "Forwarding to song " + currentIndex + ": " + songs.get(currentIndex);
        } else {
            return "Forwarded to end of the cassett";
        }
    }

    public String pause() {
        return "Pausing " + currentIndex + ": " + songs.get(currentIndex);
    }

    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
