import java.util.ArrayList;
public class Algo {
    /**
     * A method that swaps an int array 
     * @param anArray
     */
    public static void reverse(int[] anArray) {
        int tmp = 0;
        for (int i = 0; i < anArray.length/2; i++) {
            tmp = anArray[i];
            anArray[i] = anArray[anArray.length - 1 - i];
            anArray[anArray.length - 1 - i] = tmp;
        }
    }
    /**
     * A method that prints an int array
     * @param numbers
     */
    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            // Don't print last comma
            if (i != numbers.length -1) {
                System.out.print((", "));
            }
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        printArray(numbers);
        reverse(numbers);
        printArray(numbers);

        // Change the array size
        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        printArray(numbers1);
        reverse(numbers1);
        printArray(numbers1);

        // Empty the array
        int[] numbers2 = {};
        printArray(numbers2);
        reverse(numbers2);
        printArray(numbers2);
    }
}
