//Given three integers, use a nested ternary operator to find and print the smallest number.

import java.util.Scanner;

class chatgptTO3{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("input a number ");
        int x = input.nextInt();
        System.out.println("input a number ");
        int y = input.nextInt();
        System.out.println("input a number ");
        int z = input.nextInt();

        String result = (x>y)?"y is the smallest":
                        (y>z)?"z is the smallest":(z>x)?"x is the smallest":"invalid number";
        System.out.println(result);
    }
}

//(x < y) ? (x < z ? x : z) : (y < z ? y : z);