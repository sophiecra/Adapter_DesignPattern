import java.util.ArrayList;
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1: " + songs.get(currentIndex);
    }

    public String playSong(int num) {
        if (num < songs.size() && num > 0) {
            currentIndex = num + 1;
            return "Playing song" + num + ": " + songs.get(num);
        } else {
            return "Not a valid song number";
        }
    }

    public String prevSong() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Skipping back and playing song " + currentIndex + ": " + songs.get(currentIndex);
        } else {
            return playFromBeginning();
        }
    }

    public String nextSong() {
        if (currentIndex < songs.size()) {
            currentIndex++;
            return "Playing: song " + currentIndex + ": " + songs.get(currentIndex);
        } else {
            return playFromBeginning();
        }
    }

    public String stop() {
        return "Stopping CD and ejecting";
    }

    public String pause() {
        return "Pausing " + currentIndex + ": " + songs.get(currentIndex);
    }
}
