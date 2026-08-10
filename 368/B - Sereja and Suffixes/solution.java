import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        boolean[] checked = new boolean[100005]; 
        
        int[] answers = new int[n];
        int uniqueCount = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            int currentNumber = a[i];
            
            if (checked[currentNumber] == false) {
                checked[currentNumber] = true; 
                uniqueCount++;                 
            }
            
            answers[i] = uniqueCount;
        }
        
        for (int i = 0; i < m; i++) {
            int queryIndex = sc.nextInt();
            System.out.println(answers[queryIndex - 1]);
        }
        
        sc.close();
    }
}