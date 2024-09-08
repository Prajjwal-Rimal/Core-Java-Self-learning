class A{

    public A()
    {
        System.out.println("object created");
    }

    public void show(){
        System.out.println("in a show");
    }
}


class AnnonymousObject{
    public static void main(String[]args){

        new A().show();// cant be used again
        // it will instead create a new object


        // new a() --- this line creates the object
    }
}