//Write a Java program that checks if a number is even or odd using a ternary operator.

import java.util.Scanner;

class chatgptTO2{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("input a number ");
        int x = input.nextInt();

        String result = (x==0)?"x is zero":
                        (x%2==0) ?"The number is even":"the number is odd";
        System.out.println(result);
    }
}