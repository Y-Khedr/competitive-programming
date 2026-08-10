import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]prices= new int[n];
        for(int i=0;i<n;i++)
            prices[i]=sc.nextInt();
        Arrays.sort(prices);
        int count=0;
        
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt(); 
            count = getShopCount(prices, x);
            System.out.println(count);
        }
    }
    public static int getShopCount(int[] prices, int budget) {
        int low = 0;
        int high = prices.length - 1;
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prices[mid] <= budget) {
                ans = mid + 1; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }
}