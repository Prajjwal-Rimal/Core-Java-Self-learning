//- Write a program to find the maximum element in each row of a jagged array.

class arrayJagged1{
    public static void main(String[]args){
        int array[][]=new int[3][];
        array[0]= new int[2];
        array[1]= new int[1];
        array[2]= new int[3];

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]= (int)(Math.random()*10);
            }
        }

        for (int []m: array){
            for(int n:m){
                System.out.print(n);
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) { // loop over outer rows
            int max = array[i][0]; // max is set to the first element of the first row
            for (int j = 1; j < array[i].length; j++) {// loop over the elements of jagged array
                if (array[i][j] > max) {// compare max
                    max = array[i][j];// assign max
                }
            }
            System.out.println("Row " + i + ": " + max);// print max in each row of the element 
        }
    }
}
