import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if (s.substring(1).equals(s.substring(1).toUpperCase())) {
            char firstChar = s.charAt(0);
            String flipped = s.toLowerCase();
            if (Character.isLowerCase(firstChar))
                System.out.println(Character.toUpperCase(flipped.charAt(0)) + flipped.substring(1));
            else 
                System.out.println(flipped);
        }
        else 
            System.out.println(s);
        
    }
}