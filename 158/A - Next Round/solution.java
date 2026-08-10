import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count=0, target=0;
        for(int i=1; i<=n; i++){
            int score = sc.nextInt();
            if(i<=k && score!=0){
                count++;
                if(i==k)
                    target=score;
            }
            if(i>k && score!=0 && target==score)
                count++;
        }
        System.out.println(count);
 
    }
}