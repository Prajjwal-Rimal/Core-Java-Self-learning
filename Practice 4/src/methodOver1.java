//- Write a program that includes a method `printDetails` to display different
// details based on different types
//of input (method overloading).

class printDetails1{
    public String printdetails2(String name, String address, int salary){
        return name+address+salary;
    }
    public String printdetails2(String name, String address, double bonus){
        return name+address+bonus;
    }
}

class methodOver1{
    public static void main(String[]args){

        printDetails1 obj1 = new printDetails1();
        System.out.println(obj1.printdetails2("prajjwal rimal","hattiban",2000));
        System.out.println(obj1.printdetails2("prajjwal rimal","hattiban",0.5));
    }
}