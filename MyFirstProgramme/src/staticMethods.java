class mobiles{
    String brand;
    int price;
    static String name;// belongs to a class not an object will stay same for all objects

    public void show(){
        System.out.println(brand +" "+ price +" "+ name);
    }
    // instance method as static is not mentioned
    //
    //whenever we are working with a non static method we need to create a object of it

    public static void show1(mobiles obj){
        System.out.println(obj.brand +" "+ obj.price +" "+ name);
    }
}
class staticMethods{
    public static void main(String[]args){
        mobiles obj1 = new mobiles();
        obj1.brand="apple";
        obj1.price=1500;
        mobiles.name="phone";

        mobiles obj2 = new mobiles();
        obj2.brand="apple";
        obj2.price=1700;
        mobiles.name="SMART PHONE";

        mobiles.name="new phone";

        obj1.show();
        obj2.show();

        mobiles.show1(obj1);
    }
}