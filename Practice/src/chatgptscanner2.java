//- **Q12:** Create a program that takes an integer input from the user
// and checks if it’s even or odd.

import java.util.Scanner;
class chatgptscanner2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int g = input.nextInt();

        if (g%2==0){
            System.out.println(g + "is even");}
        else {
            System.out.println(g+"is odd");
        }
        input.close();//LEARN TO CLOSE THE SCANNER CLASS
    }
}