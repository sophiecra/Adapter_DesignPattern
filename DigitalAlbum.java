/**
 * Interface of a digital album
 * @author Sophie Crane
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String nextSong();
    public String prevSong();
    public String stop();
    public String pause();
}
