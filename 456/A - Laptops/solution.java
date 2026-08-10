import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Laptop[]laptops =new Laptop[n];
        
        for(int i =0; i<n;i++)
            laptops[i]=new Laptop(sc.nextInt(),sc.nextInt() );
            
        Arrays.sort( laptops, (a,b)->Integer.compare(a.price,b.price) );
        for(int i=0;i<n-1;i++){
            if(laptops[i].quality>laptops[i+1].quality){
                System.out.println("Happy Alex");
                return;   
            }
        }
        System.out.println("Poor Alex");
    }
    
    public static class Laptop{
        int price;
        int quality;
        
        public Laptop(int price, int quality){
            this.price = price;
            this.quality=quality;
        }
    }
}