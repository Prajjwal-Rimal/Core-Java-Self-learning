//- **Q21:** Write a class `Student` with attributes
// `name`, `rollNumber`, and `marks`. Create methods to assign
// values to these attributes and display them.

import java.util.*;

class student{
    public String details(String name, int rollnumber, int marks){
        return "name: "+ name+ " roll number: "+ rollnumber+ " marks: " +marks;
    }
}
class chatgptClassObj2{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("name");
        String a = input.nextLine();
        System.out.println("roll number");
        int b = input.nextInt();
        System.out.println("marks");
        int c = input.nextInt();

        student stud = new student();
        String studentdetails = stud.details(a,b,c);
        System.out.println(studentdetails);

    }
}