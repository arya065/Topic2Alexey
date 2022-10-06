package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Enter the price");
        double price= in.nextDouble();
        
        double iva= 0.21* price;
        System.out.println("Value of IVA is "+iva);
    }
}
