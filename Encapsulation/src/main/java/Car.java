public class Car {

    String brand;
    int year;
    boolean isElectric;

    public Car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
        System.out.println("Car brand: "+brand);
        System.out.println("Model year: "+year);
        if (isElectric){
            System.out.println("Type of car: Electric");
        }else {
            System.out.println("Type of car: Gas");
        }
    }

    public void startEngine(){
        if (isElectric){
            System.out.println("You start the car, it boots up immediately. " +
                    "It displays 95% charge and is ready to go!");
        }else {
            System.out.println("You rev the engine. It roars with vigor!");
        }
    }
}
