class assignmentAndArithmeticOperator{
    public static void main(String args[])
    {
        int num1 = 7;
        int num2 = 5;
        int result = num1+num2;
        System.out.println(result);

        int num=15;
        int result1 = ++num;// pre increment
        System.out.println(result1);// first increase then fetch the value

        int num3=15;
        int result2 = num3++; // post increment
        System.out.println(result2);// first fetch the value and increase
    }
}