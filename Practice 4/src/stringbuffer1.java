//- Implement a program that uses `StringBuilder` to replace a substring within a string.

class stringbuffer1{
    public static void main(String[]args){

        StringBuilder sb = new StringBuilder("prajjwal rimal");
        sb.replace(9,14, "welcome");
        System.out.println(sb);

    }
}