
package br.com.sptech.projeto02;

import java.util.Scanner;

public class Lacos {
    
    public static void main(String[] args) {
        
        System.out.println("---> Laços de repetição <---");
        
        System.out.println("Exemplo 01: for 1 a 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("Contador: %d ", i));
        }
        
        System.out.println("Exemplo 02: for 10 a 0 ");
        for (int i = 10; i >= 0; i--) {
            System.out.println(String.format("Contador: %d ", i));
        }
        
        System.out.println("Exemplo 03: while - acerte o número");

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Acerte o número: ");
        Integer numeroDigitado = leitor.nextInt();
        
        while (numeroDigitado != 42) {            
            System.out.println("Errou :( ... Tente novamente:");
            numeroDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou!!!");
        
        System.out.println("Exemplo 04: while 0 a 10");
        
        Integer contador = 0;
        while (contador <= 10) {            
            System.out.println(String.format("Contador: %d", contador));
            contador++;
        }          
        
        System.out.println("Exemplo 05: while 10 a 0");
        Integer contador2 = 10;
        while (contador2 >= 0) {            
            System.out.println(String.format("Contador: %d", contador2));
            contador2--;
        }
 
        System.out.println("Exemplo 06: do while - acerte o número");
        
        Integer numeroDigitado2 = 42;
        
        do {            
            System.out.println("Acerte o número (do while)");
            numeroDigitado2 = leitor.nextInt();
        } while (numeroDigitado2 != 42);
        
    }
}