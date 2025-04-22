import javax.xml.namespace.QName;

public class Person {
    public String name;
    public int age;
    public String favoriteColor;

    Person(String name,int age){
        this.name= name;
        this.age= age;
        if (this.age < 0){
            System.out.println("\uD83D\uDD34Age cannot be under 0\uD83D\uDD34");
            this.age = 0;
        }
    }
}
