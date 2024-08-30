class array3{
    public static void main(String[]args){
        int matrixadd[][]={{1,2,3,4},{5,6,7,8}};

        for( int i=0; i<matrixadd.length;i++){
            for (int j=0; j<matrixadd[i].length;j++){
                System.out.print(matrixadd[i][j]+" ");
            }System.out.println();
        }

        int final_addition[]= new int[matrixadd[0].length];// creating a new array of the length 4 by referencing the
        // internal array of the two dimentional array
        System.out.println(matrixadd[0].length);
        System.out.println();

        for (int j=0; j<matrixadd[0].length;j++){// since we know how many array in the 2d array we just loop for
            // elements inside of them
            final_addition[j] = matrixadd[0][j] + matrixadd[1][j];
        }

        for (int n: final_addition){
            System.out.print(n+" ");
        }

        System.out.println();
        System.out.print(matrixadd[0][0]+ matrixadd[1][0]+" ");
        System.out.print(matrixadd[0][1]+ matrixadd[1][1]+" ");
        System.out.print(matrixadd[0][2]+ matrixadd[1][2]+" ");
        System.out.print(matrixadd[0][3]+ matrixadd[1][3]+" ");
    }
}