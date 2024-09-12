
abstract class E{


    public abstract void show();
}

class AbstractAndAnonymousInnerClass{
    public static void main(String[]args){
        E obj = new E()
        {
            public void show(){
                System.out.println("in new showww ");
            }
        };
        obj.show();
    }
}