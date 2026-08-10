import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        if (n == 1 && t == 10) {
            System.out.println(-1);
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (t == 10) {
            sb.append("1");
            for (int i = 0; i < n - 1; i++) 
                sb.append("0");
            } 
        else 
            for (int i = 0; i < n; i++) 
                sb.append(t);
    
        System.out.println(sb.toString());
    }
}