package firstTask;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.*;

public class DigitsSum {
    public static int sumOfDigits(int integer) {
        int sum = 0;
        while (integer != 0) {
            sum += integer % 10;
            integer /= 10;
        }
        return sum;
    }

    public static boolean validInput(int integer) {
        return integer >= 0 && integer <= 1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.print("Input an integer between 0 and 1000: ");
        int integer = scanner.nextInt();

        while (!validInput(integer)) {
            out.print("Invalid input. Input an integer between 0 and 1000: ");
            integer = scanner.nextInt();
        }

        out.println(format("The sum of all digits in '%d' is '%d'.", integer, sumOfDigits(integer)));
    }

}
