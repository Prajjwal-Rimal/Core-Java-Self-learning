
class one{
    public void show1(){
        System.out.println("IN SHOW 1");
    }
}

class two extends one{
    public void show2(){
        System.out.println("IN SHOW 2");
    }
}

class UpcastingAndDowncasting{
    public static void main(String[]args){
        one obj = (one)new two();
        obj.show1();


        two obj1=(two) obj;
        obj1.show2();

    }
}