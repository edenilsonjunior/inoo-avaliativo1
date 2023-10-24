package view;

import java.util.Scanner;
import model.*;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            opcao = menu();

            switch (opcao) {
                case 1:
                    jogadorXjogador();
                    break;

                case 2:
                    jogadorXmaquina();
                    break;

                case 3:
                    maquinaXmaquina();
                    break;

                case 0:
                    System.out.println("Obrigado por jogar!");
                    break;
                default:
                    break;
            }

        } while (opcao != 0);

    }

    public static int menu() {

        System.out.printf("\n\n-----PEDRA, PAPEL E TESOURA!-----\n");
        System.out.printf("1- Jogador x Jogador\n");
        System.out.printf("2- Jogador x Máquina\n");
        System.out.printf("3- Máquina x Máquina\n");
        System.out.printf("0- Sair\n");
        System.out.printf("Digite sua opção: ");
        return input.nextInt();
    }

    public static void jogadorXjogador() {

        int numero, vitorias_p1 = 0, vitorias_p2 = 0;

        System.out.printf("\nMelhor de 1 (digite 0) ou Melhor de 3 (digite 1): ");
        numero = input.nextInt();

        if (numero == 1) {

            for (int i = 0; i < 3; i++) {

                Jogador p1 = new Jogador(escolhe_jogada(1));
                Jogador p2 = new Jogador(escolhe_jogada(2));

                int aux = imprime_resultado(p1, p2);

                if (aux == 1) vitorias_p1++;
                else if (aux == -1) vitorias_p2++;
            }

            System.out.printf("\n-----RESULTADO MD3!-----\n\n");
            System.out.println(mostrar_campeao(vitorias_p1, vitorias_p2));
        } 
        else if (numero == 0) {

            Jogador p1 = new Jogador(escolhe_jogada(1));
            Jogador p2 = new Jogador(escolhe_jogada(2));

            imprime_resultado(p1, p2);
        }
    }

    

    public static int imprime_resultado(Jogador n1, Jogador n2) {

        Coisa escolha1 = n1.getEscolha();
        Coisa escolha2 = n2.getEscolha();

        int resultado1 = escolha1.getResultadoBatalha(escolha2);
        int resultado2 = escolha2.getResultadoBatalha(escolha1);

        String vencedor = mostrar_campeao(resultado1, resultado2);

        System.out.printf("----->RESULTADO: ");
        System.out.printf(vencedor);

        return resultado1;
    }

    public static String mostrar_campeao(int p1, int p2){
        if (p1 > p2) return "Jogador 1 venceu!\n";
        else if (p1 < p2) return "Jogador 2 venceu!\n";
        else return "Empate!\n";
    }

    public static int escolhe_jogada(int jogador){
        System.out.println("Jogador " + jogador + ":");
        System.out.println("0-Pedra | 1-Papel | 2-Tesoura");

        System.out.printf("Escolha sua jogada: ");
        return input.nextInt();

    }












































    public static void jogadorXmaquina() {

    }

    public static void maquinaXmaquina() {

    }
}