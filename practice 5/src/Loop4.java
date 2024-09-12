class Loop4 {
    public static void main(String[] args) {
        String toCount = " hi my name is mr world wide akak pitbull";
        int[] array = new int[256]; // Array to store the number of each character is repeated, stores in ascii values

        // Count the number of times each character appears in the string
        for (int i = 0; i < toCount.length(); i++) {
            char ch = toCount.charAt(i); // Get each character, as ascii value 
            array[ch]++; // Increment the array of the character
        }

        // Display the array of characters
        System.out.println("Character frequencies:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) { // Only print characters that are present in the string
                System.out.println((char) i + ": " + array[i]);// since the characters are saved as ascii values
                // we =need to type cast them to char before printing them
            }
        }
    }
}
