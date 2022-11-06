package Arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        /*
        Write a method called reverse() with an int array as a parameter.
        The method should not return any value. In other words, the method
        is allowed to modify the array parameter.
        In main() test the reverse() method and print the array both reversed
        and non-reversed.
        To reverse the array, you have to swap the elements, so that the first element is
        swapped with the last element and son on.
        For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
        */
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println("Arrays before reverse "+ Arrays.toString(array));
        reversed(array);
        System.out.println("Arrays After reverse "+ Arrays.toString(array));
    }

    public static void reversed(int[] numbers) {
        int temp = 0;
        int arrayLength = numbers.length -1;
       
        for (int i = 0; i < numbers.length/2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[arrayLength-i];
            numbers[arrayLength-i] = temp;
            
            
            
          

        }
        
    }
}
