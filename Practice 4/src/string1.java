//Implement a program that counts the frequency of each character in a string.


class string1{
    public static void main(String[] args) {
        String input = "hello world i am prajjwal rimal";

        // Create an array to store frequency of each character
        int[] frequency = new int[256]; // since ASCII has 0-255 characters we set the length of array as 256, so a
        // will be assigned to the value 97

        // Calculate frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);// add the character in the i index to the array
            frequency[ch]++;//for eaach mathing value increment it by one
            // iif a is to be added than charat will convert it to 97 then that 97 will be appended to the array and
            // for evey a it encounters after that its valur is increased by one so forst a will set the array valure
            // to 1 , the second to 2 and so on
        }


        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {// checks if i is greater than 0, basically to see if the char is empty or it has
                // any values in it
                System.out.println((char) i + ": " + frequency[i]);// type conversion of i into its ascii character
                // and then concatenate it with the given frequncy and display it
            }
        }
    }
}