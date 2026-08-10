import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int lower=0;
        for(int i=0; i<n;i++){
            char c= s.charAt(i);
            if(c>='a'&& c<='z')
                lower++;
        }
        int upper = n-lower;
        if(lower>=upper)
            System.out.println(s.toLowerCase() );
        else
            System.out.println(s.toUpperCase() );
    }
}