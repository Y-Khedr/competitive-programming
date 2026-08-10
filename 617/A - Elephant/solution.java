import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int steps=0;
        while(x!=0){
            steps++;
            if(x<=5)
                break;
            else
                x-=5;
        }
        System.out.println(steps);
    }
}