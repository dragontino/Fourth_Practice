import java.util.Scanner;

public class Java {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        println("Введите n");
        int n = input.nextInt();
        long startTime = System.currentTimeMillis();
        long result = 0;

        println("Выполняется...");
        for (int i = 0; i < n; i++)
            result = f(i);

        println("Последний элемент = " + result);
        long endTime = System.currentTimeMillis();
        print("Время = " + (endTime - startTime) / 1000 + " секунд");
    }

    private static int f(int i) {
        if (i <= 0) return 0;

        int b = 3, c = 3;
        int sum = 0;
        for (int n = 1; n <= Math.pow(10, 8); n++) {
            sum += b * 2 + c - i;
        }

        return f(i - 1) + sum;
    }

    public static void print(Object... args) {
        for (Object o: args) {
            System.out.print(o + " ");
        }
    }

    public static void println(Object... args) {
        for (Object o: args) {
            System.out.println(o);
        }
    }
}
