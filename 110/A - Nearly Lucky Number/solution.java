import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count =0;
        for(int i=0; i<n;i++){
            char temp = s.charAt(i);
            if(temp == '4' || temp == '7')
                count++;
        }
        if(count==4 || count==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}