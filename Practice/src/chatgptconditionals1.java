// **Q13:** Write a Java program that takes a score as input and
// prints the grade according to the following criteria:
//  - `A` for scores >= 90
//  - `B` for scores >= 80 and < 90
//  - `C` for scores >= 70 and < 80
//  - `D` for scores >= 60 and < 70
//  - `F` for scores < 60

import java.util.Scanner;
class chatgptconditionals1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS: ");
        int x = input.nextInt();
/*
        switch(x){
            case (x>=90):
                System.out.println("a");
                break;
            case (x>= 80 && x<90):
                System.out.println("b");
                break;
            case (x>= 70 && x<80):
                System.out.println("c");
                break;
            case (x>=60 && x< 70):
                System.out.println("d");
                break;
            case(x<60):
                System.out.println("f");
            default:
                System.out.println("please input a vlid number ");
*/


/// in switch statement java cant handle conditional statements so use an if else loop

        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else if (x < 60) {
            System.out.println("F");
        } else {
            System.out.println("Please input a valid number.");
        }
    }
}