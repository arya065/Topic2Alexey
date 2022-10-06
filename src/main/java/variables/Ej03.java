package variables;
import java.util.*;

public class Ej03 {

    public static void main(String[] args){
        float a,b,c,d;
        Scanner in= new Scanner(System.in);
        
        System.out.println("Enter number 1");
        a=in.nextFloat();
        System.out.println("Enter number 2");
        b=in.nextFloat();
        System.out.println("Enter number 3");
        c=in.nextFloat();
        d=(a+b+c)/3;
        System.out.printf("Medium nuber is "+d);
    }
    
}
