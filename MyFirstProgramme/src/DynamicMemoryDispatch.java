class s{
    public void show(){
        System.out.println("in class S method show");
    }
}

class t extends s{// inherits from s
    public void show(){
        System.out.println("in class T method show");
    }
}
class u extends s{// inherits from s
    public void show(){
        System.out.println("in class U method show");
    }
}

class DynamicMemoryDispatch{
    public static void main(String[]args){
        //s obj = new t(); // type can be parent but the object can be child
        // refrence of super class object of sub class

        s obj = new s();
        obj.show();

        obj = new t(); // obj now refers to b
        // breaks link from from s and jopins with t
        obj.show();

        obj=new u();
        obj.show();
        // this is run time polymorphism and this is called dynamic method dispatch


        // only works with inheritance
        // the  type is a but then the method id of diffrent typr
        // parent variable is the type and the methods are created for the child class
    }
}