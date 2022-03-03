
package lista1;

import java.util.Scanner;

/**
 *
 * Crie uma classe Java que:
Solicite ao usuário quantos filhos de 0 a 3 anos possui.
Solicite ao usuário quantos filhos de 4 a 16 anos possui.
Solicite ao usuário quantos filhos de 17 a 18 anos possui.
Calcule o valor da Bolsa, sendo que o governo paga:

* R$25,12 por filhos com menos de 4 anos 
* R$15,88 por filhos entre 4 e 16 anos 

* R$12,44 por filhos entre 17 e 18 anos

Exiba uma frase como esta: 
"Você tem um total de T filhos e vai receber R$B de bolsa" Use interpolação com 2 casas decimais para o valor da bolsa
 */
public class BolsaFilhos {
    public static void main(String[] args) {
        
        
       Scanner leitorIdade = new Scanner (System.in);
        
        
        
        System.out.println("Digite quantos filhos de 0 a 3 anos possui?" );
        Integer idadeDigitada  = leitorIdade.nextInt();
        

        
        System.out.println("Digite quantos filhos de 4 a 16 anos possui?");
        Integer idadeDigitada2 = leitorIdade.nextInt();
        
       
        
        System.out.println("Digite quantos filhos de 17 a 18 anos possui? ");
        Integer idadeDigitada3 = leitorIdade.nextInt();
        
        Double quantidade1 = idadeDigitada*25.12;
        Double quantidade2 = idadeDigitada2*15.88;
        Double quantidade3 = idadeDigitada3*12.44 ;
        
        
        Double valorBolsa = quantidade1+quantidade2+quantidade3;
        
      
        
        System.out.println(String.format("Valor da bolsa: %.2f", valorBolsa));
        
       
        
          

        
    } 
}
