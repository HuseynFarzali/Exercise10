package Exercise10.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int upperBound = 60;
        int lowerBound = -25;
        boolean SHOW_STACK_TRACE = true;

        System.out.printf("Enter the temperature of the weather: ");
        String tempInput = new Scanner(System.in).nextLine();
        int temperature = Integer.parseInt(tempInput);

        try {
            if (temperature < lowerBound || temperature > upperBound) {
                throw new InvalidInputException(
                        "Inputted data:[" + temperature + "]" + " is not in range " + lowerBound + " — " + upperBound + ".");
            }
        }
        catch (InvalidInputException ex) {
            System.out.println("Problem occured --> " + ex.getFullMessage(SHOW_STACK_TRACE));
        }
    }
}

