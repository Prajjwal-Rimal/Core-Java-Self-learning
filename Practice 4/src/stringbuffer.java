//- Write a program that uses `StringBuffer` to reverse a string. -- inbuilt methodd is present


class stringbuffer{
    public static void main(String[]args){

        StringBuilder sb = new StringBuilder("this is so much easier than to use charAt(i)");

        sb.reverse();
        System.out.println(sb);
    }
}