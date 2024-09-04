//- Write a Java program that uses a ternary operator to find the minimum of two numbers.
//3

import java.util.Scanner;

class minimumOfNumbers{
    public void minimumOfTwoNumbers(int num1, int num2){
        String result = (num1 > num2)?"num2 is the minimum of both the numbers ":"num1 is the minimum of both the " +
                "numbers";
        System.out.println(result);
    }
}

class terenary{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter thee first number ");
        int a = input.nextInt();

        System.out.println("please enter thee second number ");
        int b = input.nextInt();

        minimumOfNumbers obj1 = new minimumOfNumbers();
        obj1.minimumOfTwoNumbers(a,b);
    }
}