//3. Write a program to print a pattern like a right-angled triangle using nested `for` loops.

class loop3{
    public static void main(String[]args){

        for (int i=0; i<=5;i++){
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// i=0 j=0
// i=1 j=0
// i=2 j=1
// i=3 j=2
// i=4 j=3
// i=5 j=4
