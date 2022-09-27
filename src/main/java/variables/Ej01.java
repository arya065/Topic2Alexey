
package variables;

public class Ej01 {
        public static void main(String[] args) {
            boolean a;
            char b;
            byte c;
            short d;
            int e;
            long f;
            float g;
            double h;
            final int i;
            final double j;
            String k;
            a= true;
            b=65;
            c=2;
            d=3;
            e=4;
            f=5L;
            g=6f;
            h=7;
            i=8;
            j=9;
            k= "Hello";
            System.out.printf(" a=%s\n b=%c \n c=%d\n d=%d\n e=%d\n f=%d\n g=%f\n h=%f\n i=%d\n j=%f\n k=%s\n",a,b,c,d,e,f,g,h,i,j,k);
            System.out.format(" g=%.2f\n h=%.2f\n j=%.2f\n",g,h,j);
        }
    
}
