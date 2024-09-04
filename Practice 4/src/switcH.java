//- Create a program that takes a number (1-7) as input and prints the corresponding
// day of the week using a switch statement.

import java.util.Scanner;

class weekSwitch{
    public void weeKSwitch(int week){
        switch (week){
            case 1:System.out.println("Sunday");
            break;
            case 2:System.out.println("Monday");
                break;
            case 3:System.out.println("Tuesday");
                break;
            case 4:System.out.println("Wednesday");
                break;
            case 5:System.out.println("Thursday");
                break;
            case 6:System.out.println("Friday");
                break;
            case 7:System.out.println("Saturday");
                break;
                // adding feault would have been better
            // default:
            //system.out.println("invalid ionput please entter the correct input ")
        }
    }
}

class switcH{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please choose a number from 1-7");
        int weekNumber= input.nextInt();

        weekSwitch obj1 = new weekSwitch();
        obj1.weeKSwitch(weekNumber);

        input.close();// closing the scanner to prevent resource leak
    }
}

