
package br.com.sptech.projeto02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Randomicos {
    
    public static void main(String[] args) {
        
        
        // Javascripto <3
        /*
            var teste = 42;
            
            `Numero gerado ${teste}`
        
        Java :)
        
            %s - indica que será exibido um texto;
            %d - indica que será exibido um número inteiro;
            %.1f - indica será exibido um número real com a quantidade
            informada de casas decimais.
            
        
            String.format("Numero gerado: ");
        */
        
        // ThreadLocalRandom possui funções auxiliares 
        // para geração de números aleatórios, são eles
        // nextInt - para inteiros
        // nextDouble - para numeros reais ou com ponto flutuante
        // nextBoolean - para booleanos
        Integer numero = ThreadLocalRandom.current().nextInt(0, 101);
        
        System.out.println(String.format("Numero gerado: %d",
                numero));
        
        // Math.random() existe e segue a mesma regra do JS;
        // Random random = new Random();
        
    }
}
