

package variables;
import java.util.*;

public class Ej04 {

    public static void main(String[] args){
        
        int a,b,c;
        double d;
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter the number of km");
        a= in.nextInt();
        d= 1.25+ 0.08*a;
        System.out.printf("Price "+d);
    }
    
}