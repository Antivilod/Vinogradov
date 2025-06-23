import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание (1, 2 или 3): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Пожалуйста, введите число (1, 2 или 3): ");
            scanner.next(); // очистить неправильный ввод
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                Task1.run(scanner);
                break;
            case 2:
                Task2.run(scanner);
                break;
            case 3:
                Task3.run();
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
}
