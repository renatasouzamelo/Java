/*
 A classe deve ser executável
O programa solicita o salário bruto
O programa calcula o desconto do INSS, que é sempre de 10% sobre o bruto
O programa calcula o desconto de IR, que é sempre de 20% sobre o bruto
O programa pergunta quanto custa a condução diária só de ida da casa para o trabalho. 
O desconto de VT é sempre o que o usuário gasta. Assim, calcula-se assim: Valor de condução ida x 2 x 22.
Calcule o salário líquido, que é o bruto menos os descontos de INSS, IR e VT

 */
package lista1;

import java.util.Scanner;


public class Descontos {
    public static void main(String[] args) {
        Scanner leitorDescontos = new Scanner (System.in);
         
        System.out.println("Informe seu salario" );
        Double salario  =leitorDescontos.nextDouble();
        
        System.out.println("Informe sua condução para ida ao trabalho" );
        Double conducaoIda  =leitorDescontos.nextDouble();
        
        Double inss = salario * 0.1;
        Double ir = salario * 0.2;
        Double vt = conducaoIda * 2 * 22;
        Double salarioBruto = salario;
        Double descontosTotais = inss - ir - vt;
        Double salarioComDesconto = salario - descontosTotais;
        
        
        System.out.println(String.format("Seu salário bruto é R$ %.2f, tem um total de R$ %.2f em descontos e receberá um líquido de R$%.2f"
                ,salarioBruto, descontosTotais, salarioComDesconto));
        
        
    }
    
}
