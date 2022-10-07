/*Dado un número de dos cifras, diseñe un algoritmo 
que permita obtener el número invertido. Ejemplo, 
si se introduce 23 que muestre 32.
*/
package variables;

import java.util.*;

public class Ej12 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a,b;
        double d,e,f;
        
        System.out.println("Enter the number of two digits");
        a=in.nextInt();
        
        
        d=a/10.0;
        e=Math.floor(d);
        f=Math.round((d-e)*100);
        b=(int) Math.round(f+e);
        
        System.out.printf("Converted number is %d",b);
        
    }
}