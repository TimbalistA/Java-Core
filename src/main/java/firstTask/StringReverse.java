package firstTask;

import java.util.Scanner;

import static java.lang.String.format;

public class StringReverse {

    public static StringBuilder reverseString(String string) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverseString.append(string.charAt(i));
        }
        return reverseString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String string = scanner.nextLine();

        System.out.println(format("The reverse string: %s", reverseString(string)));
    }

}
