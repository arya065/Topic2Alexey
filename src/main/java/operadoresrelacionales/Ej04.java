

package operadoresrelacionales;


public class Ej04 {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        boolean op1;
        boolean op2;
        boolean op3;
        boolean op4;
        op1=a<b;
        op2=a>b;
        op3=a==b;
        op4=a!=b;

        System.out.printf(" a<b=%s\n a>b=%s\n a==b=%s\n a!=b=%s\n"
                ,op1,op2,op3,op4);
    }
}
