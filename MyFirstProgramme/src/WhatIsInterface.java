
interface Ae{
    int age =44;// by default final and static
    String area="mumbai";
    void show();
    void config();

}

class be implements Ae{
    public void show(){
        System.out.println(" show");
    }
    public void config(){
        System.out.println("config");
    }
}


class WhatIsInterface{
    public static void main(String[]args){

        System.out.println(Ae.area);
        System.out.println(Ae.age);

        Ae obj = new be();
        obj.show();
        obj.config();

        System.out.println(obj.area); // we can also call static variables like this
    }
}