package Models;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstExampleModel {


    private boolean contiuneLoop = true;


    public FirstExampleModel() {
    }

    private int executeQuatient(int numberOne, int numberTwo) throws ArithmeticException {

        return numberOne / numberTwo;

    }

    public void quotient() {

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Plase enter the first Number");
                int numberOne = scanner.nextInt();
                System.out.println("Plase enter the Second Number");
                int numberTwo = scanner.nextInt();
                int result = executeQuatient(numberOne, numberTwo);
                System.out.println("Result: " + result);
                contiuneLoop = false;

            } catch (InputMismatchException e) {

                System.err.printf("Error: %s\n", e);
                System.out.println("Please enter integer number");

            } catch (ArithmeticException e) {

                System.err.printf("Error: %s\n", e);
                System.out.println("Please dont enter the 0");


            }finally {
                System.out.println("Finally is executed always");
            }

        } while (contiuneLoop);


    }


}
