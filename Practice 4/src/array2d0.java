//- Create a program that initializes a 2D array and finds the sum of all elements in the array.


class array2d0{
    public static void main(String[]args){
        int array[]=new int[4];
        array[0]=2;
        array[1]=3;
        array[2]=1;
        array[3]=2;

        int sum=0;

        for (int i=0;i<array.length;i++){

            sum = sum+ array[i];
            System.out.println(sum);
        }
    }
}