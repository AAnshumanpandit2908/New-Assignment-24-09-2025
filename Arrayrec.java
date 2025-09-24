package Class;

public class Arrayrec {
        static int findMax(int arr[], int n) {
            if (n == 1) return arr[0];
            return Math.max(arr[n - 1], findMax(arr, n - 1));
        }

        static int findMin(int arr[], int n) {
            if (n == 1) return arr[0];
            return Math.min(arr[n - 1], findMin(arr, n - 1));
        }

        public static void main(String[] args) {
            int arr[] = {10, 25, 5, 78, 3, 42};

            int max = findMax(arr, arr.length);
            int min = findMin(arr, arr.length);

            System.out.println("Maximum element = " + max);
            System.out.println("Minimum element = " + min);
        }
    }
