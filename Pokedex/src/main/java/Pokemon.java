public class Pokemon {

    String name; // the "this" in the Constructor refers to this variable
    String type;
    int level;
    int dexNum;
    String formattedDexNum;
    boolean evolutionLine;
    String attack;
    String legendary;
    Boolean effective; //capital B Boolean can be null, lowercase boolean defaults to false




    Pokemon(String name,String type, int dexNum, boolean evolutionLine){
        this.name = name; //"this" refers to the class variable, the "name" on the right side of the "=" is the Constructor variable
        this.type = type;
        this.dexNum = dexNum;
        formattedDexNum = String.format("%04d", dexNum);
        this.evolutionLine = evolutionLine;
    }


    void caught() {
        System.out.println("\u001B[32m෴෴෴\u001B[0m You caught a level "+level+" "+name+" in the grass! \u001B[32m෴෴෴\u001B[0m");
        System.out.println("It has been registered as number "+formattedDexNum+" in the Pokedex");
    }

    void pokedexEntry(){
        System.out.println("You browse the Pokedex for "+name+"...");
        delay(1000);
        System.out.println("Found it! It's under entry number "+formattedDexNum+":");
        delay(2500);
        System.out.println();
        System.out.println("\uD83D\uDFE5▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\uD83D\uDFE5");
        if (evolutionLine){ // by default, executes the if statement if true
            System.out.println(name + " is a " +type+ " type and is part of an evolution line.");
            System.out.println("It knows " + "\"" + attack + "\"");
            System.out.println("\uD83D\uDFE5▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\uD83D\uDFE5");

        }else {
            System.out.println(name+" is a "+legendary+type+" type and is not part of an evolution line.");
            System.out.println("It knows "+"\""+attack+"\"");
            System.out.println("\uD83D\uDFE5▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\uD83D\uDFE5");
        }
    }

     void attacks(){
         System.out.println("You command "+name+" to attack!");
         delay(1000);
         System.out.println("Level "+level+" "+name+" attacks!" );
         System.out.println("\uD83D\uDCA5It uses "+attack+"!\uD83D\uDCA5");
    }

    void effectiveness(){
        if (effective == null) {// need to put null on the first if for no errors

        }else if (effective){
            System.out.println("It's super effective!!!");
        }else if (!effective){ // the "!" in an else if means "NOT" this can also be written else if (effective == false)
            System.out.println("It's not very effective...");
        }
    }
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);  // Adds a delay in milliseconds
        } catch (InterruptedException error) {
            error.printStackTrace();  // Handle the interruption exception
        }
    }


}
