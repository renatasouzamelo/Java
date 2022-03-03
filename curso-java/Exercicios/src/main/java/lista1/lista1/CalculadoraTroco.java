/*
 Seja executável.
Solicite o valor unitário de um produto.
Solicite a quantidade vendida.
Solicite o valor pago pelo cliente.
Calcule e exiba o troco com a seguinte frase: "Seu troco será de R$ X", onde "X" é o valor a ser devolvido ao cliente.
 */
package lista1;

import java.util.Scanner;


public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitorTroco = new Scanner (System.in);
         
        System.out.println("Informe o valor unitário?" );
        Double valorUnitario  =leitorTroco.nextDouble();
        
        System.out.println("Qual a quantidade vendida?" );
        Integer qtdaVendida  =leitorTroco.nextInt();
        
        System.out.println("Valor pago pelo cliente");
        Double valorPago = leitorTroco.nextDouble();
        
        Double valorTotal = qtdaVendida * valorUnitario;
        
        Double troco = valorPago - valorTotal;
        
        
        System.out.println(String.format("Seu troco será de R$ %.2f, onde ",troco ));
    }
}
    
        
        
        
         
         

