//- Implement a program that takes input from the user to fill an array
// and then prints the array in reverse order.

import java.util.Scanner;
class array2{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the length of the array");
        int x = input.nextInt();
        input.nextLine();

        int array[]= new int[x];

        for (int i=0;i< array.length;i++){
            System.out.println("please enter the elements of the array");
            array[i]=input.nextInt();
        }

        for(int j= array.length -1 ;j>=0;j--){
            System.out.print(array[j]+" ");
        }

        input.close();
    }
}