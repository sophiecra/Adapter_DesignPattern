/**
 * Adapter that changes methods from an analog album and adapts them to a digital album
 * @author Sophie Crane
 */
public class AnalogAdapter implements AnalogAlbum{
    public DigitalAlbum album;

    /**
     * Constructor of the Analog Adapter
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Adapts the method of play
     * @return The string that displays when playing the next song on a digital album
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Adapts the method of rewind
     * @return String that displays when calling previous song in a digital album
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Adapts the method of forward
     * @return String that displays when calling next song on a digital album
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Adapts the method of pause
     * @return String that displays when calling pause on a digital album
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Adapts the method of stopEject
     * @return String that displays when calling stop on a digital album
     */
    public String stopEject() {
        return album.stop();
    }
}
