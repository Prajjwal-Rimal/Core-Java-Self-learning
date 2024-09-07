class humannnn{
    private int age;
    private String name;

    public humannnn()// this is a constructor i.e. a special method
    // coonstructor doesnt return anything
    //another thing is that we dont need to make a reference for the constructor as it is called everytime we create
    // an object of the class
    {// brackets placement is recommended this way
        age=12;
        name="navin";// assigning defualt vlues its better like this
        // always perform operations in a method.
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        this.age =a;
    }

    public String getName(){
        return name;
    }

    public void setName( String b){
        this.name= b;
    }
}

class constructor{
    public static void main(String[]args){
        humannnn obj1= new humannnn();
        humannnn obj2= new humannnn();

        System.out.println(obj1.getName()+" "+obj1.getAge());

        //obj1.setAge(30);
        //obj1.setName("PRAJJWAL RIMAL");
        //System.out.println(obj1.getName()+" "+obj1.getAge());
    }
}