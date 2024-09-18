class ExceptionHandelingTryCatch{
    public static void main(String[]args){

        int i =0; // normal statement
        int j = 0; // ctitical statement

        try
        {
           j = 18/i;
        }
        catch(Exception e)
        {
            System.out.println(" something went wrong");
        }
        System.out.println(j); // code stops aritmetic error

        System.out.println(" bye"); // wont run cause statement stopped above
    }
}