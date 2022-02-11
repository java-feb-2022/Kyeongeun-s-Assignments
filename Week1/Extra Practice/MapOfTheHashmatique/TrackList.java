import java.util.HashMap;
public class TrackList {
    private HashMap<String, String> trackList = new HashMap<>();
    public void addSong(String title, String song) {
        trackList.put(title, song);
    }
    public String getSong(String title) {
        return trackList.get(title);
    }
    public void printSongs(){
        for (String title : trackList.keySet()) {
                System.out.printf("%s: %s \n", title, trackList.get(title));
                System.out.println("");
        }
        System.out.println("");
    }
}
