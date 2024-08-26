//Write a Java program that checks whether a number is a palindrome using a `while` loop.

class chatgptFOR4 {
    public static void main(String[] args) {
        int originalNumber = 121; // Replace with any number you want to check
        int number = originalNumber; // Copy of the original number for manipulation
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // Check if the original number and the reversed number are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
