import java.util.Scanner;
import java.util.HashMap;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> hash = new HashMap<>();
            int max_freq = 0;
            
            for(int i = 0; i<n ; i++){
                int skill = sc.nextInt();
                int count = hash.getOrDefault(skill,0) + 1;
                
                hash.put(skill,count);
                max_freq = Math.max(max_freq, count);
                
            }
            
            int unique = hash.size();
            if(max_freq == unique)
                System.out.println(max_freq - 1);
            else
                System.out.println(Math.min(max_freq, unique));
        }
        
        sc.close();
    }
}