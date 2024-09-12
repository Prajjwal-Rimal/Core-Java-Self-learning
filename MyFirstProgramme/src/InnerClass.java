
class AAA{

    int age;
    public void show(){
        System.out.println("in method show");
    }

    class BBB{ // or we can make this static then we wont have to make qa object
        // inner class can only be static
            public void coni(){
                System.out.println(" in inner class method coni");
            }
    }
}

class InnerClass{
    public static void main(String[]args){
        AAA obj = new AAA();
        obj.show();

        ///BBB obj1 = new BBB; cant resolve

        AAA.BBB obj1 = obj. new BBB();
        obj1.coni();
    }
}