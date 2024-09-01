//1. Design a 3D array to store RGB values of an image and write a method to manipulate these values.
//34+ 19
import java.util.Scanner;

class array3d {
    public static void main(String[] args) {
        String array[][][] = new String[1][3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("INPUT WHICH VALUE DO YOU WANT TO MODIFY: 1. red, 2. green, 3. blue");
        int x = input.nextInt();
        input.nextLine();  // Consume the leftover newline character after reading an integer

        // Assigning random values to the 3D array between 0 and 99
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = String.valueOf((int)(Math.random() * 100));
                }
            }
        }

        // Modify specific color values based on user input
        if (x == 1) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the value for red color:");
                String a = input.nextLine();
                array[0][0][i] = a;
            }
        } else if (x == 2) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the value for green color:");
                String b = input.nextLine();
                array[0][1][i] = b;
            }
        } else if (x == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the value for blue color:");
                String c = input.nextLine();
                array[0][2][i] = c;
            }
        } else {
            System.out.println("Incorrect value. Please enter 1, 2, or 3.");
        }

        // Display the final RGB values in the 3D array
        for (int i = 0; i < array.length; i++) {
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
