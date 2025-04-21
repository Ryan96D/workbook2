import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        System.out.println("What is your phone's serial number?");
        myPhone.setSerial(scanny.nextInt());
        scanny.nextLine(); // eats leftover Enter from nextInt

        System.out.println("What is your phone model?");
        myPhone.setModel(scanny.nextLine());

        System.out.println("What is your phone carrier?");
        myPhone.setCarrier(scanny.nextLine());

        System.out.println("What is your phone number?");
        myPhone.setPhoneNumber(scanny.nextLine());

        System.out.println("Who is the phone owner's name?");
        myPhone.setOwnerName(scanny.nextLine());

        System.out.println("Serial number: "+myPhone.getSerial());
        System.out.println("Phone model: "+myPhone.getModel());
        System.out.println("Phone carrier: "+myPhone.getCarrier());
        System.out.println("Phone number: "+myPhone.getPhoneNumber());
        System.out.println("Phone owner: "+myPhone.getOwnerName());





    }
}
