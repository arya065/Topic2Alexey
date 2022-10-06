

package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej11 {

    public static void main(String[] args) {
        
        Double s1,s2,S;
                
        String A=JOptionPane.showInputDialog("Enter the value of Radius");
        String B=JOptionPane.showInputDialog("Enter the value of side H");
        
        Double r=Double.parseDouble(A);
        Double h=Double.parseDouble(B);
        
        s1= Math.PI*Math.pow(r,2)/2;
        s2= (Math.sqrt(Math.pow(h, 2)-Math.pow(r,2)))*r;
        System.out.println(s1);
        System.out.println(s2);
        
        S=s1+s2;
        JOptionPane.showMessageDialog(null, "The area of the room is "+S);
    }
}