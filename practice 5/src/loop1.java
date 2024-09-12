//1. Write a Java program that prints the Fibonacci series up to `n` terms using a `for` loop.

class loop1{
    public static void main(String[]args){
        int firstItem = 0;
        int secondItem=1;
        int next =0;

        System.out.println(firstItem);
        System.out.println(secondItem);

        for(int i=0;i<10;i++){
            next = firstItem +secondItem;
            firstItem = secondItem;
            secondItem = next;
            System.out.println(next);
        }

    }
}