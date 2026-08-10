import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int x=0;
    for(int i=0; i<n; i++){
        String word = sc.next();
        if(word.charAt(1)=='-')
            x = x-1;
        else if(word.charAt(1)=='+')
            x = x+1;
        }
    System.out.print(x);
    }
}