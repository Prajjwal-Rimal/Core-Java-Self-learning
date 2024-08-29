class studentssss{
    int rollNumber;
    String name;
    int marks;
}

class forEachLoop2{
    public static void main(String[]args){
        studentssss student1 = new studentssss();
        student1.rollNumber = 1;
        student1.name="prajjwal";
        student1.marks=100;

        studentssss student2 = new studentssss();
        student2.rollNumber = 2;
        student2.name="pwal";
        student2.marks=60;

        studentssss student3 = new studentssss();
        student3.rollNumber = 3;
        student3.name="wal";
        student3.marks=10;

        studentssss student[]=new studentssss[3];
        student[0]= student1;
        student[1]= student2;
        student[2]= student3;

        for(studentssss n : student){
            System.out.println(n.name+" : "+n.rollNumber+" : "+n.marks);
        }
    }
}