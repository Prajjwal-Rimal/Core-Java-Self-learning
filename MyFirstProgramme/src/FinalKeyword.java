// can be used vith a variable method and a class

class mathDevices{

    // if this is written as  final class mathDevice
    // inheritance will be stopped and
    // math device adv will not be able to inherit its properties
    final public void show(){
        System.out.println("prajjwal");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}

class mathDevicesAdvance extends mathDevices{
//    public void show(){
//        System.out.println("by john");
//    }
}

class FinalKeyword{
    public static void main(String[]args){
        final int num =8;
       // num=9; cant change the value
        System.out.println(num);


        mathDevicesAdvance obj = new mathDevicesAdvance();
        obj.show();
        obj.add(1,2);

    }
}