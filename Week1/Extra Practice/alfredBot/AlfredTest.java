
public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String ninjaGreeting = alfredBot.guestGreeting("Robin", "morning");
        String senseiGreeting = alfredBot.guestGreeting();

        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        String senseiTest = alfredBot.singASong("Play Surface Pressure");
        String senseiTest2 = alfredBot.singASong("Sing The Family Madrigal");
        String senseiTest3 = alfredBot.singASong("Play Let it go");
        
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(ninjaGreeting);
        System.out.println(senseiGreeting);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
        System.out.println(senseiTest);
        System.out.println(senseiTest2);
        System.out.println(senseiTest3);
    }
}
