//- Write a program to print the first 10 numbers in the Fibonacci sequence using a `for` loop.

class loops1{
    public static void main(String[]args){
        int first =0;
        int second=1;

        // Printing the first two numbers
        System.out.println(first);
        System.out.println(second);

        // Loop to print the next 8 numbers in the Fibonacci sequence
        for (int i = 2; i < 10; i++) { // Start from 2 because the first two numbers are already printed
            int next = first + second;
            System.out.println(next);

            // Update for the next iteration
            first = second;
            second = next;
        }
    }
}