package Exercise10.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tryPrintWhenExpRepeat(true);
    }

    public static void tryPrintWhenExpRepeat(boolean firstTry) {
        if (firstTry) {
            System.out.printf("Print an integer: ");
        }
        else {
            System.out.printf("Print a valid integer pls: ");
        }

        String numberInput = (new Scanner(System.in)).nextLine();

        try {
            int number = Integer.parseInt(numberInput);
            System.out.println("Square of the input: " + Math.pow(number, 2));
        }
        catch (NumberFormatException ex) {
            tryPrintWhenExpRepeat(false);
        }
    }
}