public class Book {
    private String title;
    private String color;
    private int pages;
    boolean isFiction;
    String author;

    Book (String title,String color, int pages, String author, boolean isFiction){
        this.title = title;
        this.color = color;
        this.pages = pages;
        this.author = author;
        this.isFiction = isFiction;
    }

    Book (){
        this.title = "Untitled";
        this.color = "uncolored";
        this.pages = 0;
        this.author = "Unknown";
        this.isFiction = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPages() {
        return pages;
    }


    public void setPages(int pages) { //validation for the pages to be at least 1
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("Error: Number of pages must be greater than zero.");
            this.pages = 1;  // Default to 1 if invalid
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setFiction(boolean fiction) {
        isFiction = fiction;
    }

    public void ifFiction(){
        if (isFiction){
            System.out.println("The book seems to be fictional...");
        }else {
            System.out.println("The book is non-fictional...");
        }
    }

    public void describe() {
        System.out.println("While browsing the library's shelves, a particular "+color+
                "book catches your eye. \nThe title reads: \""+title + "\". \n" +
                "You open the book, and scroll through it's contents... ");

    }

    public void read(){
        System.out.println("The book contains "+pages+" pages inside it...");
        System.out.println("The book was written by "+author);

    }


    public void describe(String extrainfo) {
        System.out.println(extrainfo);

    }
    public void describe(int currentPage){
        System.out.println("You open the book to page "+currentPage);
    }

    public void describe(int currentPage, String location){
        System.out.println("You open the book to page "+currentPage+" and start reading it " +
                "at "+location);
    }
    public int describe1(int pages){ //return int instead of void method
        this.pages = pages;
        return pages*2;

    }
}
