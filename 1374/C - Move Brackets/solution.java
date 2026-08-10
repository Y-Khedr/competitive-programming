import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int balance = 0;
            int moves = 0;
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '(' ) 
                    balance++;
                else  
                    if (balance > 0) 
                        balance--; 
                    else 
                        moves++; 
                }
            
            System.out.println(moves);
        }
    }
}