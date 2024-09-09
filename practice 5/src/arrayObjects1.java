class student {
    int marks;
    int id;

    // Method to calculate the average marks of the students in the array
    public double calculateAverageMarks(student[] array) {
        int totalMarks = 0;
        int numberOfStudents = array.length;

        for (student m : array) {
            totalMarks += m.marks;
        }

        return (double) totalMarks / numberOfStudents;
    }
}

class arrayObjects1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.marks = 100;
        s1.id = 1;

        student s2 = new student();
        s2.marks = 60;
        s2.id = 2;

        student s3 = new student();
        s3.marks = 10;
        s3.id = 3;

        student[] marksArray = new student[3];
        marksArray[0] = s1;
        marksArray[1] = s2;
        marksArray[2] = s3;

        student student = new student();
        double averageMarks = student.calculateAverageMarks(marksArray);
        System.out.println(averageMarks);
    }
}