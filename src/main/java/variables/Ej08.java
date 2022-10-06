package variables;

import java.util.*;
import javax.swing.JOptionPane;

public class Ej08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("Enter the budget");
        d = in.nextDouble();
        a = 0.4*d;//Ginecología
        b = 0.3*d;//Pediatría
        c = 0.3*d;//Traumatología

        System.out.printf("The budget of Ginecología%.2f eur\n"
                + "is Pediatría is%.2f eur\nTraumatología is%.2f eur\n ", a, b, c);
    }
}

//Ginecología, Pediatría y Traumatología
