
package fundamentos;


public class OperadorLogico {
    public static void main(String[] args) {
        
        Boolean condicao1 = true;
        Boolean condicao2 = 3 > 7;
        
        //TABELAS VERDADE
        
        System.out.println( condicao1 && !condicao2);
        System.out.println( condicao1 || condicao2);
        System.out.println( condicao1 ^ condicao2);
        System.out.println( !condicao1);
        System.out.println( !condicao2);
        
        System.out.println( "/nTABELA VERDADE E (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println( "/nTABELA VERDADE OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println( "/nTABELA VERDADE OU EXCLUSIVO (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        
        // NOT NÃO É BINÁRIO
        System.out.println( "/nTABELA VERDADE NOT");
        System.out.println(!true);
        System.out.println(!false);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
