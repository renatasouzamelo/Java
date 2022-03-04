
package controle;

import java.util.Scanner;


public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe a media");
      
        Double media = entrada.nextDouble();
        
        if (media <=10 && media>=7) {
            System.out.println("Parabéns!!!");
            
        }
        if (7 >= media) if (media <0) {
        } 
            System.out.println("Reprovado!!!");
    
        
        
    }
    
}
