import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if(m>n){
            System.out.println(-1);
            return;
        }
        int two = n/2;
        int one = n%2;
        int count = two+one;
        while(count%m!=0){
        count++;
        two--;
        one++;
        }
       
        System.out.println(count);
        
    }
}