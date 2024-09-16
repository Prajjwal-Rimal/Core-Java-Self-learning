@FunctionalInterface
interface a{
    void show(int i, int j);
}

class LambdaExpression{
    public static void main(String[]args){

        a obj1 = (i,j)-> System.out.println("in inner class show");
        obj1.show(5,90);

    }
}