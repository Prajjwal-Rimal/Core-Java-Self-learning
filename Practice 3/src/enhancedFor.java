//1. Write a program using an enhanced for loop to iterate over an array of integers
// and calculate the sum of elements.

class enhancedFor{
    public static void main(String[]args){
        int arrayA[]={1,2,3,4};


        int sum=0;
        for (int nums: arrayA){
            sum += nums;
            System.out.println(sum);
        }
    }
}