//Write a program to input values into a 2D array and calculate the sum of its rows and columns.
class multiArray{
    public static void main(String[]args){
        int sum[][]={{1,2,3,4},{4,3,2,1}};
        for (int i=0; i<sum.length;i++){
            for (int j=0; j<sum[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        int added[]= new int[4];
        for(int k =0; k<4;k++){
            added[k] = sum[0][k] + sum[1][k];// added ko 0 ma [0][0]+[1][0] ko vlue store gara
        }

        for(int m: added){
            System.out.print(m);
        }
        System.out.println();


        int rows[]= new int[4];
        for(int k =0; k<4;k++){
            rows[k] += sum[0][k];
        }

        int sumed=0;
        for(int m=0; m<4;m++){
            sumed += rows[m];
            System.out.println(sumed);
        }
    }
}