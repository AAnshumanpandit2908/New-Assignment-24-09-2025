package Class;

import java.util.Scanner;

public class fibo {

    public static int findFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = findFibonacci(n);

        System.out.println(result);

        scanner.close();
    }
}