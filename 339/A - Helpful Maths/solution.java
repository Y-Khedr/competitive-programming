import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n1=0;
        int n2=0;
        int n3=0;
        for(int i=0; i<(s.length()/2)+1; i++){
            int x = s.charAt(i*2) - '0' ;
            if(x==1)
                n1++;
            else if(x==2)
                n2++;
            else
                n3++;
        }
        boolean first=false;
        for(int i=0; i<n1; i++){
            if(first)
                System.out.print("+1");
            else{
                System.out.print("1");
                first = true;}
        }
        for(int i=0; i<n2; i++){
            if(first)
                System.out.print("+2");
            else{
                System.out.print("2");
                first=true;}
        }
        for(int i=0; i<n3; i++){
            if(first)
                System.out.print("+3");
            else{
                System.out.print("3");
                first = true;}
        }
    }
}