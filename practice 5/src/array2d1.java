//- Implement a program that calculates the sum of each row and each column of a 2D
//array.

class array2d1{
    public static void main(String[]args){
        int array[][]={{1,2,3,4},{5,6,7,8}};

        for (int m[]:array){
            for (int n: m){
                System.out.print(n);
            }
            System.out.println();
        `}

        int final_addition[]= new int[array[0].length];

        for (int j=0; j<array[0].length;j++){
            final_addition[j] = array[0][j] + array[1][j];
        }

        for (int n: final_addition){
            System.out.print(n+" ");
        }
    }
}