package variables;

public class Ej02 {
    public static void main(String[] args){
        
        int a=1, b=2, c=3;
        double d=4.5, e=5.7, f=6.9;
        System.out.printf(" a=%d,b=%d,c=%d\n d=%f,e=%f,f=%f\n",a,b,c,d,e,f);
        
        a=b;
        b=c;
        c=a;
        System.out.printf(" a=%d,b=%d,c=%d\n",a,b,c);
    }
    
}
