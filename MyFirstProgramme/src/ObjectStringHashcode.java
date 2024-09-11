import java.util.Objects;

class laptop{
    String model;
    int price;

    public String toString() // overwriting the object class methods
    {
        return model +" : " + price;
    }

    public boolean equals(laptop that){
        if(this.model.equals(that.model)&&this.price==that.price){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        laptop laptop = (laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
class ObjectStringHashcode{
    public static void main (String[]args){
        laptop obj= new laptop();
        obj.model ="lenovo";
        obj.price=1000;

        System.out.println(obj); // prints hexa decimal values
        // everytime we call the object it weill call the .toString() method

        System.out.println(obj.toString());
        // returns class name @ and hexadecimal hashcode
        // what is hash code?
        // cryptography concept


        laptop obj1= new laptop();
        obj1.model ="lenovo";
        obj1.price=1000;
        System.out.println(obj1);
        // the values assigned are same but is the object the same?

        System.out.println(obj==obj1);// both are same their hashcode is different

        boolean result = obj.equals(obj1); // after overidding this checks the string not the hashcode
        System.out.println(result);
    }

}