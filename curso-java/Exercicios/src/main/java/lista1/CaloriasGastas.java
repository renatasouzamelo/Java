/*


Crie uma classe Java que:
Seja executável
Solicite ao usuário o tempo, em minutos (valor inteiro) que ele passou se aquecendo
Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios aeróbicos (correr, andar, pedalar etc)
Solicite ao usuário o tempo em minutos (valor inteiro) que ele fez exercícios de musculação 
Calcule quantas calorias o Jorge perdeu, sendo que: * cada minuto de aquecimento faz perder 12 calorias * cada minuto de ex aeróbico faz perder 20 calorias * cada minuto de musculação faz perder 25 calorias
Exiba, usando interpolação e apenas valores numéricos inteiros, uma frase como esta: 
"Olá, Jorge. Você fez um total de X minutos de exercícios e perdeu cerca de Y calorias".

 */
package lista1;

import java.util.Scanner;


public class CaloriasGastas {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Qual é o seu nome");
        String nome = leitor.next();
        
        System.out.println("Quantos minutos você passou se aquecendo?" );
        Integer qtdaAquecimento  = leitor.nextInt();
        
        System.out.println("Quantos minutos você fez exercícios aeróbicos?" );
        Integer qtdaAerobico  = leitor.nextInt();
        
        System.out.println("Quantos você fez musculação?" );
        Integer qtdaMusculacao  = leitor.nextInt();
        
        Integer tempoAquecimento  = qtdaAquecimento * 12;
        Integer tempoAerobico  = qtdaAerobico * 20;
        Integer tempoMusculacao = qtdaMusculacao * 25;
        
        Integer tempo = qtdaAquecimento + qtdaAerobico +qtdaMusculacao;

        Integer calorias =  tempoAquecimento+ tempoAerobico + tempoMusculacao;

       

        System.out.println(String.format("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", nome, tempo, calorias));
        
    }
    
}
