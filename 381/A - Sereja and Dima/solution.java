import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int [] count = new int[n];
        for(int i=0;i<n;i++)
            count[i]=sc.nextInt();
        
        int left = 0;
        int right = n-1;
        
        int one = 0;
        int two = 0;
        
        boolean turn_odd = true;
        while(left<=right){
            int pick;
            
            if(count[left]>count[right]){
                pick = count[left];
                left++;
            }
            else{
                pick = count[right];
                right--;
            }
            if(turn_odd)
                one+=pick;
            else
                two+=pick;
            
            turn_odd = !turn_odd;
            
        }
        
        System.out.println(one + " " + two);
        sc.close();    
    }
}