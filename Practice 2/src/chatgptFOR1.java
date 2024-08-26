//Write a Java program to calculate the factorial of a number using a `for` loop.
class chatgptFOR1{
    public static void main(String[]args){
        int number = 6;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;

        }
        System.out.print(factorial);
    }
}