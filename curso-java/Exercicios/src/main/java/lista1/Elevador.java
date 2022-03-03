/*
 Seja executável.
Solicite ao usuário o limite de peso de um elevador (número real).
Solicite ao usuário o limite de pessoas em um elevador (número inteiro).
Solicite ao usuário o peso da 1ª pessoa que entrou no elevador (número real).
Solicite ao usuário o peso da 2ª pessoa que entrou no elevador (número real).
Solicite ao usuário o peso da 3ª pessoa que entrou no elevador (número real). 
Ao final, exiba uma frase assim: 

"Entraram 3 pessoas no elevador, no qual cabem X pessoas.
O peso total no elevador é de Y, sendo que ele suporta Z".

(onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das
 */
package lista1;

import java.util.Scanner;


public class Elevador {
    public static void main(String[] args) {
        Scanner leitorElevador = new Scanner (System.in);
         
        System.out.println("Informe o limite de peso do elevador" );
        Integer limitePeso  =leitorElevador.nextInt();
        
        System.out.println("Informe o limite de pessoas no elevador" );
        Integer limitePessoas  =leitorElevador.nextInt();
        
        System.out.println("Informe o peso da primeira pessoa" );
        Integer pesoPrimeiraPessoa  =leitorElevador.nextInt();
        
        System.out.println("Informe o peso da segunda pessoa" );
        Integer pesoSegundaPessoa  =leitorElevador.nextInt();
        
        System.out.println("Informe o peso da terceira pessoa" );
        Integer pesoTerceiraPessoa  =leitorElevador.nextInt();
        
        Integer qtdaPessoasTotal = limitePessoas;
        Integer pesoTotal = pesoPrimeiraPessoa + pesoSegundaPessoa + pesoTerceiraPessoa;
        Integer pesoSuportado= limitePeso;
        
        
        System.out.println(String.format("""
                                         Entraram 3 pessoas no elevador, no qual cabem %d pessoas.
                                         O peso total no elevador \u00e9 de %d, sendo que ele suporta %d""",qtdaPessoasTotal, pesoTotal, pesoSuportado));
        
        
    }
    
}
