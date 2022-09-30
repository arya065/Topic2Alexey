

package operadoresbooleanos;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of seconds");
        int sec= in.nextInt();
        
        int hour= sec/3600; 
        sec= sec- hour*3600;
        int min= sec/60;
        sec= sec- min*60;
        System.out.printf("Hours %d\n Minutes %d\n Seconds %d\n",hour,min,sec);
        
        
        
        
    }
    
}
