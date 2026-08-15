import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
 
        int n = sc.nextInt();
        int t = sc.nextInt();
 
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int left = 0;
        int current_sum = 0;
        int max_books = 0;
 
        for (int right = 0; right < n; right++) {
            current_sum += a[right];
            
            while (current_sum > t) {
                current_sum -= a[left];
                left++;
            }
            
            max_books = Math.max(max_books, right - left + 1);
        }
        
        System.out.println(max_books);
        sc.close();
    }
}