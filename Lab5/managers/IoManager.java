package managers;

import java.util.Scanner;

public class IoManager {
    public static int inputInt(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. " + message + " ");
                scanner.next();
            }
            return scanner.nextInt();
        }
    }

    public static String inputString(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            return scanner.nextLine();
        }
    }

    public static boolean inputBoolean(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            while (!scanner.hasNextBoolean()) {
                System.out.print("Некорректный ввод. " + message + " ");
                scanner.next();
            }
            return scanner.nextBoolean();
        }
    }
}

