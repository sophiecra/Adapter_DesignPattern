public class Cassett implements AnalogAlbum {
    public ArrayList<String> songList = new ArrayList<String>();
    public int index;
    
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songList.add(song1, song2, song3, song4, song5);
        this.index = 5;
    }

    public void play() {
    }
}
