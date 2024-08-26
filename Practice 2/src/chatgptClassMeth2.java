//Create a Java class `Student` with instance variables `name`, `rollNumber`, and `marks`.
//Implement methods to set and get the values of these variables. Write a method to calculate
//the grade of the student based on their marks (e.g., A, B, C) and a method to display the student's details.

import java.util.*;

class students{
    String student_name;
    int student_rollNumber;
    int marks;// values not set yet as i am yet to lear the this keyword and getter setters.

    public String grade(String student_name, int student_rollNumber,int marks){
        if (marks>=90){
            System.out.println("A");
        }else if (marks>=80){
            System.out.println("B");
        }else if (marks>=70){
            System.out.println("C");
        }else if (marks>=60){
            System.out.println("D");
        }else if (marks>=50){
            System.out.println("E");
        }else {
            System.out.println("F");
        }

        return "name: "+student_name+" roll number: "+student_rollNumber+" marks: "+marks;
    }
}


class chatgptClassMeth2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please input the students name");
        String name = input.nextLine();
        System.out.println("please input the students roll number");
        int rollNumber = input.nextInt();
        System.out.println("please input the students percentage");
        int percentage = input.nextInt();

        students stud = new students();
        String results = stud.grade(name,rollNumber,percentage);
        System.out.println(results);
    }
}