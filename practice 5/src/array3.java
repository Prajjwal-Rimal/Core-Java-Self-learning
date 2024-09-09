//- Create a program that finds the largest element in an integer array.

import java.util.Arrays;

class array3{
    public static void main(String[]args){
        int array[]={4,6,10,9};
        int maximum=0;

        for (int i=0; i< array.length;i++){
            if (maximum<array[i]){
                maximum = array[i];;
            }
        }

        System.out.println(maximum );
    }
}