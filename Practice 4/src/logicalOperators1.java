//- Write a program that checks if a given year is a leap year using logical operators.
// 4

import java.util.Scanner;

class leapyear{
    public void checkLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){ // made logical mistake that is corrected 
            System.out.println("it is a leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}

class logicalOperators1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please input the year to check if it is a leap year or not ");
        int a = input.nextInt();
        leapyear obj1 = new leapyear();
        obj1.checkLeapYear(a);
    }
}