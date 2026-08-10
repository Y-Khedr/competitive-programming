import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x = Math.abs(sc.nextLong());   
            long y = Math.abs(sc.nextLong());   
            long a = sc.nextLong();   
            long b = sc.nextLong();   
            
            // Option 1
            long costA = (x + y) * a;
            
            // Option 2
            long sharedSteps = Math.min(x, y);
            long remainingSteps = Math.max(x, y) - sharedSteps;
            long costB = (sharedSteps * b) + (remainingSteps * a);
            
            System.out.println( Math.min(costA, costB) );
        }
        sc.close();
    }
}