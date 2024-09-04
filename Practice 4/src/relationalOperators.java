//- Write a Java program that checks if a given number is positive, negative, or
// zero using relational operators.

//3

import java.util.Scanner;

class relationalOperators{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println(" please entert a number to check ");
        int x = input.nextInt();

        if (x>0){
            System.out.println(" it is positive ");
        } else if (x==0) {
                System.out.println(" the number is equal to 0");
        }else {
            System.out.println(" the number is negative");
        }
    }
}