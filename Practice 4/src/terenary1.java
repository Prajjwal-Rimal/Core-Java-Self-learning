//- Implement a program that checks if a student has passed or failed based on their marks
// using a ternary operator.

//3

class passORfail{
    int marks;
    public void passORfail(){
        String result = (marks>=90) ?"a":
                        (marks>=80)?"b":
                        (marks>=70) ?"c":
                        (marks>=60)?"d":
                        (marks>=50) ?"e"
                                :"f";
        System.out.println(result);
    }
}

class terenar1{
    public static void main(String[]args){
        passORfail obj1 = new passORfail();
        obj1.marks=90;

        obj1.passORfail();
    }
}