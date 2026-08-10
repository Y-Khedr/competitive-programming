import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        
        String revS= new StringBuilder(s).reverse().toString();
        
        if(revS.equals(t))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
}