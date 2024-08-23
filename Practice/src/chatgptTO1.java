//- **Q15:** Write a program that takes two integers
// as input and prints the greater of the two using the ternary operator.

import java.util.Scanner;

class chatgptTO1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the First number ");
        int x = input.nextInt();
        System.out.println("enter the Second number ");
        int y = input.nextInt();

        String result = (x>y)? x +" is greater than " +y :y +" is greater than " +x;
        System.out.println(result);
    }
}