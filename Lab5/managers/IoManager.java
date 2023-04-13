package managers;

import java.util.Scanner;

public class IoManager {
    public int inputInt(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. " + message + " ");
                scanner.next();
            }
            return scanner.nextInt();
        }
    }

    public String inputString(String message) {
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

    public long inputLong(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            while (!scanner.hasNextLong()) {
                System.out.print("Некорректный ввод. " + message + " ");
                scanner.next();
            }
            return scanner.nextLong();
        }
    }

    public float inputFloat(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            while (!scanner.hasNextFloat()) {
                System.out.print("Некорректный ввод. " + message + " ");
                scanner.next();
            }
            return scanner.nextFloat();
        }
    }


    public double inputDouble(String message) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(message + " ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Некорректный ввод. " + message + " ");
                scanner.next();
            }
            return scanner.nextDouble();
        }
    }

}

