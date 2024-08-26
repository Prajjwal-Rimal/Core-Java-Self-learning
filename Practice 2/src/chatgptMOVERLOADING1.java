//Create a Java class `MathOperations` that includes overloaded methods `add()`:
//- `add(int a, int b)` for adding two integers.
//- `add(double a, double b)` for adding two doubles.
//- `add(int a, int b, int c)` for adding three integers.
//Write a program to demonstrate the usage of these methods.



class mathoperations{
    public int add(int num1, int num2){
        return num1+num2;
    }
    public double add(double num1, double num2){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

class chatgptMOVERLOADING1{
    public static void main(String[]args){
        mathoperations math = new mathoperations();
        int sum = math.add(1,2);
        System.out.println(sum);
    }
}