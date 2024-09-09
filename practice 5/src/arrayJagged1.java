class arrayJagged1{
    public static void main(String[]args){

        int array[][]= {{9,1},{1,5,3}};
        int maximum1=0;
        int maximum2=0;

        for(int i=0;i< array.length;i++){
            for(int j=0; j< array.length;j++){
                if (maximum1<array[0][j]){
                    maximum1= array[0][j];
                }

                if (maximum2<array[1][j]){
                    maximum2= array[1][j];
                }
            }

        }

        for (int[] m:array){
            for (int n:m){
                System.out.print(n+" ");
            }
            System.out.println();
        }

        System.out.println(maximum1);
        System.out.println(maximum2);
    }
}