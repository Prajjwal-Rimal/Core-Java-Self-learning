// - **Q11:** Write a Java program that uses the `Scanner` class to take
// user input for their name, age, and GPA,
// then prints this information.

import java.util.Scanner;
class chatgptscanner1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String s = input.next();// use next line as next will only capture the forst word and not the
        // whole string
        System.out.println("enter your age");
        int a = input.nextInt();
        System.out.println("enter your gpa");
        int g = input.nextInt();

        System.out.println(s);
        System.out.println(a);
        System.out.println(g);

    }
}