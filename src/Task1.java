import java.util.Scanner;

public class Task1 {
    public static void run(Scanner scanner) {
        int a = readInt(scanner, "Введите первое целое число (a): ");
        int b = readInt(scanner, "Введите второе целое число (b): ");

        // Сравнение
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Пожалуйста, введите целое число.");
            scanner.next(); // очистить неправильный ввод
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}
