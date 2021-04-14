/**
 * A CD that plays music
 * @author Sophie Crane
 */
import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /**
     * Constructor for CD that takes in 5 songs
     * @param song1 First song on CD
     * @param song2 Second song on CD
     * @param song3 Third song on CD
     * @param song4 Fourth song on CD
     * @param song5 Fifth song on CD
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays the CD from the beginning
     * @return String that displays the song that is playing
     */
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1: " + songs.get(currentIndex);
    }

    /**
     * Plays the current song
     * @return String that displays the song that is playing
     */
    public String playSong(int num) {
        if (num - 1 < songs.size() && num > 0) {
            currentIndex = num + 1;
            return "Playing song" + (num + 1) + ": " + songs.get(num);
        } else {
            return "Not a valid song number";
        }
    }

    /**
     * Skips back to play the previous song
     * @return String that displays the song that is playing
     */
    public String prevSong() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Skipping back and playing: " + songs.get(currentIndex - 1);
        } else {
            return playFromBeginning();
        }
    }

    /**
     * Skips forward to play the next song
     * @return String that displays the song that is playing
     */
    public String nextSong() {
        if (currentIndex < songs.size()) {
            currentIndex++;
            return "Playing: song " + currentIndex + ": " + songs.get(currentIndex - 1);
        } else {
            return playFromBeginning();
        }
    }

    /**
     * Stops the music and ejects the CD
     * @return String displaying that the CD is stopping and ejecting
     */
    public String stop() {
        return "Stopping CD and ejecting";
    }

    /**
     * Pauses the current song
     * @return String that displays the song that is being paused
     */
    public String pause() {
        return "Pausing " + currentIndex + ": " + songs.get(currentIndex);
    }
}
