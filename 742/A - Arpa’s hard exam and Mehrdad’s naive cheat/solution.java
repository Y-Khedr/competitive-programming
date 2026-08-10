import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int x = (int) Math.pow(8,n%4);
        if(n%4==0){
            if(n==0) System.out.println(1);
            
            else System.out.println(6);
            return;   
        }
        System.out.println(x%10);
    }
}