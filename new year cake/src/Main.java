import java.util.*;

public class Main {

    static int tabe(int a, int b){ 
        
        int count = 0;
        int size = 1;
        boolean white = true;

        while (true) {

            if (white) {
                if (a < size) break;
                a -= size;
            } else {
                if (b < size) break;
                b -= size;
            }

            count++;
            size *= 2;
            white = !white;
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] results = new int[t];

        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            results[i] = Math.max(tabe(a,b), tabe(b,a));
        }

        for(int x : results)
            System.out.println(x);
    }
}
