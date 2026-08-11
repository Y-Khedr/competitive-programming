import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        
        String[] lang_a = new String[m];
        String[] lang_b = new String[m];
        
        for(int i=0;i<m;i++){
            lang_a[i]=sc.next();
            lang_b[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            String lecture = sc.next();
            
            for(int j=0;j<m;j++){
                if(lang_a[j].equals(lecture)) {
                    
                    if( lang_a[j].length() > lang_b[j].length() )
                        System.out.print(lang_b[j] + " ");
                    else 
                        System.out.print(lang_a[j]+ " ");
                    break;
                }
            }
 
        }
        sc.close();
   
    }
}