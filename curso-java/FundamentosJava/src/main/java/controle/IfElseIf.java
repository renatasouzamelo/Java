package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota");
        Double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota ínvalida");

        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota >= 4.1) {
             System.out.println("Conceito C");
            
        }else if (nota >= 2) {
            System.out.println("Conceito D");
            
        }else if (nota >= 1) {
            System.out.println("Conceito E");
        }
    }

}
