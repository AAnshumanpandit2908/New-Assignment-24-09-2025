package Class;
import java.util.Scanner;

public class SumofPowerRec {
        static int sumOfPowers(int n) {
            if (n == 0) return 1;
            return (int)Math.pow(2, n) + sumOfPowers(n-1 );
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();

            System.out.println("Sum of powers of 2 up to " + n + " = " + sumOfPowers(n));

            sc.close();
        }
    }


