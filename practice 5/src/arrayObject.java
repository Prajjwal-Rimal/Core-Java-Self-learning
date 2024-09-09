class book{
    String title;
    String author;
    int price;
}
class arrayObject{
    public static void main(String[]args){

        book obj= new book();
        obj.price=1500;
        obj.author="jjkhgjk";
        obj.title="uiyuyio";

        book obj1= new book();
        obj1.price=1500;
        obj1.author="jjjk";
        obj1.title="uiy";

        book books[]= new book[2];
        books[0]=obj;
        books[1]=obj1;

        for (int i=0; i< books.length; i++){
            System.out.println("name "+books[i].title +" type "+books[i].author +" price "+books[i].price);
        }
    }
}