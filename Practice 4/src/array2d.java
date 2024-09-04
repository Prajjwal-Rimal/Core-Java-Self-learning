//- Write a Java program to perform matrix multiplication on two 2D arrays.

class array2d{
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