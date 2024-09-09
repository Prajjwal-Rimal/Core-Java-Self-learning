class aa // every class in java extends the object class
{
    public aa()
    {
        super();
        System.out.println("in a");
    }
    public aa(int n)
    {
        super();
        System.out.println("int in a");
    }
}

class bb extends aa
{
    public bb()
    {
        //super(5);// calling the parameterized constructor
        super();
        System.out.println("in b");
    }
    public bb(int n)
    {
        this();
        System.out.println("int in b");
    }
}

class thisAndSuper{
    public static void main(String[]args){
        bb obj = new bb(5);
       // bb obj1 = new bb(10);
    }
}