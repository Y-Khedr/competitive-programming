import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int z = sc.nextInt();
        
        int max = x*y*z;
        
        max = Math.max((x+y)*z, max);
        max = Math.max(x*(y+z), max);
        max = Math.max(x+y+z, max);
        max = Math.max((x*y)+z, max);
        max = Math.max(x+(y*z),max);
        
        System.out.println(max);
        
        
    }
}