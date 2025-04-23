import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    static Scanner scanny = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("");
            boolean continueCalc = true;

            try {

                System.out.println("Enter first digit");
                double digit = scanny.nextDouble();

                scanny.nextLine(); // eats Enter input from last scanner (number)
                System.out.println("Enter operator (+,-,/,*)");
                String operator = scanny.nextLine(); // saves operator they want

                System.out.println("Enter second digit");
                double digit2 = scanny.nextDouble();
                scanny.nextLine(); // eats Enter input from last scanner (number)

                double result;
                switch (operator) {
                    case "+":
                        result = digit + digit2;
                        System.out.println(result);
                        break;

                    case "-":
                        result = digit - digit2;
                        System.out.println(result);
                        break;
                    case "/":
                        if (digit2 == 0) {
                            System.out.println("Cannot divide by zero");
                        }
                        result = digit / digit2;
                        System.out.println(result);
                        break;
                    case "*":
                        result = digit * digit2;
                        System.out.println(result);
                        break;

                    default:
                        System.out.println("Invalid Operator was entered, try again");
                }
                System.out.println();
                System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println();

                while (true) {
                    System.out.println("Do you want to use Calculator again? (Yes/No)");
                    String loopAnswer = scanny.nextLine().toLowerCase();

                    if (loopAnswer.equals("no")|| loopAnswer.equals("n")|| loopAnswer.equals("exit")||loopAnswer.equals("yes")|| loopAnswer.equals("y")|| loopAnswer.equals("loop")){
                        if (loopAnswer.equals("no")|| loopAnswer.equals("n")|| loopAnswer.equals("exit")){
                            continueCalc = false; //sets loop value to false
                            break;
                        }
                        else {
                            // loop value stays as true
                            break;
                        }
                    }else {
                        System.out.println("Invalid input. Please input (Y/N)");
                    }
                }

                if (!continueCalc){ // stops the Calculator loop if this value is false
                    break;
                }


            } catch (InputMismatchException e) {
                System.out.println("Not a number");
                scanny.nextLine();
            }
        }


    }
}
