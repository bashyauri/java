package Arrays;

import java.util.Scanner;

public class Challeng1 {
        private static  Scanner input = new Scanner(System.in);
      
      
        public static void main(String[] args) {
            int[] myIntegers = getIntegers(5);
            int[] sorted = sortIntegers(myIntegers);
            printArray(sorted);
       
      
      
       

    }

    public static int[] getIntegers(int numbers) {
      
        System.out.println("Enter " + numbers + " numbers");
        int array[] = new int[numbers];
        for (int i = 0; i < numbers; i++) {
           
           
            array[i] = input.nextInt();

        }
        return array;
        
    }

   

    public static int[] sortIntegers(int[] myarray) {
        int[] sorted_array = new int[myarray.length];
        for (int i = 0; i < myarray.length; i++) {
            sorted_array[i] = myarray[i];

        }
        boolean flag = true;
        int temp;
        // while (flag) {
        //     flag = false;
            for (int i = 0; i < sorted_array.length - 1; i++) {

                if (sorted_array[i + 1] > sorted_array[i]) {
                    temp = sorted_array[i];
                    //System.out.println(myarray[i + 1] + "is greater than " + myarray[i]);
                    sorted_array[i] = sorted_array[i + 1];
                    sorted_array[i + 1] = temp;
                    //swap positions
                    // flag = true;

                }

            }

        // }

        return sorted_array;

    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    
        
   
    
    
}
