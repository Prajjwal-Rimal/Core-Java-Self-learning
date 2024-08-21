class typeConversionAndCasting{
    public static void main(String args[]) {
        // type coversion and cassting
        //////////////////////////////
        byte b =127;
        int a= b;// assigning byte to integer.
        System.out.println(a);
        System.out.println();

        int c=257;// divide by byte range and return the remainder 1 (modulous operator)
        byte k= (byte)c;
        System.out.println(k);
        System.out.println();

        float f =5.6f;
        int t=(int)f;
        System.out.println(t);
        System.out.println();

        byte r=10;
        byte n=30;
        int result=r*n;
        System.out.println(result); // type promotion

    }
}
