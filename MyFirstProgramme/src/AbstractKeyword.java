abstract class vehicle{
    public abstract void drive(); // just declare it
        // if dont know how to implement why call it
    // we cant create object of abstract class

    public void music(){
        System.out.println("play music");
    }
}

class wagonR extends vehicle{ // inheriting class must have a drive method
    // this type of class is called a concrete class
    public void drive(){
        System.out.println("driving");
    }
}

class AbstractKeyword{
    public static void main(String[]args){
        vehicle obj = new wagonR();

         obj.drive();
        obj.music();
    }
}