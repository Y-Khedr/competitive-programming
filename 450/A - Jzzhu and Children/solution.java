import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int maxTurns = 0;
        int lastChildIndex = 1; 
        
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int turns = (x + m - 1) / m;
            
            if (turns >= maxTurns) {
                maxTurns = turns;
                lastChildIndex = i; 
            }
        }
        
        System.out.println(lastChildIndex);
        sc.close();
    }
}