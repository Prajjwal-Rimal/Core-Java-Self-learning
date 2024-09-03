class mobile{
    String brand;
    int price;
    static String name;// belongs to a class not an object will stay same for all objects

    public void show(){
        System.out.println(brand +" "+ price +" "+ name);
    }
}
class staticVariable{
    public static void main(String[]args){
        mobile obj1 = new mobile();
        obj1.brand="apple";
        obj1.price=1500;
        mobile.name="phone";

        mobile obj2 = new mobile();
        obj2.brand="apple";
        obj2.price=1700;
        mobile.name="SMART PHONE";

        mobile.name="new phone";

        obj1.show();
        obj2.show();
    }
}