// **Question 11:**
//Create a Java class `PrintValues` with overloaded methods `print()`:
//- `print(int a)` to print an integer.
//- `print(double a)` to print a double.
//- `print(String a)` to print a string.
//Write a program to demonstrate the usage of these methods.

class PrintVales{
    public int print(int a){
        return a;
    }
    public double print(double a){
        return a;
    }
    public String print(String a){
        return " "+a;
    }
}

class chatgptMOVERLOADING2{
    public static void main(String[]args){
        PrintVales obj = new PrintVales();
        int output = obj.print(1);
        System.out.println(output);
        double output1 = obj.print(1.55);
        System.out.println(output1);
        String output2 = obj.print("1");
        System.out.println(output2);
    }
}