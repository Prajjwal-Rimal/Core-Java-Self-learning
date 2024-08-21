import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

class input{
    public static void main(String args[])
    {
        //int num = System.in.read(); // gives ascii value when it reads
       // System.out.println(num -48);// cause ascii value of 0 is 48, 1 is 49 so on

        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        System.out.println(num1);

    }
}