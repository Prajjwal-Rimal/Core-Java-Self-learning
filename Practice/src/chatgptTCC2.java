//- **Q6:** Write a Java program to explicitly cast a double to an integer and observe the result.

class chatgptTCC2{
    public static void main(String[]args){
        double f= 10.012345;
        int x = (int)f;// the f will loose its value after .
        System.out.println(x);
    }
}