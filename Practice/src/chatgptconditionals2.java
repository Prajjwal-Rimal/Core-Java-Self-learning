//- **Q14:** Write a program that takes a
// year as input and checks if it’s a leap year using conditional statements.

import java.util.Scanner;
class  chatgptcondtional2{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the year");
        int x = input.nextInt();

        if((x%4==0 && x%100!=0) || (x%400==0)){ // logic is wrong 100 is not a leap year and 400 is
            System.out.println("it is a leap year");
        }else{
            System.out.println("ITS NOT A LEAP YEAR");
        }
    }
}