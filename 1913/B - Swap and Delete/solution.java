import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-- > 0){
            String s = sc.next();
            int n = s.length();
            
            int count0=0;
            int count1=0;
            for(int i=0; i<n;i++)
                if(s.charAt(i)=='0') count0++;
                else count1++;
            
            int i=0;
            for(i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    if(count1 > 0) count1--;
                    else break;
                }
                
                else{
                    if(count0>0) count0--;
                    else break;
                }
            }
            System.out.println(n-i);
        }
        
        
    }
}