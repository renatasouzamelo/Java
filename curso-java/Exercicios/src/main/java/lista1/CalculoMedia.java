/*
 Seja executável
Solicite o nome e duas notas ao usuário.
As notas são números reais.
Calcule a média entre as notas (Dica: é da mesma forma como se faz em JavaScript)
Exiba uma frase como esta: "Olá, NOME. Sua média foi de MEDIA"
Use Interpolação com 1 casa decimal para a média.
 */
package lista1;

import java.util.Scanner;


public class CalculoMedia {
    public static void main(String[] args) {
       
        Scanner leitorMedia = new Scanner (System.in);
         
        System.out.println("Informe o seu nome");
        String nome =leitorMedia.next();
        
        System.out.println("Informe a primeira nota");
        Double nota1 =leitorMedia.nextDouble();
        
        System.out.println("Informe a segunda nota");
        Double nota2 =leitorMedia.nextDouble();
        
        Double somaNotas = nota1 + nota2;
        Double resultadoNotas= somaNotas/2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f",nome,resultadoNotas));
        
        
        
    }
    
}
