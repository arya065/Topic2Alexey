

package variables;
import java.util.*;
import java.util.Random;

public class Ej05 {

    public static void main(String[] args){
        int a,c;
        double d,b;
        Scanner in= new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter number of hours of teachers");
        a=in.nextInt();
        System.out.println("Enter number of groups");
        b=in.nextFloat();
        
        d= Math.ceil((b*30)/a);
        System.out.printf("Number of teachers is "+Math.round(Math.ceil(d)));
        
    }
    
}
