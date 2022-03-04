
package fundamentos;

import java.util.Random;


public class NumerosAleatorios {
    
    public static void main(String[] args) {
   
   Random aleatorio = new Random();
   int valor = aleatorio.nextInt(30); //gerar entre 0 e 29, sempre -1
   
        System.out.println("Número gerado:" + valor);
        
        
    
        
    }
  
}
