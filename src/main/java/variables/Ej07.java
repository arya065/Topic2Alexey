

package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej07 {

    public static void main(String[] args) {
        
        double b,c;
        
        String a=JOptionPane.showInputDialog("Enter the number of euros",100);
        c=Double.parseDouble(a);
    
        b=c*0.99;
        JOptionPane.showMessageDialog(null, b+" USD");
        
    }
}