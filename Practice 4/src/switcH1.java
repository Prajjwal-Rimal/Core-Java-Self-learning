//- Write a program that takes a character representing an arithmetic operation
// (`+`, `-`, `*`, `/`) and two operands,
//and then performs the operation using a switch statement.

import java.util.Scanner;

class arithmeticSwitch{
    public void arithmeticSwitch(int num1, int num2, String operator){
        switch (operator){
            case ("+"):System.out.println(num1+num2);
                break;
            case ("-"):System.out.println(num1-num2);
                break;
            case ("*"):System.out.println(num1*num2);
                break;
            case ("/"):System.out.println(num1/num2);// error checking for division by 0 would have been better 
                break;
            case ("%"):System.out.println(num1%num2);// error checking for division by 0 would have been better
                break;
            default:
                System.out.println("incorrect inoput please rerun the programme");
        }
    }
}

class switcH1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int a= input.nextInt();
        System.out.println("please enter the second number");
        int b= input.nextInt();
        input.nextLine();
        System.out.println("please choose which operation dop you want to perform from +,-,%,*,/");
        String symbol= input.nextLine(); // using char here would have been better than string

        arithmeticSwitch obj1 = new arithmeticSwitch();
        obj1.arithmeticSwitch(a,b,symbol);

        input.close();
    }
}

