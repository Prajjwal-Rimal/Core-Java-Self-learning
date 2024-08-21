//Write an application that converts miles to kilometers.(One mile equals 1.60935 km).
// Read the miles from the user as a floating point value.

import java.util.Scanner;

class w2q3{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the miles that you want to convert into a kilometer: ");
        float miles = input.nextFloat();// input bhanney scanner class ko object lai call garda
        // tysko input liyera tyslai float value ma rakh
        System.out.println(miles);

        float kilometers= miles * 1.60953f ;
        System.out.println(miles+" is equal to "+kilometers +" kilometers");

    }
}
