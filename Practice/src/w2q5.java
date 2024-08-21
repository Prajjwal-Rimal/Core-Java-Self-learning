// Fraction Write an application that prompts and reads the numerator and denominator of a
// fraction as integers and then prints the decimal equivalent of the fraction.

import java.util.Scanner;
class w2q5{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please input the numerator");
        int numerator = input.nextInt();
        System.out.println("please input the denominator");
        int denominator = input.nextInt();

        System.out.println(numerator);
        System.out.println("-");
        System.out.println(denominator);
        System.out.println(" the quotient of the fraction is " + numerator/denominator);
        System.out.println(" the remainder of the fraction is " + numerator % denominator);
    }
}