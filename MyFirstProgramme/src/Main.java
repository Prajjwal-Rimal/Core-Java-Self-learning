class Main {
    public static void main(String args[]) {

        System.out.println("hello world");
        System.out.println();

        int x=2;
        int y =8;
        int sum = x+y;
        System.out.println(sum);
        System.out.println();

        double marks =5.0;
        float marks2 = 6.5f;
        System.out.println(marks);
        System.out.println(marks2);

        int num1=9;
        byte by=127;// its range is till 127 if it exceeds it, it wont work
        short sh=123;
        long l= 5854l;// without l it wont work

        float f =5.7f;// without f it wont work
        double d=5.99;// default format to store decimals will work

        char k='k';//if " " wont work and if no quote still wont work

        boolean b= true;// no need for quote as true is already a keyword
        System.out.println();

        //literals
        int num3 =9;
        int num4 = 0b1001;
        int num5 = 0x1AE;
        int num6 = 10_00_00_000;
        float num7 = 12e10f;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println();
        char c='c';
        c++;
        System.out.println(c);

    }
}