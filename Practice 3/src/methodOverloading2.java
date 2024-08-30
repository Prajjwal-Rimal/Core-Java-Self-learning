//2. Write a program that defines a method `area` to calculate the area of different shapes
// (circle, rectangle, and square) using method overloading.

class calculateArea{
    double pi=3.14;
    public double area(double radius){
        return pi*radius*radius;
    }
    public double area(int side){
        return side*side;
    }
    public double area(int length, int width){
        return length*width;
    }
}
class methodOverloading2{
    public static void main(String[]args){
        calculateArea cArea= new calculateArea();
        System.out.println(cArea.area(5.99));
        System.out.println(cArea.area(5));
        System.out.println(cArea.area(5,9));

    }
}