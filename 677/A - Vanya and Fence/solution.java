import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int h = sc.nextInt();
        int count =0;
        
        for(int i=0; i<num; i++){
            int x = sc.nextInt();
            if(x>h)
                count+=2;
            else
                count++;
        }
        System.out.println(count);
    }
}