//- Write a Java program that creates an array of `Book` objects and displays the details of each book.

class books{
    String name;
    String author;
    int price;
}

class arrayObjects{
    public static void main(String[]args){
        books b1 = new books();
        b1.author="chetan bhagat";
        b1.name=" 2 states";
        b1.price=800;

        books b2 = new books();
        b2.author="me";
        b2.name="navin reddy";
        b2.price=15000;

        books bookdetail[]= new books[2];
        bookdetail[0]=b1;
        bookdetail[1]=b2;

        for (books m:bookdetail){
            System.out.println(m.name+" "+m.author+" " +m.price);
        }
    }
}