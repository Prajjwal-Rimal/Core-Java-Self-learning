//- Write a program to check if a given string is a palindrome.-- simply reverse a string

class string0{
    public static void main(String[]args){
        String a = "mom";
        String reverse = "";

        for (int i=a.length()-1; i>=0;i--){ // loop is to be run for the whole length of i and since it starts from 0
            // we use -1 to make sure computer doesn't exceed or throw error for limit of i, then we check if i is
            // greater than or equal to 0, after every successful iteration we decrease the value of i by 1

            reverse = reverse+a.charAt(i); // adding i will add the memory address of each of the character so to
            // pull and add every individual characters we will needs to use a inbuilt method known as charAt() this
            // returns the character present at each index value
        }
        System.out.println(reverse);

        if (a.equals(reverse)){ // == compares memory address not the characters so we use .equals() method
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}