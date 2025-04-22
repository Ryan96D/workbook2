public class Main {
    public static void main(String[] args) {
        Room kitchen = new Room("Kitchen"); /*one kitchen is a variable name, the other is
        just a string assigned to it because kitchen is a variable named "Room" and "Room is a string */
        House house = new House(kitchen); //make class: "house" and assigning variable "Room" into

        System.out.println("This House has a room called: "+house.kitchen.name);/*accesses "house object"
        and a field (2 total) from both classes*/

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        Rectangle r1 = new Rectangle(23,75);
        System.out.println();
        Rectangle r2 = new Rectangle(457,124);

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        Book bestBook1 = new Book("This Is The Only Book You Will Ever Need",
                "red",201,"RydaGoat",true);
        bestBook1.describe();

        bestBook1.describe("It is also cursed!!! You get hit with a hex!");

        bestBook1.describe(159,"the corner of the dusty old library");

        bestBook1.describe(56); //void method

        System.out.println(bestBook1.describe1(49)); //return method (renamed to describe1 to run




    }
}
