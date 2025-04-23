import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExercises4 {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);

        System.out.println("Pick a word");
        String word = scanny.nextLine().toLowerCase();
        int totalCount = 0;

        try {
            BufferedReader readerObject = new BufferedReader(new FileReader("Second Text.txt"));
            String poem;
            while ((poem = readerObject.readLine()) != null){

                System.out.println(poem);
                System.out.print("|Line has word: ");
                System.out.println(poem.contains(word)+"|");
                System.out.println();
                int countForLine = countOccurences(poem,word);
                totalCount += countForLine;


            }
            readerObject.close();
            System.out.println("This String has "+totalCount+" occurrences of \""+word+"\"");



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }

    public static int countOccurences(String string,String word){
        String lowerCasedString = string.toLowerCase();
        int count = 0;
        int index = 0;
        while ((index = lowerCasedString.indexOf(word, index)) != -1) {

            count++;
            index += word.length();
        }
        return count;
    }
}

