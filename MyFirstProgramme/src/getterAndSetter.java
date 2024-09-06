class humann{
    private int age;
    private String name;

    public int getAge(){// this is a getter as it gets the value
        // and has a return type
        return age;
    }

    public void setAge(int a){// this is a setter as it has
        // no return value and rather assigns the input value to the
        // instance variables which ahvae been declared private
        age =a;
    }

    public String getName(){// name can be diffrent but
        // then its not recommended and doesnt follow the naming convention
        return name;
    }
    public void setName( String b){
        name= b;
    }
}

class getterAndSetter{
    public static void main(String[]args){
        humann obj1= new humann();
        obj1.setAge(30);
        obj1.setName("PRAJJWAL RIMAL");
        System.out.println(obj1.getName()+obj1.getAge());
    }
}