package br.com.sptech.projeto02;

public class NovoOperador {

    public static void main(String[] args) {
     
        String nome = "Diego Brito";
        Boolean isProfessor = true;
        
        String resultado;
        
//        if (professor) {
//            resultado = String.format("%s é professor",nome);
//        } else {
//            resultado = String.format("%s é ñ professor",nome);
//        }
//        
//        System.out.println(resultado);
        // Operador ternário é "um if else de uma linha"
        
        resultado = 
                isProfessor ?
                "Sim é professor":"Não, é impostor";
        
    }    
}
