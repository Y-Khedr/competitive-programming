import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++)
            for(int j=1; j<=5; j++){
                int m = sc.nextInt();
                if(m==1){
                    System.out.print( Math.abs(i-3) + Math.abs(j-3) );
                    return;
                }
            }
    }
}