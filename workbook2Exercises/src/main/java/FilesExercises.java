import java.io.*;
import java.util.Scanner;

public class FilesExercises {
    public static void main(String[] args) {

        try {
            FileWriter writerObject = new FileWriter("output.txt");
            writerObject.write("Hello, file world!");
            writerObject.write("\nhahahahahahhahahahahahaha");
            writerObject.write("\n\nMuahahahaha   (Villain monologue + laugh)");
            writerObject.close();
            System.out.println("Written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println("error:"+ e.getMessage());
            e.printStackTrace();
        }

        try {
            BufferedReader readerObject = new BufferedReader(new FileReader("output.txt"));
            String allLines;
            while ((allLines = readerObject.readLine()) != null) {

                System.out.println(allLines);
            }
            readerObject.close();

        } catch (IOException e) {
            System.out.println("error:"+ e.getMessage());
            e.printStackTrace();
        }


    }
}
