//- Write a Java program to initialize an array of integers and print all its elements.

class array{
    public static void main(String[]args){
        int array[]=new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;

        for (int n:array){
            System.out.print(n+" ");
        }
    }
}