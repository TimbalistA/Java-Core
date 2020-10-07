package firstTask;

import java.util.Scanner;

public class CharactersCounting {

    public static boolean isLetter(char character) {
        return (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z');
    }

    public static boolean isNumber(char character) {
        return (character >= '0' && character <= '9');
    }

    public static boolean isSpace(char character) {
        return (character == ' ');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLetters = 0;
        int countSpaces = 0;
        int countNumbers = 0;
        int countOthers = 0;

        System.out.print("Input a string: ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (isLetter(string.charAt(i))) {
                countLetters++;
            } else if (isNumber(string.charAt(i))) {
                countNumbers++;
            } else if (isSpace(string.charAt(i))) {
                countSpaces++;
            } else {
                countOthers++;
            }
        }
        System.out.println("Letters - " + countLetters);
        System.out.println("Numbers - " + countNumbers);
        System.out.println("Spaces - " + countSpaces);
        System.out.println("Others - " + countOthers);
    }

}
