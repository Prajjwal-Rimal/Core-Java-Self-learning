class arrayJagged{
    public static void main(String[]args){

        int array[][]= new int [2][];
        array[0]= new int[2];
        array[1]= new int[3];

        for (int i=0; i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*100);
            }
        }

        for (int[] m:array){
            for (int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}