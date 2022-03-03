
package fundamentos;

public class Ternario {
    
    public static void main(String[] args) {
        Double media = 8.6;
        String resultadoFinal = media >= 7.0 ?  

                "Aprovado" : "Reprovado";
        
        System.out.println("O aluno está" + resultadoFinal);
        
        
        Double nota = 9.9;
        Boolean bomCpomportamento = false;
        Boolean passouPorMedia = nota >= 7;
        Boolean temDesconto = bomCpomportamento &&  passouPorMedia;
        String resultado = temDesconto ? "sim" : "não";
        
        System.out.println("Tem desconto? %s" + resultado );
        
        
        
    }
    
}
