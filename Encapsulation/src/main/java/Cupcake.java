public class Cupcake {

    String flavor;
    int calories;

    Cupcake (String flavor, int calories){
        this.flavor = flavor;
        this.calories = calories;
        System.out.println("Created Cupcake: "+flavor+", "+calories+" kcal");
    }

    public void isHealthy(){
        if (calories < 200){
            System.out.println("This is a healthy cupcake");
        }else {
            System.out.println("This is not a healthy cupcake");
        }
    }
}
