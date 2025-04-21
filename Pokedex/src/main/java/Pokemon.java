public class Pokemon {

    private String name; // the "this" in the Constructor refers to this variable
    private String type;
    private int getLevel;
    private int dexNum;
    private String formattedDexNum;
    private boolean evolutionLine;
    private String setAttack;
    private String legendary;
    private Boolean effective; //capital B Boolean can be null, lowercase boolean defaults to false


    public int getLevel() {
        return getLevel;
    }

    public void setLevel(int level) {
        this.getLevel = level;
    }

    public String getAttack() {
        return setAttack;
    }


    public void setAttack(String attack) {
        this.setAttack = attack;
    }

    public Boolean getEffective() {
        return effective;
    }

    public void setEffective(Boolean effective) {
        this.effective = effective;
    }

    public String getLegendary() {
        return legendary;
    }

    public void setLegendary(String legendary) {
        this.legendary = legendary;
    }

    Pokemon(String name, String type, int dexNum, boolean evolutionLine){
        this.name = name; //"this" refers to the class variable, the "name" on the right side of the "=" is the Constructor variable
        this.type = type;
        this.dexNum = dexNum;
        formattedDexNum = String.format("%04d", dexNum);
        this.evolutionLine = evolutionLine;
    }


    void caught() {
        System.out.println("\u001B[32m෴෴෴\u001B[0m You caught a level "+ getLevel +" "+name+" in the grass! \u001B[32m෴෴෴\u001B[0m");
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
            System.out.println("It knows " + "\"" + setAttack + "\"");
            System.out.println("\uD83D\uDFE5▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\uD83D\uDFE5");

        }else {
            System.out.println(name+" is a "+legendary+type+" type and is not part of an evolution line.");
            System.out.println("It knows "+"\""+ setAttack +"\"");
            System.out.println("\uD83D\uDFE5▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\uD83D\uDFE5");
        }
    }

     void attacks(){
         System.out.println("You command "+name+" to attack!");
         delay(1000);
         System.out.println("Level "+ getLevel +" "+name+" attacks!" );
         System.out.println("\uD83D\uDCA5It uses "+ setAttack +"!\uD83D\uDCA5");
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
