import java.util.HashMap;
public class TestTrackList {
    public static void main(String[] args) {
        System.out.println("----- Test Add Song -----");
        String title1 = "The Family Madrigal";
        String lyrics1 = String.join("\n", 
        "This is our home",
        "We've got every generation",
        "So full of music",
        "A rhythm of its own design",
        "This is my family",
        "A perfect constellation",
        "So many stars and everybody gets to shine");
        String title2 = "Surface Pressure";
        String lyrics2 = String.join("\n",
        "I'm the strong one",
        "I'm not nervous",
        "I'm as tough as the crust of the earth is",
        "I move mountains",
        "I move churches",
        "And I glow 'cause I know what my worth is");
        String title3 = "We Don't Talk About Bruno";
        String lyrics3 = String.join("\n",
        "We don't talk about Bruno, no, no, no",
        "We don't talk about Bruno, but",
        "",
        "It was my wedding day",
        "It was our wedding day",
        "We were getting ready",
        "And there wasn't a cloud in the sky",
        "No clouds allowed in the sky",
        "Bruno walks in with a mischievous grin");
        String title4 = "Into the Unknown";
        String lyrics4 = String.join("\n",
        "Ah ah oh oh oh",
        "Ah ah oh oh oh oh oh oh",
        "I can hear you but I won't",
        "Some look for trouble while others don't",
        "There's a thousand reasons I should go about my day",
        "And ignore your whispers which I wish would go away, oh oh oh"
        );
        //TrackList trackList = new TrackList();
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put(title1, lyrics1);
        trackList.put(title2, lyrics2);
        trackList.put(title3, lyrics3);
        trackList.put(title4, lyrics4);

        System.out.println("\n----- Test Get Song -----");
        System.out.println(trackList.get(title3));
        System.out.println(trackList.get(title1));
        System.out.println(trackList.get(title4));
        System.out.println(trackList.get(title2));

        System.out.println("\n----- Test Print Songs -----");
        for (String title : trackList.keySet()) {
            System.out.printf("%s: %s \n", title, trackList.get(title));
            System.out.println("");
        }
        System.out.println("");
    }
}
