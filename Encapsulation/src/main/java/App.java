public class App {
    public static void main(String[] args) {
        Person p = new Person("Alex",-1);
        p.favoriteColor = "blue";

        System.out.println(p.name + " is " + p.age + " years old and loves " + p.favoriteColor);
        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        Book bestBook = new Book("This Is The Only Book You Will Ever Need",
                "red",201,"RydaGoat",true);

        bestBook.describe();
        bestBook.read();
        bestBook.ifFiction();

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        Book worstBook = new Book("Never Read This Book",
                "brown",2,"RydaSheep",false);

        worstBook.describe();
        worstBook.read();
        worstBook.ifFiction();

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        Book mediocreBook = new Book("This Book is Basic and Uneventful",
                "blue",150,"RydaDog",false);

        mediocreBook.describe();
        mediocreBook.read();
        mediocreBook.ifFiction();


        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        Book lostBook = new Book();

        lostBook.describe();
        lostBook.read();
        lostBook.ifFiction();

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        Cupcake darkChocolate = new Cupcake("Dark Chocolate",199);
        darkChocolate.isHealthy();

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        Car tesla = new Car("Tesla",2018,true);
        tesla.startEngine();

        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        Car lambo = new Car("Lamborghini",2024,false);
        lambo.startEngine();




    }

}
