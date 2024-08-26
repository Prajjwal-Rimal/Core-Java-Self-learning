//Write a Java program that takes two integers as input and uses a ternary operator to determine and
//print the larger number.

import java.util.Scanner;

class chatgptTO1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("input a number ");
        int x = input.nextInt();
        System.out.println("input a number ");
        int y = input.nextInt();

        String result =  (x>y)?"x is greater than y":"y is greater than x";
        System.out.println(result);
    }
}