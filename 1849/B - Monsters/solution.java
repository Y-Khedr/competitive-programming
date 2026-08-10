import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
    // A clean OOP structure to hold each monster's data
    static class Monster {
        int id;
        int remHealth;
 
        public Monster(int id, int remHealth) {
            this.id = id;
            this.remHealth = remHealth;
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            Monster[] monsters = new Monster[n];
            
            for (int i = 0; i < n; i++) {
                int hp = sc.nextInt();
                int rem = hp % k;
                if (rem == 0) rem = k;
                
                monsters[i] = new Monster(i + 1, rem); 
            }
            
            Arrays.sort(monsters, new Comparator<Monster>() {
                @Override
                public int compare(Monster m1, Monster m2) {
                    if (m2.remHealth != m1.remHealth) {
                        return Integer.compare(m2.remHealth, m1.remHealth);
                    }
                    return Integer.compare(m1.id, m2.id);
                }
            });
            
            for (int i = 0; i < n; i++) {
                System.out.print(monsters[i].id + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}