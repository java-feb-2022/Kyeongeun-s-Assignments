import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting() {
        Date today = new Date();
        SimpleDateFormat myFormat = new SimpleDateFormat("EEEEE", new Locale("en", "US"));
        String date = myFormat.format(today);
        return "Hello, this is " + date + ".";
    }
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return "Good "+ dayPeriod + ", " + name + ". Good to see you.";
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "Current date is:" + date; 
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophistecaed enough for that.";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    public String singASong(String title){
        if (title.endsWith("Surface Pressure")) {
            return "\nI'm the strong one\n" +
                    "I'm not nervous\n" +
                    "I'm as tough as the crust of the earth is\n" + 
                    "I move mountains\n" + 
                    "I move churches\n" +
                    "And I glow 'cause I know what my worth is...\n";
        } else if (title.endsWith("Family Madrigal")) {
            return "\nThis is our home\n" +
                    "We've got every generation\n" +
                    "So full of music\n" +
                    "A rhythm of its own design\n" +
                    "This is my family\n" +
                    "A perfect constellation\n" +
                    "So many stars and everybody gets to shine\n";
        } else {
            return "Sorry, I don't know that song...";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

