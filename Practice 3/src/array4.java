//4. Design a program using a 3D array to represent a Rubik’s cube with its different color sides.
class array4{
    public static void main(String[]args){
        String rCube[][][]= new String [1][6][9];

        for (int i=0;i<9;i++){
            rCube[0][0][i]="red";
        }
        for (int i=0;i<9;i++){
            System.out.print(rCube[0][0][i]+" ");
        }

        System.out.println();
        for (int i=0;i<9;i++){
            rCube[0][1][i]="blue";
        }
        for (int i=0;i<9;i++){
            System.out.print(rCube[0][1][i]+" ");
        }

        System.out.println();
        for (int i=0;i<9;i++){
            rCube[0][2][i]="green";
        }
        for (int i=0;i<9;i++){
            System.out.print(rCube[0][2][i]+" ");
        }

        System.out.println();
        for (int i=0;i<9;i++){
            rCube[0][3][i]="yellow";
        }
        for (int i=0;i<9;i++){
            System.out.print(rCube[0][3][i]+" ");
        }

        System.out.println();
        for (int i=0;i<9;i++){
            rCube[0][4][i]="pink";
        }
        for (int i=0;i<9;i++){
            System.out.print(rCube[0][4][i]+" ");
        }

        System.out.println();
        for (int i=0;i<9;i++){
            rCube[0][5][i]="orange";
        }
        for (int i=0;i<9;i++){
            System.out.print(rCube[0][5][i]+" ");
        }

    }
}


//class array4 {
//    public static void main(String[] args) {
//        String[][][] rCube = new String[1][6][9]; // 3D array to represent the Rubik's cube
//
//        // Define colors for each side of the Rubik's cube
//        String[] colors = {"red", "blue", "green", "yellow", "pink", "orange"};
//
//        // Assign colors to each side of the cube
//        for (int side = 0; side < 6; side++) { // Loop through each side
//            for (int i = 0; i < 9; i++) { // Loop through each cell in a side
//                rCube[0][side][i] = colors[side];
//            }
//        }
//
//        // Display the Rubik's cube sides
//        for (int side = 0; side < 6; side++) {
//            System.out.println("Side " + (side + 1) + " (" + colors[side] + "):");
//            for (int i = 0; i < 9; i++) {
//                System.out.print(rCube[0][side][i] + " ");
//            }
//            System.out.println("\n");
//        }
//    }
//}