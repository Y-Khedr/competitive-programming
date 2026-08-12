import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            s = s + s;
            
            if (c == 'g') {
                System.out.println(0);
                continue;
            }
            
            int count = 0;
            int max = 0;
            boolean track = false;
 
            for (int i = 0; i < n * 2; i++) {
                char current = s.charAt(i);
                
                if (current == c && !track) {
                    track = true;
                    count = 0;
                }
                
                if (track) {
                    if (current == 'g') {
                        if (count > max) 
                            max = count;
                        track = false;
                    }
                    else
                        count++;
                    
                }
            }
            
            System.out.println(max);
        }
        sc.close();
    }
}