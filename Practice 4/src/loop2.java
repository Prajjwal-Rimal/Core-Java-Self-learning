//- Implement a program that uses an enhanced `for` loop to sum all elements of an integer array.

class loop2{
    public static void main(String[]args){

        int array[]={1,2,3,4,5,6,7,8,9};

        int sum =0;

        for (int n:array){
            System.out.println(n);
            sum +=n;
        }
        System.out.println("Sum of all elements in the array: " + sum);
    }
}