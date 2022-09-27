package operadoresaritmeticos;


public class Ej03 {
    
    public static void main(String[] args){
        
      int a=10, b=5, i=0;
      double c=71.3, d=4.8;
      int summ1=a+b;
      int summ2=a-b;
      int mul1=a*b;
      int del1=a/b;
      double summ3=c+d;
      double summ4=c-d;
      double mul2=c*d;
      double del2=c/d;
      int summ5=a*=3;
      int summ6=b-=1;
      int del3=a/=b;
      double summ7=c+=d;
      int summ8=i++;
      int summ9=++i;
      String test = String.format("""
                                  
                                  a+b=%d
                                  a-b=%d
                                  a*b=%d
                                  a/b=%d
                                  c+d=%f
                                  c-d=%f
                                  c*d=%f
                                  c/d=%f
                                  a*=3=%d
                                  b-=1=%d
                                  a/=b=%d
                                  c+=d=%f
                                  
                                  """
              ,summ1,summ2,mul1,del1,summ3,summ4,
              mul2,del2,summ5,summ6,del3,summ7
      );
      
      System.out.println(test);
      System.out.println(i);
      System.out.println(summ8);
      System.out.printf("i=%d,i++=%d",i,summ9);
    }
    
    
    
}