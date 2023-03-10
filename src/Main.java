import java.util.Scanner;
// cz.1
// Napisz program, który pobiera od użytkownika 10 liczb. Następnie wypisuje je w odwrotnej kolejności.
// cz.2
// Po podaniu 10 licz i wypisaniu ich w odwrotnej kolejności program będzie sprawdzał czy kolejna liczba podana przez użytkownika należy do wcześniej podanej listy.
// Czyli użytkownik pisze "5" a program pisze czy liczba jest zapisana w tablicy czy nie, tak długo aż użytkownik wpisze "granatnik".
// Użycie hasła "granatnik" kończy działania programu. Użycie innego hasła powinno wypisać informacje, że oczekujemy podania liczby do sprawdzenia a nie pisania jakiś głupot.
// cz.2
// użytkownik po podaniu 10 liczb ma mieć następujące opcje:
// sprawdzenie liczby zapisanej pod konkretnym numerem komórki
// nadpisanie liczby zapisanej pod konkretnym numerem komórki nową wartością
// wypisanie liczb w takiej kolejności w jakiej zostały podane
// wypisanie liczb w odwrotnej kolejności
// wyjście z programu
// uwaga: zamiast przechowywać wszystko w Main utwórz nową klasę - ArrayOfNumbers

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayOfNumbers array = new ArrayOfNumbers(5);
        array.fill(scanner);

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Sprawdź liczbę zapisaną pod konkretnym numerem komórki");
            System.out.println("2. Nadpisz liczbę zapisaną pod konkretnym numerem komórki nową wartością");
            System.out.println("3. Wypisz liczby w takiej kolejności, w jakiej zostały podane");
            System.out.println("4. Wypisz liczby w odwrotnej kolejności");
            System.out.println("5. Sprawdź czy podana liczba znajduje się w tablicy");
            System.out.println("6. Wyjdź z programu");

            int option = scanner.nextInt();

            if (option == 1) {
                array.checkNumber(scanner);
            } else if (option == 2) {
                array.updateNumber(scanner);
            } else if (option == 3) {
                array.printInOrder();
            } else if (option == 4) {
                array.printInReverse();
            } else if (option == 5) {
                System.out.println("Podaj liczbę do sprawdzenia:");
                int number = scanner.nextInt();
                if (array.contains(number)) {
                    System.out.println("Liczba znajduje się w tablicy.");
                } else {
                    System.out.println("Liczba nie znajduje się w tablicy.");
                }
            } else if (option == 6) {
                return;
            } else {
                System.out.println("Nieprawidłowa opcja.");
            }
        }
    }
}
