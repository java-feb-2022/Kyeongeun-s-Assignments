import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    private char[] letterArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private Random randMachine = new Random();

    /**
     * A method made 10 random number between 1~20
     * @return 10 random numbers 
     */
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(randMachine.nextInt(20) + 1);
        }
        return rolls;
    }
    /**
     * A method generate a random lowercase letter.
     * @return a random lowercase alphabet letter
     */
    public char getRandomLetter() {
        return letterArray[randMachine.nextInt(26)];
    }
    /**
     * A method generate a password. It consists lowercase alphabetletters.
     * Todo : If you want to make this method more realistic,
     * then add to letterArray to numbers and special characters.
     * @return 8 random alphabet lowercase letters
     */
    public String generatePassword() {
        char[] password = new char[8];
        for (int i = 0; i < password.length; i++) {
            password[i] = letterArray[randMachine.nextInt(letterArray.length)];
        }
        return new String(password);
    }
    /**
     * A methode generate passwords ArrayList. It uses geteratePassword() method.
     * @param num the number of the passwords
     * @return the ArrayList of the passwords
     */
    public ArrayList<String> getNewPasswordSet(int num) {
        ArrayList<String> passwordSet = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
    /**
     * <Sensei bonus>
     * A method shuffles a password.
     * @param objList the original password
     */
    public <T> void shuffleArray(ArrayList<T> objList) {
        T tmp = null;
        for (int i = 0; i < objList.size(); i++) {
            int swapIdx = randMachine.nextInt(objList.size());
            tmp = objList.get(i);
            objList.set(i, objList.get(swapIdx));
            objList.set(swapIdx, tmp);
        }
    } 
}


