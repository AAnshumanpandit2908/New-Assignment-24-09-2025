package Class;

import java.util.Scanner;

public class fact {
    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long result = calculateFactorial(n);

        System.out.println(result);

        scanner.close();
    }
}