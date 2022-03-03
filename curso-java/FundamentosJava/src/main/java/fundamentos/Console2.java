
package fundamentos;

import java.util.Scanner;


public class Console2 {
    
    public static void main(String[] args) {
       
        
        System.out.println("Bom");
        System.out.println("dia!");
        // imprime e quebra linha
   
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome  = entrada.nextLine();
        //resultado armazenado na string nome
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome  = entrada.nextLine();
        
        System.out.println("Digite sua idade:");
        Integer idade  = entrada.nextInt();
        
        System.out.println("Seu nome é" +" " + nome + " " +sobrenome + " " + "sua idade é " + idade);
       //System.out.println("%s %s tem %d anos.");
        
       
    
    }
    
    
}