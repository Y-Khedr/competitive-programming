import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            
            int count = k;
            int countEven = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
                if (a[i] % 2 == 0) {
                    countEven++;
                }
                
                int rem = a[i] % k;
                if (rem == 0)
                    count = 0;
                else 
                    count = Math.min(count, k - rem);
                
            }
            
            if (k == 4) {
                int countFor;
                if (countEven >= 2)
                    countFor = 0;
                else if (countEven == 1) 
                    countFor = 1;
                else 
                    countFor = 2;
                
                count = Math.min(count, countFor);
            }
            
            System.out.println(count);
        }
    }
}