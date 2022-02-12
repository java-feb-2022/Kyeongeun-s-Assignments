import java.util.ArrayList;
import java.util.Arrays;
public class Algo {
    /**
     * A method that swaps an int array 
     * @param anArray int array
     */
    public static void reverse(int[] anArray) {
        int tmp = 0;
        for (int i = 0; i < anArray.length/2; i++) {
            tmp = anArray[i];
            anArray[i] = anArray[anArray.length - 1 - i];
            anArray[anArray.length - 1 - i] = tmp;
        }
    }
    /** A method that replace all even numbers to 0
     * @param anArray int array
     */
    public static void replaceEvenToZero(int[] anArray) {
        int idx = 0;
        while(idx < anArray.length) {
            if (anArray[idx] % 2 == 0) {
                anArray[idx] = 0;
            }
            idx++;
        }
    }
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));

        // Change the array size
        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(numbers1));
        reverse(numbers1);
        System.out.println(Arrays.toString(numbers1));

        // Empty the array
        int[] numbers2 = {};
        System.out.println(Arrays.toString(numbers2));
        reverse(numbers2);
        System.out.println(Arrays.toString(numbers2));

        replaceEvenToZero(numbers);
        System.out.println(Arrays.toString(numbers));

        replaceEvenToZero(numbers1);
        System.out.println(Arrays.toString(numbers1));

        replaceEvenToZero(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }

}
