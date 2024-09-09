// Write a Java program to create a 2D array of integers and initialize it with values. Print the
//elements in matrix form.

class array2d{
    public static void main(String[]args){
        int array[][]={{1,2},{3,4}};

        for(int[] m: array){
            for(int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}