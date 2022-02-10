import java.util.ArrayList;
public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava myPuzzle = new PuzzleJava();

        System.out.println("----- Test getTenRolls -----");
        System.out.println(myPuzzle.getTenRolls());
        
        System.out.println("\n----- Test getRandomLetter -----");
        for (int i = 0; i < 25; i++) {
            System.out.print(myPuzzle.getRandomLetter() + " ");
        }
        System.out.println("");

        System.out.println("\n----- Test generatePassword -----");
        System.out.println(myPuzzle.generatePassword());
        ArrayList<String> newSet =myPuzzle.getNewPasswordSet(10);
        System.out.println(newSet);


        System.out.println("\n----- Test shuffleArray -----");
        String passwordString = myPuzzle.generatePassword();
        ArrayList<Character> aPassword = new ArrayList<>();
        for (int i=0; i < passwordString.length(); i++) {
            aPassword.add((Character) passwordString.charAt(i));
        }
        System.out.println(aPassword);
        myPuzzle.shuffleArray(aPassword);
        System.out.println(aPassword);
        myPuzzle.shuffleArray(newSet);
        System.out.println(newSet);
    }
}
