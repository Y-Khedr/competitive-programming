import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        
        // 1. Calculate the sum of the very first window (first k planks)
        int currentWindowSum = 0;
        for (int i = 0; i < k; i++) {
            currentWindowSum += h[i];
        }
        
        int minSum = currentWindowSum;
        int bestIndex = 1; // 
        
        for (int i = k; i < n; i++) {
            currentWindowSum += h[i] - h[i - k];
            
            if (currentWindowSum < minSum) {
                minSum = currentWindowSum;
                bestIndex = i - k + 2; 
            }
        }
        
        System.out.println(bestIndex);
    }
}