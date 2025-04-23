import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static Scanner scanny = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            int a = 123 / 0;
            System.out.println(a);

        } catch (ArithmeticException e) {
            System.out.println("Invalid");
        }

        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println("Gimme string number :D");
        String input = scanny.nextLine();


        try {
            int num = Integer.parseInt(input);
            System.out.println(num);

        } catch (NumberFormatException e) {
            System.out.println("not a number");
        }


        while (true) {

            System.out.println("How old are you");
            String input2 = scanny.nextLine();

            try {
                int age = Integer.parseInt(input2);
                if (age >= 0) {
                    System.out.println("You are " + age + " years of age");
                    break;
                } else {
                    System.out.println("Age cannot be negative");
                }

            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }

            while (true) {
                System.out.println("Guess a the number (Hint: 1-10)");
                int secretNumber = 7;
                String guess = scanny.nextLine();

                try {
                    int guessNum = Integer.parseInt(guess);

                    if (guessNum == secretNumber) {
                        System.out.println("You guessed correctly!");
                        break;
                    } else {
                        System.out.println("Wrong!!!");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Not a number");
                }

            }

            while (true) {
                System.out.println("Enter Celsius to convert to Fahrenheit");
                String celsius = scanny.nextLine();

                try {
                    double celsiusNum = Double.parseDouble(celsius);
                    System.out.println(celsiusNum + "°C is:");
                    double fahrenheit = celsiusNum * ((double) 9 / 5) + 32;
                    System.out.println(fahrenheit + "°F");
                    break;

                } catch (NumberFormatException e) {
                    System.out.println("Not a number");
                }
            }

            while (true) {
                System.out.println("Enter a number");
                try {
                    int age2 = scanny.nextInt();

                    if (age2 % 2 == 0) {
                        System.out.println("It's an even number");
                        break;
                    } else {
                        System.out.println("It's an odd number");
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Not an integer");
                    scanny.nextLine(); //catching leftover input from nextInt (Otherwise it loops infinitely)
                }
            }


            while (true) {
                System.out.println("Welcome to Calculator!");
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

                        if (loopAnswer.equals("no") || loopAnswer.equals("n") || loopAnswer.equals("exit") || loopAnswer.equals("yes") || loopAnswer.equals("y") || loopAnswer.equals("loop")) {
                            if (loopAnswer.equals("no") || loopAnswer.equals("n") || loopAnswer.equals("exit")) {
                                continueCalc = false; //sets loop value to false
                                break;
                            } else {
                                // loop value stays as true
                                break;
                            }
                        } else {
                            System.out.println("Invalid input. Please input (Y/N)");
                        }
                    }

                    if (!continueCalc) { // stops the Calculator loop if this value is false
                        break;
                    }


                } catch (InputMismatchException e) {
                    System.out.println("Not a number");
                    scanny.nextLine();
                }
            }


            while (true) {
                try {
                    System.out.println();
                    System.out.println("Input 3 numbers to add:");
                    System.out.println("Enter first number");
                    double number1 = scanny.nextDouble();
                    System.out.println("Enter second number");
                    double number2 = scanny.nextDouble();
                    System.out.println("Enter third number");
                    double number3 = scanny.nextDouble();
                    double result2 = number1 + number2 + number3;
                    System.out.println(result2);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Not a number");
                    scanny.nextLine();
                }
            }

                while (true) {
                    System.out.print("Input a Username for CodeWorld online: ");
                    String username = scanny.nextLine();

                    if (username.length() < 4) {
                        System.out.println("Your username is not long enough, Try again");
                    } else {
                        System.out.println("Your username has been set to: " + username);
                        break;
                    }
                }
                scanny.close();




    }
}

