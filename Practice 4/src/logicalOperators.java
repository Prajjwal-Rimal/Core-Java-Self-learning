//Create a Java program that determines whether a person is eligible to vote based on age
// and citizenship status using logical operators.

// 8

import java.util.Scanner;

class vote{
    public void checkCitizenship(   int age, String citizen){
        if(age<=18 && citizen.equals("nepali")){ // adding equalsIgnoreCase would have been better
            System.out.println("is eligible to vote");
        }else{
            System.out.println("is not eligible to vote");
        }
    }
}

class logicalOperators{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println(" enter your age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println(" enter your citizenship country");
        String citizenship = input.nextLine();

        vote obj1 = new vote();
        obj1.checkCitizenship(age, citizenship);

        // add input.close to close the scanner class it is always recommended to close the scanner class
    }
}