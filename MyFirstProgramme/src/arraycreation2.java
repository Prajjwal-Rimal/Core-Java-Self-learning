class arraycreation2{
    public static void main(String[]args){
        int nums[]=new int[4];
        System.out.println(nums[1]);
        nums [0]=4;
        nums[1]=8;
        nums[2]=3;
        nums[3]=9;

        for(int i=0;i< nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
}