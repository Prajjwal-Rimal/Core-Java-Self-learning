class stringBufferBuilder{
    public static void main(String[]args){
        StringBuffer sb =new StringBuffer("navin");
        sb.append(" reddy");
        sb.deleteCharAt(2);
        sb.insert(0,"JAVA ");


        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        String str = sb.toString();
        System.out.println(str);
    }
}