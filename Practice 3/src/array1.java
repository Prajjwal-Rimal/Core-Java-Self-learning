//1. Write a program to create an array of integers and find the maximum and minimum values.

import java.util.Arrays;

class array1{
    public static void main(String[]args){
        int array[]={0,1,2,10,4,5,6};
        System.out.println(Arrays.stream(array).max());
        System.out.println(Arrays.stream(array).min());


        int max = array[0]; // Initialize max to the first element
        int min = array[0]; // Initialize min to the first element

        for (int i = 0; i < array.length; i++) { // Correct loop condition
            if (array[i] > max) {
                max = array[i]; // Update max if current element is greater
            }
            if (array[i] < min) {
                min = array[i]; // Update min if current element is smaller
            }
        }
        System.out.println("Maximum value (using loop): " + max);
        System.out.println("Minimum value (using loop): " + min);
    }
}