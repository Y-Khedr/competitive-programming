import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            
            long count = 0;
            long totalWays = 0; 
            
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() <= q) {
                    count++;
                } 
                
                else {
                    if (count >= k) {
                        long m = count - k + 1;
                        totalWays += m * (m + 1) / 2;
                    }
                    count = 0; 
                }
            }
            
            if (count >= k) {
                long m = count - k + 1;
                totalWays += m * (m + 1) / 2;
            }
            
            System.out.println(totalWays);
        }
        sc.close();
    }
}