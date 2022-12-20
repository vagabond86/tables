import java.util.Scanner;

public class ArrayOfNumbers {
    private int[] numbers;

    public ArrayOfNumbers(int size) {
        numbers = new int[size];
    }

    public void fill(Scanner scanner) {
        System.out.println("Wprowadź " + numbers.length + " liczb:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public void printInOrder() {
        System.out.println("Liczby w takiej kolejności, w jakiej zostały podane:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void printInReverse() {
        System.out.println("Liczby w odwrotnej kolejności:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public void checkNumber(Scanner scanner) {
        System.out.println("Podaj numer komórki:");
        int index = scanner.nextInt();
        if (index < 0 || index >= numbers.length) {
            System.out.println("Nieprawidłowy numer komórki.");
            return;
        }
        System.out.println("Liczba zapisana pod numerem " + index + ": " + numbers[index]);
    }

    public void updateNumber(Scanner scanner) {
        System.out.println("Podaj numer komórki:");
        int index = scanner.nextInt();

        if (index < 0 || index >= numbers.length) {
            System.out.println("Nieprawidłowy numer komórki.");
            return;
        }

        System.out.println("Podaj nową wartość liczby:");
        int number = scanner.nextInt();

        numbers[index] = number;
        System.out.println("Liczba zapisana pod numerem " + index + " została nadpisana nową wartością " + number + ".");
    }
}

