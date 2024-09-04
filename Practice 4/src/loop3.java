//- Create a program to find the factorial of a number using a `while` loop.

class loop3{
    public static void main(String[]args){

        int factorial=1;
        int i=1;
        while(i<5){
            factorial = factorial * i;
            i++;
        }System.out.println(factorial);
    }
}