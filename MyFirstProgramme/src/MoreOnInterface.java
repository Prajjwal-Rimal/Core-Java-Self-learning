
// class to class extends
// clas to interface implements
// implement to implement extends

interface Aee{
    void show();
    void config();

}

interface x{
    void run();
}
interface y extends x{

}

class bee implements Aee,y{
    public void show(){
        System.out.println(" show");
    }
    public void config(){
        System.out.println("config");
    }
    public void run(){
        System.out.println("run");
    }
}


class MoreOnInterface{
    public static void main(String[]args){

        Aee obj = new bee();
        obj.show();
        obj.config();

        y obj1 = new bee();
        obj1.run();

    }
}