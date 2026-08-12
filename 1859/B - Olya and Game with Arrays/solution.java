import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int abs_min = Integer.MAX_VALUE;
            int min_second = Integer.MAX_VALUE;
            long sum = 0;
            
            while (n-- > 0) {
                int min = Integer.MAX_VALUE;
                int least_second = Integer.MAX_VALUE;
                
                int m = sc.nextInt();
                for (int i = 0; i < m; i++) {
                    int x = sc.nextInt();
                    
                    if (x < min) {
                        least_second = min; 
                        min = x;
                    } else if (x < least_second) {
                        least_second = x;
                    }
                }
                
                sum += least_second;
                
                if (min < abs_min) 
                    abs_min = min;
                
                if (least_second < min_second) 
                    min_second = least_second;
                
            }
            
            System.out.println(sum - min_second + abs_min);
        }
        
        sc.close();
    }
}