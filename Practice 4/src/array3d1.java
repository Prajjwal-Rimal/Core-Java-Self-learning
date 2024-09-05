//- Implement a program that calculates the sum of all elements in a 3D array.

class array3d1{
    public static void main(String[]args){
        int array[][][]=new int [2][6][3];

        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                for(int k=0; k<array[i][j].length;k++){
                    array[i][j][k]= (int)(Math.random()*10);
                }
            }
        }

        int sum=0;

        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                for(int k=0; k<array[i][j].length;k++){
                    System.out.print(array[i][j][k]);
                    sum +=array[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}