/**
 * Cassett that plays songs
 * @author Sophie Crane
 */
import java.util.ArrayList;
public class Cassett implements AnalogAlbum {
    public ArrayList<String> songs = new ArrayList<String>();
    public int currentIndex;
    
    /**
     * Instance of cassett that takes in five songs
     * @param song1 First song on the cassett
     * @param song2 Second song on the cassett
     * @param song3 Third song on the cassett
     * @param song4 Fourth song on the cassett
     * @param song5 Fifth song on the cassett
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays a song on the cassett
     * @return String displaying the song that is playing
     */
    public String play() {
        currentIndex++;
        return "Playing song " + (currentIndex) + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Rewinds and plays the previous song
     * @return String displaying the song that is playing
     */
    public String rewind() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Rewinding to song " + (currentIndex + 1);
        } else {
            return "Fully Re-Wound";
        }
    }

    /**
     * Skips to the next song on the cassett
     * @return String displaying the song that is playing 
     */
    public String ffwd() {
        if (currentIndex < songs.size()) {
            currentIndex++;
            return "Forwarding to song " + (currentIndex + 1);
        } else {
            return "Forwarded to end of the cassett";
        }
    }

    /**
     * Pauses the current song
     * @return String displaying the song that is being paused
     */
    public String pause() {
        return "Pausing " + (currentIndex + 1) + ": " + songs.get(currentIndex);
    }

    /**
     * Stops and ejects the cassett
     * @return String displaying that the cassett is stopping and ejecting
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
