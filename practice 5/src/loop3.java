//- Write a program that uses a `do-while` loop to print the multiplication table of a given number.

class loop3{
    public static void main(String[]args){

        int a=1;
        int i=2;
        do{
            System.out.println( i+" * "+a+" = "+ i*a);
            a++;
        } while(a<=10);
    }
}