//1. Design a class called `student` with attributes `name`, `rollNumber`, and `marks`.
// Create methods to display student details and calculate grades.

import java.util.Scanner;

class student{
    public String details(String name, int rollnumber, int grade){

        if (grade >= 90) {
            grade = 'A';
        } else if (grade >= 75) {
            grade = 'B';
        } else if (grade >= 60) {
            grade = 'C';
        } else if (grade >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return name +" "+ rollnumber+" "+ (char)grade; // type conversion for int to char
    }
}

class classObj1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);// object of scanner class to accept input

        System.out.println("enter the name of student");// ask for name of the student
        String a =input.nextLine();
        System.out.println("enter the roll number of student");// ask for roll number of the student
        int b =input.nextInt();
        System.out.print("enter the marks of student");// ask for marks of the student
        int c =input.nextInt();

        student sDetail = new student();// object of student class
        String detail = sDetail.details(a,b,c);// method oof student class value goes to detail string
        System.out.println(detail);

    }
}