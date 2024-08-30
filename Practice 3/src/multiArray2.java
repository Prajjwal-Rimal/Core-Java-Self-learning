//2. Create a program that multiplies two matrices using 2D arrays.

class multiArray2{
    public static void main(String[]args){
        int sum[][]={{1,3,5,7},{2,4,6,8}};
        for (int i=0; i<sum.length;i++){
            for (int j=0; j<sum[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        int multiplied[]=new int[4];// manual printitng time consuming
        multiplied[0]=(sum[0][0]*sum[1][0])+(sum[0][1]*sum[1][2]);
        multiplied[1]=(sum[0][0]*sum[1][1])+(sum[0][1]*sum[1][3]);
        multiplied[2]=(sum[0][2]*sum[1][0])+(sum[0][3]*sum[1][2]);
        multiplied[3]=(sum[0][2]*sum[1][1])+(sum[0][3]*sum[1][3]);

        for(int m: multiplied){
            System.out.print(m+" ");
        }
    }
}


//class multiArray2 {
//    public static void main(String[] args) {
//        // Define two matrices
//        int matrix1[][] = {{1, 3, 5}, {2, 4, 6}};
//        int matrix2[][] = {{7, 8}, {9, 10}, {11, 12}};
//
//        // Determine the dimensions of the resulting matrix
//        int rows1 = matrix1.length;          // Number of rows in the first matrix
//        int cols1 = matrix1[0].length;       // Number of columns in the first matrix
//        int cols2 = matrix2[0].length;       // Number of columns in the second matrix
//
//        // Resulting matrix to store the product
//        int result[][] = new int[rows1][cols2];
//
//        // Multiply the matrices
//        for (int i = 0; i < rows1; i++) { // Iterating over rows of matrix1
//            for (int j = 0; j < cols2; j++) { // Iterating over columns of matrix2
//                result[i][j] = 0;
//                for (int k = 0; k < cols1; k++) { // Iterating over columns of matrix1 and rows of matrix2
//                    result[i][j] += matrix1[i][k] * matrix2[k][j];
//                }
//            }
//        }
//
//        // Print the result
//        System.out.println("Product of the matrices:");
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}