

package Algoritmos;

import java.util.Scanner;


public class Radius {
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the number of radius of circle");
        int r= in.nextInt();
        
        double l=r*2*Math.PI;
        System.out.println("Long of the circle is "+l);
        
        double s=Math.PI*Math.pow(r,2);
        System.out.println("Area of the circle is "+s);
        
        double v=4/3*Math.PI*Math.pow(r,3);
        System.out.println("Volume of the sphere is "+v);
        
    }
}
