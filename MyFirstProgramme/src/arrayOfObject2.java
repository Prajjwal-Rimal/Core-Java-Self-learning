class studentsss{
    int rollNumber;
    String name;
    int marks;
}

class arrayOfObject2{
    public static void main(String[]args){
        studentsss student1 = new studentsss();
        student1.rollNumber = 1;
        student1.name="prajjwal";
        student1.marks=100;

        studentsss student2 = new studentsss();
        student2.rollNumber = 2;
        student2.name="pwal";
        student2.marks=60;

        studentsss student3 = new studentsss();
        student3.rollNumber = 3;
        student3.name="wal";
        student3.marks=10;

        studentsss student[]=new studentsss[3];
        student[0]= student1;
        student[1]= student2;
        student[2]= student3;
        for(int i=0; i<student.length;i++){
            System.out.println(student[i].rollNumber+" : "+student[i].name+" : "+
                    student[i].marks);
        }
    }
}