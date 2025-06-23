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
