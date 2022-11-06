package Arrays;

import java.util.Scanner;

public class challenge2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Write a method called readIntegers() with a parameter called count that represents
        how many integers the user need to enter.
        The method need to read from the console until all the numbers are entered, and
        then return an array containing the numbers entered.
        Write a method findMin() with the array as a parameter. The method need to return
        the minimum value in the array.
        In the main() method read the count from the console and call the method readIntegers()
        with the count parameter.
        Then call the findMin() method passing the array returned from the call to the
        readIntegers() method.
        */
        System.out.println("Enter number of integers");
        int count = input.nextInt();
        int numbers[] = readIntegers(count);
        System.out.println("the minimum number in the array is "+findMin(numbers));

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " number of characters");
        for (int i = 0; i < count; i++) {
          
            array[i] = input.nextInt();

        }
        return array;

    }

    public static int findMin(int[] numbers) {
        int minValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
        
    }
}
