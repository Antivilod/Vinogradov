public class Task1 {
    public static void run(Scanner scanner) {
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

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
}
