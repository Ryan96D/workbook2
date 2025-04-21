public class Book {
    private String title;
    private String color;
    private int pages;
    boolean isFiction;

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

    public void read(){
        System.out.println("The book contains "+pages+" pages inside it...");
    }
}
