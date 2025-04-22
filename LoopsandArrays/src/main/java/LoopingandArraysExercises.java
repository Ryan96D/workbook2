public class LoopingandArraysExercises {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};

        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);

        }

        int j = 5;
        while (j > 0) {
            System.out.println(j);
            j--;
        }

        String[] names = {"Alice","Bob","Charlie"};
        for (int k = 0; k < names.length; k++){
            System.out.printf("Hello, \"%s\"!\n",names[k]);
        }



    }


}
