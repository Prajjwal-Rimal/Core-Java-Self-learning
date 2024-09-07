class Person{
    private int age;
    private String name;

    public Person()// default constructor
    {
        age=12;
        name="navin";
    }

    public Person(int a, String s)//accepts parameter so parameterized
    {
        age = a;
        name = s;
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

class constructorDefaultVsParametarised{
    public static void main(String[]args){
        Person obj1= new Person();
        Person obj2= new Person(18,"Prajjwal rimal");
        System.out.println(obj1.getName()+" "+obj1.getAge());
        System.out.println(obj2.getName()+" "+obj2.getAge());

        //obj1.setAge(30);
        //obj1.setName("PRAJJWAL RIMAL");
        //System.out.println(obj1.getName()+" "+obj1.getAge());
    }
}