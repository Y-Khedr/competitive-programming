import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int cost=0;
        for(int i=1; i<=w; i++)
            cost+=k*i;
        if(cost<n)
            System.out.println("0");
        else
            System.out.println(cost-n);
    }
}