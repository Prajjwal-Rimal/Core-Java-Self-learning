//- **Q7:** Write a program that takes two numbers as input and performs
// all arithmetic operations on them.



import java.util.Scanner;


class chatgptAO1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want to enter");
        int x = input.nextInt();
        System.out.println("enter the number you want to enter");
        int y = input.nextInt();

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
    }
}