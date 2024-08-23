//- **Q16:** Use a ternary operator to check if a number is positive, negative, or zero.

import java.util.Scanner;

class chatgptTO2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the First number ");
        int x = input.nextInt();

        String result = (x>0)?"the number is greater than 0":"the number is lesser than 0";
        System.out.println(result);
    }
}

// String result = (x > 0) ? "The number is positive"
//                      : (x < 0) ? "The number is negative"
//                      : "The number is zero";