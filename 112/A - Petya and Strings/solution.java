import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
        int x=0;
        for(int i=0; i<b.length(); i++){
            char c1=a.charAt(i);
            char c2=b.charAt(i);
            if(c1>c2){
                x=1;
                break;
            }
            else if(c2>c1){
                x=-1;
                break;
            }
        }
        System.out.println(x);
    }
}