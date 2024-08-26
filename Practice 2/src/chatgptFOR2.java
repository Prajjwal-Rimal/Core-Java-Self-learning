//Write a Java program that prints all prime numbers between 1 and 100 using a `while` loop.
class chatgptFOR2{
    public static void main(String[]args){

        int i =2;
        while (i <= 100) {
            boolean isPrime = true;

            // Check if i is prime by testing divisibility from 2 to the square root of i
            int j = 2;
            while (j * j <= i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.println(i + " is a prime number");
            }

            i++;
        }
    }
}