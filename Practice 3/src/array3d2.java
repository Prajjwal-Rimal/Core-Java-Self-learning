//34+ 19
//2. Create a program that initializes a 3D array to represent a cinema seating layout,
// where each seat can be marked as available or booked.

import java.util.Scanner;

class array3d2{
    public static void main(String[]args){
        String array[][][]= new String[1][1][9];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("please mark if seats are available or not" +"seat number : "+(k+1));
                    array[i][j][k] = input.nextLine();
                }
            }
        }

        for(int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                    }
                System.out.println();
                }
            System.out.println();
        }

    }
}