import java.io.*;
import java.util.Arrays;

public class FileExercise2 {

    public static void main(String[] args) {

        String [] veryBadPoem = {
                "My toaster's a liar, it burns all my bread,\n",
                "The fridge hums a tune that lives in my head.\n",
                "I asked my goldfish for life advice,\n",
                "It blinked at me once, then blinked twice.\n",

                "The carpet's a sea, my socks are two boats,\n",
                "My lamp whispers secrets in flickering notes.\n",
                "I wrote this poem to confuse and dismay,\n",
                "Because nonsense is fun, come what may!\n"};

        try {
            FileWriter fileWriterObject = new FileWriter("Second Text.txt");
            for (int i = 0; i < veryBadPoem.length; i ++) {
                fileWriterObject.write(veryBadPoem[i]);
            }
            fileWriterObject.close();
            System.out.println("Written to Second Text.txt successfully");
            System.out.println();

        } catch (IOException e) {
            System.out.println("error: "+e.getMessage());
            e.printStackTrace();
        }


            try {
                BufferedReader readerObject = new BufferedReader(new FileReader("Second Text.txt"));
                String wholePoem;
                while ((wholePoem = readerObject.readLine()) != null){

                    System.out.println(wholePoem);
                }

                readerObject.close();

            } catch (IOException e) {
                System.out.println("error: "+e.getMessage());
                e.printStackTrace();
            }




    }
}
