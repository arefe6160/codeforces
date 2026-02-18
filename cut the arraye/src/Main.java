import java.util.*;

public class Main {

    static int tabe(int[] arr, int x, int y){
        int sum = 0;
        for (int i = x ; i <= y ; i++){
            sum += arr[i];
        }
        return sum % 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int l = 0, r = 0;
            boolean found = false;

            for (int i = 0; i < n-2 ; i++){
                for (int j = i+1; j < n-1; j++){

                    int s0 = tabe(arr,0,i);
                    int s1 = tabe(arr,i+1,j);
                    int s2 = tabe(arr,j+1,n-1);
                    
                    if ((s0!=s1 && s1!=s2 && s0!=s2) || (s0==s1 && s1==s2)){

                        l =i+1;
                        r = j+1;
                        found = true;
                        break;
                    }
                }
                if(found) break;
            }

            System.out.println(l+" "+r);
        }
    }
}
