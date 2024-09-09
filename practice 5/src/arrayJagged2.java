class arrayJagged2{
    public static void main(String[]args){

        int array[][]= {{9,1},{1,5,3}};

        int sum =0;

        for (int[] m:array){
            for (int n:m){
                System.out.print(n+" ");
                sum = sum+ n;
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}