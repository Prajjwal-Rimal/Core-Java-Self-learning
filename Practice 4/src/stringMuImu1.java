//- Write a program to demonstrate the mutability of `StringBuffer` by appending and modifying strings.

class stringMuImu1{
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer("prajjwal");
        sb.append("rimal");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.deleteCharAt(5);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        sb.insert(10," rimal prajjwal ");
        System.out.println(sb);
    }
}