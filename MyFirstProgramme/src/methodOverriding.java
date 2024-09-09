class aaa{
    public void show(){
        System.out.println("in A show");
    }
    public void configg(){
        System.out.println("in A config");
    }
}
// now we want different statement for show while maintaining inheritance
// we want method with same name but the methods to be over ridden
class bbb extends aaa{
    public void show(){// prefrence to own above others
        // method override
        // can have the same parameters
        System.out.println("in B show");
    }
}

class methodOverriding{
    public static void main(String[]args){
        bbb obj = new bbb();
        obj.show();
        obj.configg();
    }
}