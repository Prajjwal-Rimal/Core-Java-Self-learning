class calculatorrr{

    int a;// class variable

    public int add(int n1, int n2, int n3){ // access modifier and int is the return tyr with add being mthod name
        return n1+n2+n3;
    }
    public int add(int n1, int n2){ // access modifier and int is the return tyr with add being mthod name
        return n1+n2;
    }
    public double add(double n1, int n2){ // access modifier and int is the return tyr with add being mthod name
        return n1+n2;
    }

}

class methodoverloading{
    public static void main(String[]args){

        calculatorrr obj= new calculatorrr();
        int r1= obj.add(3, 4, 4); //calling the add method

        System.out.println(r1);
    }
}