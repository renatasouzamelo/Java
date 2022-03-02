
package fundamentos;

import java.util.Scanner;


public class Console {
    
    public static void main(String[] args) {
        //System.out.print("Bom");
        //System.out.print("dia!");
        //mesma linha 
        
        System.out.println("Bom");
        System.out.println("dia!");
        // imprime e quebra linha
        
        //System.out.printf("Megasena: %d %d %d", 1,2,3);
       // formata linha 
       
       // Nn% quebre linha System.out.printf("nome: n%", "Renata");
       
       // /n quebra linha 
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome  = entrada.nextLine();
        //resultado armazenado na string nome
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome  = entrada.nextLine();
        
        System.out.println("Digite sua idade:");
        int idade  = entrada.nextInt();
        
        System.out.println("Nome =" + nome + "" +sobrenome + "" + idade);
       //System.out.println("%s %s tem %d anos.");
        
        //entrada.close();
    
    }
    
    
}
