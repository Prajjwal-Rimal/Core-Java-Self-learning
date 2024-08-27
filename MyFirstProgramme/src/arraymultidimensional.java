class arraymultidimensional{
    public static void main(String[]args){
        int nums[][]=new int[3][4];

        //nums[0][0]=1; assigning value manually


        //////////////USING RANDOM TO ADD VALUES RANDOMLY///////////////
        for (int i=0;i< nums.length;i++){
            for (int j=0; j<4;j++){
                nums[i][j]=(int)(Math.random()*100);
                System.out.println(nums[i][j]);
            }
        }

        //////////////PRINTING THROUGH THE ARRAYS/////////////////////
        for (int i=0;i< nums.length;i++){
            for (int j=0; j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        ////////////ENHANCED FOR LOOP/////////////////////////////////
        for (int n[]:nums){// n is a single dimentional array
            for (int m:n){
                System.out.print(m +" ");
            }
            System.out.println();
        }
    }
}