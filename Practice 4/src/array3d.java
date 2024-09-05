//- Write a Java program to initialize a 3D array and display its elements in a formatted way.

class array3d{
    public static void main(String[]args){
        int array[][][]=new int [2][6][3];

        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                for(int k=0; k<array[i][j].length;k++){
                    array[i][j][k]= (int)(Math.random()*10);
                }
            }
        }

        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                for(int k=0; k<array[i][j].length;k++){
                    System.out.print(array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}