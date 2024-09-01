//1. Create a class `product` and an
// array to store multiple `product` objects.
// Write methods to add and display product details.

//34+19+11


class product{
 String name;
 String type;
 int price;
}

class arrayObjects{
    public static void main(String[]args){

        product p1= new product();
        p1.name = "apple";
        p1.type="fruit";
        p1.price=20;

        product p2= new product();
        p2.name = "banana";
        p2.type="fruit";
        p2.price=100;

        product p3= new product();
        p3.name = "cherry";
        p3.type="fruit";
        p3.price=40;

        product items[]=new product[3];
        items[0]=p1;
        items[1]=p2;
        items[2]=p3;

        for (int i=0; i< items.length; i++){
            System.out.println("name "+items[i].name +" type "+items[i].type +" price "+items[i].price);
        }
    }
}