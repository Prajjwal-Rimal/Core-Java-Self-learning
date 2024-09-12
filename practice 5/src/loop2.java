//2. Create a program to find the sum of all even numbers from 1 to 100 using a `while` loop.

class loop2{
    public static void main(String[]args){
        int evenSum=0;
        int n=1;

        while (n<=100){
            if (n%2==0) {
                evenSum = evenSum + n;
            }
            n++;
        }
        System.out.println(evenSum);
    }
}