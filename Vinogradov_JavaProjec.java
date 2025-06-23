Main.java

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание (1, 2 или 3): ");
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


Task1.java

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

Task2.java
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

Task3.java
public class Task3 {
    public static void run() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Чётные числа в массиве:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
