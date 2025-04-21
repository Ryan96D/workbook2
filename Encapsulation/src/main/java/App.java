public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alex";
        p.age = 99; // uh-oh!
        p.favoriteColor = "blue";

        System.out.println(p.name + " is " + p.age + " years old and loves " + p.favoriteColor);
        System.out.println();
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        Book bestBook = new Book();
        bestBook.setTitle("This Is The Only Book You Will Ever Need");
        bestBook.setColor("red");
        bestBook.setPages(201);
        bestBook.setFiction(true);

        System.out.println("While browsing the library's shelves, a particular "+bestBook.getColor()+
                "book catches your eye. \nThe title reads: \""+ bestBook.getTitle() + "\". \n" +
                "You open the book, and scroll through it's contents... ");
        bestBook.read();
        bestBook.ifFiction();



    }

}
