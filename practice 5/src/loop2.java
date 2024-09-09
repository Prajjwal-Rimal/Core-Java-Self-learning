//2. Create a program that reverses a number using a `while` loop.

class loop2{
    public static void main(String[]args){

        int original_number = 102;
        int reverse = 0;

        while (original_number != 0) {
            int digit = original_number % 10;
            reverse = reverse * 10 + digit;
            original_number /= 10;

            System.out.println(reverse);
        }
    }
}
