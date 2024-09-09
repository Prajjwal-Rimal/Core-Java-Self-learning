class loop1 {
    public static void main(String[] args) {
        int count = 0;  // Counter for the number of primes found
        int num = 2;    // Starting number to check for primality

        while (count < 10) {  // Continue until we find 10 prime numbers
            int divisorCount = 0;  // Count of divisors other than 1 and the number itself

            // Check for divisors of 'num'
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    divisorCount++;  // Increment if a divisor is found
                    break;  // Exit the loop if we find a divisor
                }
            }

            // If no divisors were found, then it's a prime number
            if (divisorCount == 0) {
                System.out.println(num + " is a prime number.");
                count++;  // Increment the count of prime numbers found
            }

            num++;  // Check the next number
        }
    }
}
