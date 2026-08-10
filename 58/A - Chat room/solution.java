import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count =0;
        String target= "hello";
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c==target.charAt(count) )
                count++;
            if(count>=5){
                System.out.println("YES");
                return;
                
            }
        }
        System.out.println("NO");
    }
}