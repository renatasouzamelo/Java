/*
 Seja executável. 
Solicite que o usuário digite o seu nome. 
Em seguida, o programa deverá exibir a mensagem: “Olá, Fulano! Qual o ano de seu nascimento?”.
Depois, o programa deverá exibir: “Em 2030 você terá 25 anos” (sendo "Fulano" o nome digitado pelo usuário e "xx" a idade do usuário).
Exemplo:



Qual é o seu nome?
Maria

Olá, Maria! Qual o ano de seu nascimento?
1995

Em 2030 você terá 35 anos.
 */
package lista1;

import java.util.Scanner;


public class Idade {
    public static void main(String[] args) {
        Scanner leitorIdade = new Scanner (System.in);
         
        System.out.println("Informe o seu nome");
        String nome =leitorIdade.next();
     

        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?",nome));
        Integer anoNasc = leitorIdade.nextInt();

        Integer idadeEm2030 = 2030 - anoNasc;
        
        System.out.println(String.format ("Em 2030 você terá %d anos", idadeEm2030));
    }
    
}
