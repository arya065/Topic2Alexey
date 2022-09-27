

package operadoresbooleanos;


public class Ej05 {

    public static void main(String[] args) {
        
        boolean verdadero= true;
        boolean falso= false;
        
        String test = String.format("""
                                    
                                    verdadero && verdadero=%s
                                    verdadero && falso=%s
                                    falso && verdadero=%s
                                    falso && falso=%s
                                    verdadero || verdadero=%s
                                    verdadero || falso=%s
                                    falso || verdadero=%s
                                    falso || falso=%s
                                    
                                    """
                ,verdadero && verdadero,verdadero && falso,falso && verdadero,falso && falso,
                verdadero || verdadero,verdadero || falso,falso || verdadero,falso || falso
        );
        
       
        System.out.println(test);
        System.out.println("!verdadero="+!verdadero);
        System.out.println("!falso="+!falso);
    }
}
/*
verdadero && verdadero
verdadero && falso
falso && verdadero
falso && falso
verdadero || verdadero
verdadero || falso
falso || verdadero
falso || falso
*/
