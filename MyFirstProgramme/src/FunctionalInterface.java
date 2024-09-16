
@java.lang.FunctionalInterface
interface aeeee{// functional interface-- interface that has only one method
      // SAM - single abstract method innterface
    void show();
}

class ExtInterface implements aeeee{
    public void show(){
        System.out.println(" in mwthod show, intefrface aeeeee");
    }
}

class FunctionalInterface{
    public static void main(String[]args){

        ExtInterface obj = new ExtInterface();
        obj.show();

        aeeee obj1 = new aeeee()
        {
            public void show(){
                System.out.println("in inner class show");
            }
        };
        obj1.show();
    }
}