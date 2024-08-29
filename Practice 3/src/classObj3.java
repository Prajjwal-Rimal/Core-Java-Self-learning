//3. Write a program that creates multiple objects of a `book` class,
// each having attributes like `title`, `author`, and `price`, and methods to display book details.

class book{
    String name;
    String author;
    int price;

    public String bookdetail(){
        return name+" " + author+" "+ price;
    }
}

class classObj3{
    public static void main(String[]args){

        book b1=new book();
        b1.name="anne frank";
        b1.author="anne frank";
        b1.price=10;

        book b2=new book();
        b2.name="Diary of a wimpy kid";
        b2.author="Wimpy kid";
        b2.price=9;

        System.out.println(b1.bookdetail());
        System.out.println(b2.bookdetail());
    }
}