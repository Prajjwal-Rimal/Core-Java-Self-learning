class ExceptionThrow{
    public static void main (String[]args){
        int i =0;
        int j = 0;

        try {
            j = 18/i;
            if(i==0){
                throw new ArithmeticException();

            }
        }
        catch(ArithmeticException e){
                j=18/1; // not showiing error handeling it
                System.out.println("this is the default output" + e);
        }

        catch(Exception e) {
            System.out.println("something went wrong");
        }

        System.out.println(j);
        System.out.println("bye");
    }
}