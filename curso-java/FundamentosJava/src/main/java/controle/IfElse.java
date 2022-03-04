
package controle;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
     
       Scanner leitor = new Scanner (System.in);
         
        System.out.println("Informe um numero" );
        Integer numero  =leitor.nextInt();
        
        // Par numero % 2 ==0
        // ímpar numero % 2 ==1
        
        if (numero % 2 ==0 ) {
            System.out.println("Numero par");
            
        }else  {
            System.out.println("Numero ímpar");
            
        }
        
        
       
    }
}
