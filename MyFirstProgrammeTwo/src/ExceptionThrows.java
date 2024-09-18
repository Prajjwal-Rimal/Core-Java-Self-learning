class z{
    public void show() throws ClassNotFoundException{

            Class.forName("demo");

    }
}
 
class ExceptionThrows{

    static{
        System.out.println(" class loaded");
    }


    public static void main (String[]args){
        z obj = new z();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(" oppsie...");
        }
    }
}