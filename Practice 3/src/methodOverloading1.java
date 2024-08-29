//1. Create a class `mathoperations` with methods to add, subtract, multiply, and divide two numbers.
// Overload the methods to handle different types of input (int, double).


class mathoperations{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public double add(double num1, double num2){
        return num1 + num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }
    public double subtract(double num1, double num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public double multiply(double num1, double num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2){
        return num1/num2;
    }
    public double divide(double num1, double num2){
        return num1 / num2;
    }
}

class methodOverloading1{
    public static void main(String[]args){
        mathoperations math = new mathoperations();
        System.out.println(math.add(1,2));
        System.out.println(math.add(1.6,2.9));
        System.out.println(math.subtract(2,1));
        System.out.println(math.subtract(3,2.9));
        System.out.println(math.multiply(4,2));
        System.out.println(math.multiply(9.0,3.1));
        System.out.println(math.divide(1,2));
        System.out.println(math.divide(1.6,2.9));
    }
}