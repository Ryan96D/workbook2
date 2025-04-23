import java.io.*;
import java.util.Scanner;

public class FileExercises3 {
    static Scanner scanny = new Scanner(System.in);

    public static void main(String[] args) {

        String [] lines = new String[3]; //make array that we will put inputs into later


        System.out.println("Write 3 lines");

        for (int i=0; i <lines.length; i++) { //this is the classic "go through each line" "for" loop
            lines[i] = scanny.nextLine(); //Store each line into a different part of the array
        }

        try {
            FileWriter writerObject = new FileWriter("User input lines.txt");
            writerObject.write(lines[0]+"\n");
            writerObject.write(lines[1]+"\n");
            writerObject.write(lines[2]+"\n");
            writerObject.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            BufferedReader readerObject = new BufferedReader(new FileReader("User input lines.txt"));
            String allLines;
            while ((allLines = readerObject.readLine()) != null){
                System.out.println(allLines);
            }

            readerObject.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }















    }

}

