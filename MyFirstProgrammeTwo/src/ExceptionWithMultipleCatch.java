class ExceptionWithMultipleCatch{
    public static void main(String[]args){

        int i =0;
        int j = 0;

        int nums[]= new int[5];
        try
        {
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) // goes insequence
        {
            System.out.println("Number cant be a 0: " + e);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" array index out of bound: " + e);
        }
        catch(Exception e) // handels all the other exception Exception is a parent class
        // make parent always in the bottom
                // adding on top will create an issue
        {
            System.out.println("something went wrong");
        }
        System.out.println(j);

        System.out.println("bye");
    }
}