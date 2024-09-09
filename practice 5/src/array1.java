//- Write a program to create an array of `n` integers (where `n` is provided by the user)
// and calculate the sum of all elements.

import java.util.Scanner;

class array1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the length of the integer");
        int x= input.nextInt();

        int array[]= new int[x];

        for(int i=0; i< array.length;i++){
            array[i]=(int)(Math.random()*10);
        }
        int sum =0;
        for(int m: array){
            System.out.print(m+" ");
            sum = m+sum;
        }
        System.out.println();
        System.out.println("The sum is: " + sum);

        input.close();
    }
}