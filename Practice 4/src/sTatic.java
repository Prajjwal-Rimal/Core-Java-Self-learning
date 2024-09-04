//- Write a Java program to demonstrate the use of static variables and methods.


class example1{
    static int number;// say same for all the instances they are called
    static int number2;
    int num3;

    public int multiply(){
        return number*number2;// static variables can be accessed by non static methods
    }

    public static int add(){// static methods can not access non static variables
        return number+number2;
    }
}
class sTatic{
    public static void main(String[]args){
        example1.number=10;
        example1.number2=5;// to call static variables we do not need to create a object as the static variables
        // belongs to a class rather than the method
        System.out.println(example1.add());// same gores for methods the methods belong to a class and not a object
        // so theyu can also be referenced as classname.method.

        example1 obj1 = new example1();
        System.out.println(obj1.multiply());// since multiply is a non static method we call it using an object
    }
}