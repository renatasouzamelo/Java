/*
 Crie uma classe Java chamada "CadastroUsuario" que:
Seja executável
Solicite o login do cliente
Solicite a senha do cliente
Solicite a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio
Exiba uma frase como esta: "Seu login é L e sua senha é S. Você tem T tentativas antes de ser bloqueado" 
Use interpolação
 */
package lista1;

import java.util.Scanner;


public class CadastroUsuario {
    
    public static void main(String[] args) {
        Scanner leitorCadastro = new Scanner (System.in);
        
        System.out.println("Digite o seu login" );
        String login  = leitorCadastro.next();
        
        System.out.println("Digite a sua senha" );
        String senha  = leitorCadastro.next();
        
                
        System.out.println("Qual a quantidade de vezes que o usuário aceita errar a senha antes do bloqueio" );
        Integer qtdaErros  = leitorCadastro.nextInt();    
        
     
        
        System.out.println(String.format("Seu login é %s e sua senha é %s.Você tem %d tentativas antes de ser bloqueado",
                 login, senha, qtdaErros));
        
        
        
    }
    
}
