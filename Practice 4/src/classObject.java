//- Design a class `Book` with properties like `title`, `author`, and `price`.
// Write a program to create an object of
//this class and display the details of the book.

class book{
    String title;
    String author;
    int price;

    public String displaydetailsofbook(){
        return title+author+price;
    }
}

class classObject{
    public static void main(String[]main){
        book obj1= new book();
        obj1.title="3 mistakes of my life";
        obj1.author="chetan bhaghat";
        obj1.price=500;

        System.out.println(obj1.displaydetailsofbook());
    }
}