import java.util.Scanner;
class calculation{

    public int calculations(int value1, int value2, String command) {

        int i = 0;
        switch (command) {
            case "add":
                i = value1 + value2;
                break;
            case "subtract":
                i = value1 - value2;
                break;
            case "multiply":
                i = value1 * value2;
                break;
            case "divide":
                i = value1 / value2;
                break;
        }

        return i; // since it is not a void function it needs a return type
    }
}

class customPractie1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number you want to enter");
        int x = input.nextInt();
        System.out.println("enter the number you want to enter");
        int y = input.nextInt();
        System.out.println("what is the calculation that you want to perform: ");
        String z= input.next().toLowerCase();

        calculation calc = new calculation();
        int result = calc.calculations(x,y,z);
        System.out.println("based on your input your answer is: " + result);
    }
}