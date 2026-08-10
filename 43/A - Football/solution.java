import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countA =0;
        int countB=0;
        String a = sc.next();
        String b="";
        countA++;
        for(int i =1;i<n;i++){
            String x = sc.next();
            if (x.equals(a)) countA++;
            else {
                countB++;
                b = x;
            }
        }
        if(countA>countB)
            System.out.println(a);
        else
            System.out.println(b);
    }
}