//Create a Java class `Rectangle` with instance variables
// for `length`
// and `width`.
//Implement methods to calculate and return the area
// and perimeter of the rectangle.
//Also, include a method to display the
// dimensions, area, and perimeter.

import java.util.Scanner;

class rectangle{

   public int area(int a, int b){
       int area =  a*b;
       return area;
   }
    public int perimeter(int a, int b){
       int perimeter = 2*(a*b);
       return perimeter;
    }
}

class chatgptClassMeth1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the rectangle");
        int a = input.nextInt();
        System.out.println("enter the width of the rectangle");
        int b = input.nextInt();

        rectangle rec = new rectangle();
        int final_area= rec.area(a,b);
        int final_perimeter= rec.perimeter(a,b);

        System.out.println(final_area + " area");
        System.out.println(final_perimeter + " `perimeter");
    }
}