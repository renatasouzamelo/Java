package br.com.sptech.projeto02;

import java.util.Scanner;

public class NovaCondicao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();

        System.out.println(numeroDigitado);

        switch (numeroDigitado) {
            case 1:
                System.out.println("Domingou...");
                break;
            case 2:
                System.out.println("Segunda...");
                break;
            case 3:
                System.out.println("Terça...");
                break;
            case 4:
                System.out.println("Meiou...");
                break;
            case 5:
                System.out.println("Quinta...");
                break;
            case 6:
                System.out.println("Sextou...");
                break;
            case 7:
                System.out.println("Sabadaço com Gilberto Barros...");
                break;
            default:
                System.out.println("Numero inválido");
                break;
        }

        System.out.println("Digite o ranking:");
        Integer rankingObtido = leitor.nextInt();

        switch (rankingObtido) {
            case 1:
                System.out.println("Ganhou um iphone 13");
            case 2:
                System.out.println("Ganhou um ipad mini");
            case 3:
                System.out.println("Ganhou um viagem pra Floripa");
                break;
        }
    }
}
