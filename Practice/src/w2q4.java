//Write an application that prompts for and reads integer representing the length of a square’s side,
// then prints the square’s perimeter and area.

import java.util.Scanner;

class w2q4{
    public static void main(String args[])
    // public means it can be accessed outside the class
    // static means we dont need to create a method to call this class
    //void means the method class doesnt return any value
    //main is where the programme start from
    //string args[] take a array of arguements from the comand line
    {
        System.out.println("input length of any one sid of the square");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int perimeter=4*length;
        System.out.println("the perimeter is "+perimeter);
        System.out.println();
        int area = length*length;
        System.out.println("the area is "+area);
    }
}