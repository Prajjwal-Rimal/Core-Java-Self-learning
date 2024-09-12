//1. Write a Java program to find the largest and smallest elements in an array.

import java.util.Arrays;
import java.util.OptionalInt;

class arrays1{
    public static void main(String[]args){
        int array[]= {3,9,1,7};
        OptionalInt maximum= OptionalInt.of(0);
        OptionalInt minimum= OptionalInt.of(0);

        maximum= Arrays.stream(array).max();
        minimum= Arrays.stream(array).min();

        System.out.println(maximum+" : "+minimum);


        int selfMaximum = array[0]; // Initialize with the first element
        int selfMinimum = array[0]; // Initialize with the first element

        // Iterate through the array to find the maximum and minimum manually
        for (int i = 1; i < array.length; i++) {
            if (array[i] > selfMaximum) {
                selfMaximum = array[i]; // Update maximum if a larger value is found
            }
            if (array[i] < selfMinimum) {
                selfMinimum = array[i]; // Update minimum if a smaller value is found
            }
        }

        // Display the results
        System.out.println(selfMaximum);
        System.out.println(selfMinimum);

    }
}