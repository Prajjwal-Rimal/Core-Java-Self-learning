//2. Create a jagged array that stores test scores of students where
// each student took a different number of tests.

import java.util.Scanner;
class jaggedArray1{
    public static void main(String[]args){
        int array[][]=new int[4][];
        array[0]=new int[1];
        array[1]=new int[4];
        array[2]=new int[2];
        array[3]=new int[3];

        Scanner input =new Scanner(System.in);

        for (int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.println("enter the values inside of array"+(i+1));
                array[i][j]= input.nextInt();
            }
        }

        for(int n[]:array){
            for (int m :n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
//iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii