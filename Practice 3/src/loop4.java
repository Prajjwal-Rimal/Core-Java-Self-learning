//4. Use a `do-while` loop to find the sum of digits of a given number.

class loop4{
    public static void main(String[]args){

        int number = 123;
        int number_for_sum= number;
        int sum=0;

        do{
            int digit = number_for_sum%10;
            sum = sum+digit;
            number_for_sum /=10;
        }while(number_for_sum!=0);
        System.out.print(sum);
    }
}