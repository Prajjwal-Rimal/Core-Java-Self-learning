//2. Create a program that reverses a number using a `while` loop.

class loop2{
    public static void main(String[]args){

        int original_number = 102;
        int number_to_reverse = original_number;
        int reverse = 0;

        while (number_to_reverse != 0) {
            int digit = number_to_reverse % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            number_to_reverse /= 10; // Remove the last digit from the original number

            System.out.println(reverse);
        }
    }
}
