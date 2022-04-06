import java.util.Scanner;

public class Java {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        println("Введите n");
        int n = input.nextInt();
        int [] array = new int[n];

        println("Выполняется...");
        for (int i = 0; i < array.length; i++)
            array[i] = f(i);

        println(array[n - 1]);
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
