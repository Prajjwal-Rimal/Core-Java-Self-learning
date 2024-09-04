//- Implement a program to compare two integers and print which one is larger or if they are equal.
//3

import java.util.Scanner;

class relationalOperators1{
    public static void main(String[]args){

        Scanner input= new Scanner(System.in);
        System.out.println("please enter the first number for comparision ");
        int a = input.nextInt();
        System.out.println("please enter the second number for comparision ");
        int b = input.nextInt();

        if(a>b){
            System.out.println(a+ " is bigger");
        } else if (a<b) {
            System.out.println(b+ " is bigger");
        }else if(a==b){
            System.out.println(a +" and "+ b + " are equal");
        }else {
            System.out.println("wrong input");
        }
    }
}