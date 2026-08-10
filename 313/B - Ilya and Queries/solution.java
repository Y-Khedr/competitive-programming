import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int m = sc.nextInt();
        int [] dp=new int[n];
        for(int i=1; i<n;i++){
            int x=0;
            if(s.charAt(i)==s.charAt(i-1)) x=1;
            dp[i]= dp[i-1] + x;
        }
        
        
        while(m-- >0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(dp[r-1] - dp[l-1]);
        }
    }
}