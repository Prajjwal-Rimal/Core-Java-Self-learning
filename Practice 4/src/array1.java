import java.util.Arrays;
import java.util.OptionalInt;

//- Implement a program to find the largest and smallest elements in an array. // bubble sort
class array1{
    public static void main(String[]args){
        int array[]=new int[4];
        array[0]=2;
        array[1]=3;
        array[2]=1;
        array[3]=2;

        int array1[]=new int[4];
        OptionalInt max = Arrays.stream(array).max();
        OptionalInt min = Arrays.stream(array).min();

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println(max);
        System.out.println(min);
    }
}