

package variables;

import java.util.*;

public class Ej06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double a,b,c,summ;
        
        System.out.println("Enter the first part");
        a=in.nextDouble();
        System.out.println("Enter the second part");
        b=in.nextDouble();
        System.out.println("Enter the third part");
        c=in.nextDouble();
        
        summ=a+b+c;
        double percent1= a%summ;
        double percent2= b%summ;
        double percent3= c%summ;
        
        System.out.printf("The percent of 1-st person is %.3f \n",percent1);
        System.out.printf("The percent of 2-nd person is %.3f \n",percent2);
        System.out.printf("The percent of 3-rd person is %.3f",percent3);
    }
}
