//1. Write a program to print the Fibonacci series up to a given number using a `for` loop.

class loop1{
    public static void main(String[]args){

        int num1 =0;
        int num2 =1;

        System.out.println(num1);
        System.out.println(num2);

        for(int i=0;i<=5;i++){
            int next = num1+num2;
            System.out.println(next);
            num1 =num2;
            num2 = next;
        }
    }
}