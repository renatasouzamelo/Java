
package fundamentos;

import java.util.Scanner;


public class Wrappers {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Byte b = 100;
        Short s = 1000;
        Integer i= Integer.parseInt(entrada.nextLine()); 
      // TIPO PRIMITIVO É O INT
       // Long l = 1000000000L;
        
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3); 
    }
    
}
