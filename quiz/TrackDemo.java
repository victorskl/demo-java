import java.util.*;

class Track {

    private String artist;
    private String songTitle;
    private String album;
    
    public Track(String artist, String songTitle, String album) {
        this.artist = artist;
        this.songTitle = songTitle;
        this.album = album;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String getSongTitle() {
        return this.songTitle;
    }
    
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }
    
    public String getAlbum() {
        return this.album;
    }
    
    public void setAlbum(String album) {
        this.album = album;
    }
    
    public String toString() {
        return String.format("{%s, %s, %s}", artist, songTitle, album);
    }
}

class TrackComparator implements Comparator<Track> {
    // first sort by Artist, then by Song Title, then by Album
    public int compare(Track t1, Track t2) {
        int a = t1.getArtist().compareToIgnoreCase(t2.getArtist());
        int b = t1.getSongTitle().compareToIgnoreCase(t2.getSongTitle());
        int c = t1.getAlbum().compareToIgnoreCase(t2.getAlbum());
        return a + b + c;
    }
}

public class TrackDemo {
    public static void main(String[] args) {
        List<Track> tracks = Arrays.asList(
            new Track("A", "A", "A"),
            new Track("C", "C", "C"),
            new Track("B", "B", "B")
        );
        Collections.sort(tracks, new TrackComparator());
        System.out.println(tracks);
        
        tracks = Arrays.asList(
            new Track("A", "B", "C"),
            new Track("A", "B", "A"),
            new Track("A", "B", "B")
        );
        Collections.sort(tracks, new TrackComparator());
        System.out.println(tracks);
        
        
    }
}

// REF
// https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html
// http://stackoverflow.com/questions/2839137/how-to-use-comparator-in-java-to-sort