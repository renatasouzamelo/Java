package controle;

import java.util.Scanner;

public class SwitComBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Informe a nota:");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
                conceito = "A";

                break;

            case 9:
                conceito = "B";

                break;

            case 8:
                conceito = "C";

                break;

            case 7:
                conceito = "D";

                break;
        }

        System.out.println(" O conceito é " + conceito);

    }

}
