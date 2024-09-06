class human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age =a;
    }

    public String getName(){
        return name;
    }
    public void setName( String b){
        name= b;
    }
}

class encapsulation{
    public static void main(String[]args){
        human obj1= new human();
        obj1.setAge(30);
        obj1.setName("PRAJJWAL RIMAL");
        System.out.println(obj1.getName()+obj1.getAge());
    }
}