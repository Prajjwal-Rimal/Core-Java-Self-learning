class humannn{
    private int age;
    private String name;

    public int getAge(){// this is a getter as it gets the value
        // and has a return type
        return age;
    }

    public void setAge(int a){// this is a setter as it has
        // no return value and rather assigns the input value to the
        // instance variables which have been declared private
        this.age =a;
    }

    public String getName(){// name can be different but
        // then its not recommended and doesn't follow the naming convention
        return name;
    }
    public void setName( String b){

        this.name= b;
    }
}

class thisKeyword{
    public static void main(String[]args){
        humannn obj1= new humannn();
        obj1.setAge(30);
        obj1.setName("PRAJJWAL RIMAL");
        System.out.println(obj1.getName()+" "+obj1.getAge());
    }
}