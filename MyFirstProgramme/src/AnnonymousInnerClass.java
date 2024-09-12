
class AAAA{

    int age;
    public void show(){
        System.out.println("in method A show");
    }
}

//class BBBB extends AAAA{ // only purpose to override the method
//    public void show(){
//        System.out.println(" in method b show");
//    }
//}

class AnnonymousInnerClass{
    public static void main(String[]args){
        AAAA obj = new AAAA()
        {
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();

        ///BBB obj1 = new BBB; cant resolve


    }
}