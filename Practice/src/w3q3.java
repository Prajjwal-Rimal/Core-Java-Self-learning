//Write a small program that prompts the user for a sentence and then outputs
// the same sentence with the characters in each word reversed. For example, if
// the user enters “This is a sample sentence.” then the output would be “sihT si a elpmas .ecnetnes.”
// Note the use of multiple Scanner objects may be helpful with this program.

import java.util.Scanner;
class w3q3{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        String a= input.nextLine();
        System.out.println(a.length());


        for(int i=a.length()-1; i>=0;i--){
            System.out.print(i);
        }

    }
}