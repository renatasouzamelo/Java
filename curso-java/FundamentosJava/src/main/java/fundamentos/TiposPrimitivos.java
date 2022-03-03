 package fundamentos;
 
 public class TiposPrimitivos {
    public static void main(String[] args) {
        // tipos numericos inteiros
        byte anosDeEmpresa =23;
        short numeroDeVoos =542;
        int id = 567789;
        long pontosAcumulados = 3_134_845_223L;
         // tipos numericos reias 
         float salario = 11_445.44F;
         double vendasAcumuladas = 2_997_999_99;
         
        // tipo booleno
        boolean estaDeFerias = false;
        
        // tipo caracter 
        char status = 'A';
        
        // DIA DE EMPRESA 
        System.out.println(anosDeEmpresa * 365);
        
        // numero de viagens 
        System.out.println(numeroDeVoos/2);
        
        //pontos por real
        System.out.println(pontosAcumulados /vendasAcumuladas);
        
        // id 
        
        System.out.println(id + ":ganha" + salario);
        // ferias 
        System.out.println(id + "Férias?" + estaDeFerias);
        
        // status 
        System.out.println("Status" + status);
    }
    
}
