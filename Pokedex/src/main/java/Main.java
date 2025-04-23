public class Main {
    public static void main(String[] args) {
        System.out.println(); // skip line;

        Pokemon p1 = new Pokemon("Bulbasaur","Grass",1,true);
        p1.setLevel(12);
        p1.setAttack("Vine Whip");
        p1.setEffective(true);



        p1.caught();
        delay(3000);
        System.out.println();
        p1.pokedexEntry();
        delay(7500);
        System.out.println();
        p1.attacks();
        delay(3000);
        System.out.println();
        p1.effectiveness();
        delay(3000);
        System.out.println();


        Pokemon p2 = new Pokemon("Eevee","Normal",133,true);
        p2.setLevel(15);
        p2.setAttack("Tackle");


        p2.caught();
        delay(3000);
        System.out.println();
        p2.pokedexEntry();
        delay(7500);
        System.out.println();
        p2.attacks();
        delay(3000);
        System.out.println();
        p2.effectiveness();
        delay(3000);
        System.out.println();


        Pokemon p3 = new Pokemon("Pikachu","Electric",25,true);
        p3.setLevel(24);
        p3.setAttack("Thunderbolt");
        p3.setEffective(true);


        p3.caught();
        delay(3000);
        System.out.println();
        p3.pokedexEntry();
        delay(7500);
        System.out.println();
        p3.attacks();
        delay(3000);
        System.out.println();
        p3.effectiveness();
        delay(3000);
        System.out.println();


        Pokemon p4 = new Pokemon("Mewtwo","Psychic",150,false);
        p4.setLevel(100);
        p4.setAttack("Shadow Ball");
        p4.setLegendary("Legendary ");
        p4.setEffective(true);


        p4.caught();
        delay(3000);
        System.out.println();
        p4.pokedexEntry();
        delay(7500);
        System.out.println();
        p4.attacks();
        delay(1500);
        System.out.println();
        p4.effectiveness();
        delay(3000);


        Pokemon p5 = new Pokemon("Charizard","Fire and Flying",6,true);
        p5.setLevel(50);
        p5.setAttack("Flamethrower");
        p5.setEffective(true);

        p5.caught();
        delay(3000);
        System.out.println();
        p5.pokedexEntry();
        delay(7500);
        System.out.println();
        p5.attacks();
        delay(3000);
        System.out.println();
        p5.effectiveness();
        delay(3000);
        System.out.println();


        Pokemon p6 = new Pokemon("Magikarp","Water",129,true);
        p6.setLevel(5);
        p6.setAttack("Splash");
        p6.setEffective(false);
        p6.caught();
        delay(3000);
        System.out.println();
        p6.pokedexEntry();
        delay(7500);
        System.out.println();
        p6.attacks();
        delay(3000);
        System.out.println();
        p6.effectiveness();
        delay(3000);
        System.out.println("It does nothing...");





    }
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);  // Adds a delay in milliseconds
        } catch (InterruptedException error) {
            error.printStackTrace();  // Handle the interruption exception
        }
    }
}
