//2. Write a program that creates an array of objects of the `person` class and sorts them based on age.
//34+19+11+ iii == mistakes counter

class person{
    String name;
    int age;
}

class arrayObjects2{
    public static void main(String[]args){

            person p1 = new person();
            p1.name="john";
            p1.age= 34;

            person p2 = new person();
            p2.name="johnas";
            p2.age= 90;

            person p3 = new person();
            p3.name="johnny";
            p3.age= 18;

            person p4 = new person();
            p4.name="joe";
            p4.age= 35;

            person p5 = new person();
            p5.name="jolly";
            p5.age= 21;

            person peopledetails[]=new person[5];
            peopledetails[0]=p1;
            peopledetails[1]=p2;
            peopledetails[2]=p3;
            peopledetails[3]=p4;
            peopledetails[4]=p5;


            // swap the values called bubble sort
            for (int i = 0; i < peopledetails.length - 1; i++) {
                    for (int j = 0; j < peopledetails.length - 1 - i; j++) {
                            if (peopledetails[j].age > peopledetails[j + 1].age) {
                                    person temp = peopledetails[j];
                                    peopledetails[j] = peopledetails[j + 1];
                                    peopledetails[j + 1] = temp;
                            }
                    }
            }


            System.out.println("Sorted person details by age:");
            for (int i = 0; i < peopledetails.length; i++) {
                    System.out.println("Name: " + peopledetails[i].name + ", Age: " + peopledetails[i].age);
            }
    }
}