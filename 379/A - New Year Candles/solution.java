import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        
        int hours = 0;
        int leftovers = 0;
        
        while (a > 0) {
            hours += a;       
            leftovers += a;   
            a = leftovers / b; 
            leftovers = leftovers % b;
        }
        System.out.println(hours);
    }
}