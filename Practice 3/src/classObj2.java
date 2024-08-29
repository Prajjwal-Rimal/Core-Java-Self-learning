//2. Create a class `bankAccount` with attributes `accountNumber`, `balance`, and methods for deposit
// and withdrawal.
// Implement error checking for negative balances.

import java.util.Scanner;

class bankAccount{
    int balance=0;

    public int deposit(int accountNumber, int depositAmount) {
        balance = balance + depositAmount;
        if (balance < 0) {
            System.out.println("negative amount is not accepted");
        }

        return balance;
    }
    public int withdrawal(int accountNumber, int withdrawalAmount){
            balance = balance + withdrawalAmount;
            if (balance < 0) {
                System.out.println("negative amount is not accepted");
            }
            return balance;
    }
}

class classObj2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your account number");
        int number = input.nextInt();

        System.out.println("please enter  1 for deposit and 2 for withdrawal");
        int choice  = input.nextInt();

        if(choice ==1){
            bankAccount BA = new bankAccount();
            System.out.println("please enter amount for deposit");
            int dAmt  = input.nextInt();
            int depamt =BA.deposit(number,dAmt);
            System.out.println(depamt);
        }else if(choice ==2){
            bankAccount BA = new bankAccount();
            System.out.println("please enter amount for withdrawal");
            int wAmt  = input.nextInt();
            int wamt =BA.withdrawal(number,wAmt);
            System.out.println(wamt);
        }
        
    }
}