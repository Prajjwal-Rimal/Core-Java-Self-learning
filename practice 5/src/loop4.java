//- Create a program that uses an enhanced `for` loop to find the average of an array of integers.

class loop4{
   public static void main(String[]args){
       int array[]={1,2,3,4,5,6,7,8,9};

       int sum =0;
       int average=0;

       for (int m: array){
           sum = sum +m;
       }
       average = sum/ array.length;
       System.out.println("The sum of array is "+ sum);
       System.out.println("the average of the array is " + average);
   }
}