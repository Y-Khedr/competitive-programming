import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String res="";
        int n = s.length();
        for(int i=0; i<n; i++){
            char c=s.charAt(i);
            if(c!= 'a' && c!= 'o' && c!= 'u' && 
               c!= 'e' && c!= 'i' && c!= 'y')
                    res += "."+c;
        }
        System.out.println(res);
    }
}