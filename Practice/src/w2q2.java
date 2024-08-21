/*// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


import java.util.Scanner;
public class Average
{
    public static void main(String[] args)
    {
       int val1, val2, val3;
       double average;
       Scanner scan = new Scanner(System.in) ;


       // get three values from user
       System.out.println("Please enter three integers and " +
                       "I will compute their average");


       ____________________________________


       ____________________________________


       ____________________________________


       //compute the average


       ____________________________________


       //print the average


       ____________________________________


    }
}*/

import java.util.Scanner;// importing scanner class from the java.util package
class w2q2{
    public static void main(String args[])
    {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in) ;
        System.out.println("please enter first value: ");
        val1 = scan.nextInt() ;
        System.out.println(val1);
        System.out.println("please enter second value: ");
        val2 = scan.nextInt() ;
        System.out.println(val2);
        System.out.println("please enter third value: ");
        val3 = scan.nextInt() ;
        System.out.println(val3);

        System.out.println();
        average=(val1+val2+val3)/3;
        System.out.println("the average of the values is" + average);
    }
}