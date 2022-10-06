package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej10 {

    public static void main(String[] args) {
        
        Double s1,s2,S;
        String A=JOptionPane.showInputDialog("Enter the value of side A");
        String B=JOptionPane.showInputDialog("Enter the value of side B");
        String C=JOptionPane.showInputDialog("Enter the value of side C");
        
        Double a=Double.parseDouble(A);
        Double b=Double.parseDouble(B);
        Double c=Double.parseDouble(C);
        
        s1= b*c;
        s2= (a-c)/2*b;
        S=s1+s2;
        JOptionPane.showMessageDialog(null, "The area of the room is "+S);
        
    }
}
