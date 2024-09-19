import java.io.*;

class FileHandelingOutput{
    public static void main (   String[]args){

        String names[] ={"able","bable","cable"};

        try{
            BufferedWriter fileIO = new BufferedWriter(new FileWriter("output.txt"));
            fileIO.write("writing to a file");
            fileIO.write("\nhere is the second file");

            for (int i =0; i< names.length;i++){
                fileIO.write("\n"+ names[i]);
            }

            fileIO.close();

        } catch (IOException e){
            System.out.println(e);
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line; // to store every line read

            while((line=reader.readLine())!= null){ // every line read is store d in line, reads till the end of the
                // file and when the file is null the while loop is exited
                System.out.println(line);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}