class calculator{

    int a;// class variable

    public int add(int n1, int n2){ // access modifier and int is the return tyr with add being mthod name
        int r = n1+n2;
        return r;
    }
}

class classesAndObject{
    public static void main(String[]args){
        int num1 =5;
        int num2= 4;

        calculator calc = new calculator();
        // calculator class name, calc referance name, new calculator() defines the rest.
        int result= calc.add(num1, num2); //calling the add method

        System.out.println(result);
    }
}