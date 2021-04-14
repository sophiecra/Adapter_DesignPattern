public class AnalogAdapter implements AnalogAlbum{
    public DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    public String play() {
        return album.play();
    }

    public String rewind() {
        return album.rewind();
    }

    public String ffwd() {
        return album.ffwd();
    }

    public String pause() {
        return album.pause();
    }

    public String stopEject() {
        return album.stopEject();
    }
}
