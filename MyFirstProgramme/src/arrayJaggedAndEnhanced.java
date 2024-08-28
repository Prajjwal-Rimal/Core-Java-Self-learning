class arrayJaggedAndEnhanced{
    public static void main(String[]args){


        //int nums[][]=new int[3][4]; in this we have the array and the elements
        //space pre-defined. But what if each array contains
        // different no of elements

        int nums[][]=new int[3][];// we have 3 arrrays
        // we dont know the size of each array this is called a JAGGED ARRAY

        nums[0]=new int[3];// individually specify the number of columns
        nums[1]=new int[4];
        nums[2]=new int[2];

        for (int i=0;i< nums.length;i++){
            for (int j=0; j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
                System.out.println(nums[i][j]);
            }
        }

        for (int n[]:nums){// n is a single dimentional array
            for (int m:n){
                System.out.print(m +" ");
            }
            System.out.println();
        }

    }
}