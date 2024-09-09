class array3d{
    public static void main(String[]args){

        int array[][][]=new int[3][3][3];


        for(int i=0;i< array.length;i++){
            for(int j=0; j< array.length;j++){
                for (int k=0;k<array[j].length; k++){
                    array[i][j][k]= (int)(Math.random()*100);
                }
            }
        }

        for (int[][] m:array){
            for (int[] n:m){
                for (int o: n){
                System.out.print(o+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}