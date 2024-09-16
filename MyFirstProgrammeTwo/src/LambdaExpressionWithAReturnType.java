@FunctionalInterface
interface b{
    int add(int i, int j);
}

class LambdaExpressionWithAReturnType{
    public static void main(String[]args){

        b obj = (int i, int j) -> i+j; // this automatically becomes a return type

        int result = obj.add(5,9);
        System.out.println(result);
    }
}