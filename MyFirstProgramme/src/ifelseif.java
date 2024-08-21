import java.util.Scanner;

class ifelseif{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the first value: ");
        int x =input.nextInt();
        System.out.println("please enter the second value: ");
        int y=input.nextInt();
        System.out.println("please enter the third value: ");
        int z= input.nextInt();

        if (x>y && x>z)
        {
            System.out.println(x);
        }
        else if (y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
}