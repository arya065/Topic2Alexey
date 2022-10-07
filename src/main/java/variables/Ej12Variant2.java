/*Dado un número de dos cifras, diseñe un algoritmo 
que permita obtener el número invertido. Ejemplo, 
si se introduce 23 que muestre 32.
*/
package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej12Variant2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int a,b;
        double d,e,f;
        
        String a1=JOptionPane.showInputDialog("Enter the number of two digits");
        a=Integer.parseInt(a1);
        
        
        d=a/10.0;
        e=Math.floor(d);
        f=Math.round((d-e)*100);
        b=(int) Math.round(f+e);
        
        JOptionPane.showMessageDialog(null, "Converted number is "+b);
        
    }
}
