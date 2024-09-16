enum Laptoop{
    macBook(), XPS(1500), surface(2500), Thinkpad(1800);
    // object (value)
    private int price;

    private Laptoop(){
        price=10000;
    }

    private Laptoop(int price){
     this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class EnumClass {
    public static void main(String[] args) {

        Laptoop details = Laptoop.macBook;
        System.out.println(details.getClass().getSuperclass());
        System.out.println(details+" : "+details.getPrice());

        Laptoop obj1 = Laptoop.surface;
        obj1.setPrice(6000);

        for (Laptoop lap: Laptoop.values() ){
            System.out.println(lap+" "+ lap.getPrice());
        }

    }
}