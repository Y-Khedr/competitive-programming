import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int current = 1;
        long count=0;
        
        for(int i=0; i<m; i++){
            int target = sc.nextInt();
            if(target>=current){
                count+=target-current;
                current=target;
            }
            else{
                count+= (n-current)+target;
                current=target;
            }
            
        }
        System.out.println(count);
        
    }
}