

package Algoritmos;

import java.util.Scanner;

public class TresNotas {

    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        
        float num1;//number 1
        float num2;//number 2
        float num3;//number 3
        
        System.out.println("Enter first number");
        num1= scan1.nextFloat();//scanning number 1
        
        System.out.println("Enter second number");
        num2= scan1.nextFloat();//scanning number 2
        
        System.out.println("Enter third number");
        num3= scan1.nextFloat();//scanning number 3
        

        
        if(num1>num2 && num1<num3 || num1>num3 && num1<num2){
            
            System.out.println("The medium note is"+num1);
        }
        
        if(num2>num1 && num2<num3 || num2>num3 && num2<num1){
            
            System.out.println("The medium note is"+num2);
        }
        
        if(num3>num1 && num3<num2 || num3>num2 && num3<num1){
            
            System.out.println("The medium note is"+num3);
        }
    }
}