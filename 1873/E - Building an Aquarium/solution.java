import java.util.Scanner;
 
public class Main {
 
    public static boolean canBuild(long[] a, long x, long target) {
        long waterUsed = 0;
        for (long height : a) {
            if (height < target) 
                waterUsed += (target - height);
            
            if (waterUsed > x) 
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong(); 
 
            long[] a = new long[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextLong();
 
            long low = 1;
            long high = 2_000_000_000L;
            long target = 1;
 
            while (low <= high) {
                long mid = low + (high - low) / 2;
 
                if (canBuild(a, x, mid)) {
                    target = mid;
                    low = mid + 1;
                } 
                else 
                    high = mid - 1;
            }
            System.out.println(target);
        }
        sc.close();
    }
}