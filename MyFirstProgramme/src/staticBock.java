class examples {
    static int number;
    static String message;

    // Static block 1
    static {
        number = 10;
        System.out.println("Static Block 1 executed.");
    }

    // Static block 2
    static {
        message = "Hello, Java!";
        System.out.println("Static Block 2 executed.");
    }
}

class staticBlock {
    public static void main(String[] args) {
        // Accessing static variables using the class name
        System.out.println("Number: " + examples.number);
        System.out.println("Message: " + examples.message);
    }
}
