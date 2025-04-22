public class Rectangle {
    private int length;
    private int width;
    private int area;

    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        this.area = length * width;

        System.out.println("A rectangle with a length of: "+length+", and " +
                "a width of: "+width+ ", has an area of: " + area);
    }



}
