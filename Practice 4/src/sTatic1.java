//- Create a program that uses a static block to initialize static variables and display their values.
class example3{

    static int number;
    static String message;

    static {// this is the first static block this will be excuted first
        number =10;
        System.out.println("static method 1 finished");
    }

    static{// this is the second static block this will be executed second
        message="hello world";
        System.out.println("static block 2 executed");
    }

    // static blocks are only executed once in the very beginning by the jvm when the classes are compiled
}

class sTatic1{
    public static void main(String[]args) {
        System.out.println(example3.number);
        System.out.println(example3.message);
    }
}