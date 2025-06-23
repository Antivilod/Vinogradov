import java.util.Scanner;

public class Task2 {
    public static void run(Scanner scanner) {
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
