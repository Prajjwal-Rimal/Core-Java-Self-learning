//- **Q18:** Create a program that calculates the factorial of a number using a `while` loop.
class chatgptloop2{
    public static void main(String[]args){

        int factorial = 1;
        int i=1;
        while (i <= 5) {
            factorial *= i;
            System.out.println(factorial);
            i++;
        }

    }
}