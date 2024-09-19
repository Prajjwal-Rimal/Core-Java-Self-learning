import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileHandelingInput{
    public static void main(String[]args){

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
    }
}