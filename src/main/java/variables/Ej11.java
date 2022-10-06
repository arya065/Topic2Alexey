

package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej11 {

    public static void main(String[] args) {
        
        Double s1,s2,S;
                
        String A=JOptionPane.showInputDialog("Enter the value of R");
        String B=JOptionPane.showInputDialog("Enter the value of H");
        
        Double r=Double.parseDouble(A);
        Double h=Double.parseDouble(B);
        
        s1= Math.PI*r;
        s2= Math.pow(h, 2);
        S=s1+s2;
        JOptionPane.showMessageDialog(null, "The area of the room is "+S);
    }
}