import java.util.*;

public class Main {

    static long calculateValue(int[] a) {
        long max = a[0];
        long sum = max;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            sum += max;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long ans = calculateValue(arr);

            for (int i = 1; i < n; i++) {
                swap(arr, 0, i);
                ans = Math.max(ans, calculateValue(arr));
                swap(arr, 0, i); 
            }

            System.out.println(ans);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}