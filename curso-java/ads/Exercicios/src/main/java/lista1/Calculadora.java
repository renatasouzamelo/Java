/*
 Seja executável (possui o método main).
Solicite um número para o usuário(número real).
Solicite outro número para o usuário(número real).
Calcule e exiba a soma dos dois números digitados.
Calcule e exiba a subtração do primeiro número pelo segundo.
Calcule e exiba a multiplicação do primeiro número pelo segundo.
Calcule e exiba a divisão do primeiro número pelo segundo. 
 */
package lista1;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        
        Scanner leitorCalculadora = new Scanner (System.in);
         
        System.out.println("Informe um numero" );
        Integer numero1  =leitorCalculadora.nextInt();
        
        System.out.println("Informe outro numero" );
        Integer numero2 =leitorCalculadora.nextInt();
        
        Integer subtracao = numero1 + numero2;
        Integer adicao = numero1 - numero2;
        Integer multiplicacao = numero1 * numero2;
        Integer divisao = numero1 / numero2;
        
        System.out.println(String.format("Resultado da soma: %d",adicao));
        System.out.println(String.format("Resultado da subtração: %d",subtracao));
        System.out.println(String.format("Resultado da multiplicação: %d",multiplicacao));
        System.out.println(String.format("Resultado da divisão: %d",divisao));
        
             
        
        
        
    }
    
}
