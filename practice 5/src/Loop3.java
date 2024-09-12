//3. Write a Java program to reverse an array using an enhanced `for` loop.

class Loop3{
    public static void main(String[]args){
        int array[]={1,2,3,4,5,6,7,8,9};
        int reversedArray[]=new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        System.out.println();

        // we can not directly reverse an array in for each loop[ dso we use a normal for loop reverse the array,
        // store the array in the reversed form then print it.

        for (int n: reversedArray){
            System.out.println(n);
        }
    }
}