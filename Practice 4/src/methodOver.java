//- Implement a Java program with a method `calculateArea` to find the area of a
// circle and a rectangle (method overloading).

class calculatearea1{
    public double calculateArea(int length){
        return 3.14*length*length;
    }
    public int calculateArea(int length, int height){
        return length*height;
    }
}

class methodOver{
    public static void main(String[]args){
        calculatearea1 obj1= new calculatearea1();
        System.out.println(obj1.calculateArea(4,5));
        System.out.println(obj1.calculateArea(4));
    }
}