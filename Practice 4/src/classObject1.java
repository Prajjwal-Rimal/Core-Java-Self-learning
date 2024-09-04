//- Write a Java program that creates a `Student` class with attributes `name`, `rollNumber`, and `marks`. Create
//multiple objects and display their details.

class Student{
    String name;
    int rollnumber;
    int marks;

    public String displaydetailsofstudents(){
        return name+rollnumber+marks;
    }
}

class classObject1{
    public static void main(String[]main){
        Student obj1= new Student();
        obj1.name="prajjwal rimal";
        obj1.rollnumber=1;
        obj1.marks=50;

        Student obj2= new Student();
        obj2.name="prajjwal rijal";
        obj2.rollnumber=2;
        obj2.marks=90;

        System.out.println(obj1.displaydetailsofstudents());
        System.out.println(obj2.displaydetailsofstudents());
    }
}