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

        int numero, vitorias_n1 = 0, vitorias_n2 = 0;
        Jogador m1, m2;
        String resultado;

        System.out.printf("\nMelhor de 1 (digite 0) ou Melhor de 3 (digite 1): ");
        numero = input.nextInt();

        if (numero == 1) {

            for (int i = 0; i < 3; i++) {

                System.out.printf("\n-----RODADA: %d-----\n", i + 1);

                System.out.println("Jogador 1:");
                m1 = new JogadorHumano();

                System.out.println("Jogador 2:");
                m2 = new JogadorHumano();

                int aux = imprimeMelhorDeTres(m1, m2);

                if (aux == 1) vitorias_n1++;
                else if (aux == -1) vitorias_n2++;
            }
            resultado = mostraCampeao(vitorias_n1, vitorias_n2);

            System.out.printf("\n-----RESULTADO MD3!-----\n\n");
            System.out.println(resultado);
        } 
        else if (numero == 0) {

            System.out.println("\nJogador 1:");
            m1 = new JogadorHumano();

            System.out.println("Jogador 2:");
            m2 = new JogadorHumano();

            imprimeResultado(m1, m2);
        }
        System.out.printf("-------------------\n");
    }

    public static void jogadorXmaquina() {

        int numero, vitorias_n1 = 0, vitorias_n2 = 0;
        Jogador m1, m2;
        String resultado;

        System.out.printf("\nMelhor de 1 (digite 0) ou Melhor de 3 (digite 1): ");
        numero = input.nextInt();

        if (numero == 1) {

            for (int i = 0; i < 3; i++) {

                System.out.printf("\n-----RODADA: %d-----\n", i + 1);

                System.out.println("Jogador 1:");
                m1 = new JogadorHumano();
                m2 = new JogadorRobo();
                
                System.out.println("Jogador Robô: " + m2.getEscolha().getNome());
                
                int aux = imprimeMelhorDeTres(m1, m2);

                if (aux == 1) vitorias_n1++;
                else if (aux == -1) vitorias_n2++;
            }
            resultado = mostraCampeao(vitorias_n1, vitorias_n2);

            System.out.printf("\n-----RESULTADO da melhor de 3!-----\n");
            System.out.println(resultado);
        } 
        else if (numero == 0) {

            System.out.println("\nJogador 1:");
            m1 = new JogadorHumano();
            m2 = new JogadorRobo();

            System.out.println("Jogador Robô: " + m2.getEscolha().getNome());

            imprimeResultado(m1, m2);
        }
        System.out.printf("-------------------\n");
    }

    public static void maquinaXmaquina() {

        int resultado;

        System.out.printf("Voce gostaria de interferir no resultado final dos robôs? 1-S/2-N: ");
        resultado = input.nextInt();

        if (resultado == 1) {
            int r1, r2;

            System.out.println("0-Pedra | 1-Papel | 2-Tesoura");
            System.out.printf("Digite a resposta do primeiro robô: ");
            r1 = input.nextInt();

            System.out.printf("\nDigite a resposta do segundo robô: ");
            r2 = input.nextInt();

            Jogador m1 = new JogadorRobo(r1);
            Jogador m2 = new JogadorRobo(r2);

            imprimeResultado(m1, m2);

        } else {
            Jogador m1 = new JogadorRobo();
            Jogador m2 = new JogadorRobo();

            System.out.printf("\n");
            imprimeResultado(m1, m2);
            System.out.println("-------------------\n");
        }

    }

    public static void imprimeResultado(Jogador n1, Jogador n2) {

        Coisa escolha1 = n1.getEscolha();
        Coisa escolha2 = n2.getEscolha();
        String vencedor;
        int resultado1, resultado2;

        resultado1 = escolha1.getResultadoBatalha(escolha2);
        resultado2 = escolha2.getResultadoBatalha(escolha1);

        System.out.println("-----RESULTADO-----");
        
        // mostra o nome de cada coisa, o getNome() retorna pedra, papel ou tesoura
        System.out.println("Jogador 1: " + escolha1.getNome()); 
        System.out.println("Jogador 2: " + escolha2.getNome());

        vencedor = mostraCampeao(resultado1, resultado2);
        
        System.out.printf(vencedor);
    }

    public static int imprimeMelhorDeTres(Jogador n1, Jogador n2) {

        Coisa escolha1 = n1.getEscolha();
        Coisa escolha2 = n2.getEscolha();

        int resultado1 = escolha1.getResultadoBatalha(escolha2);
        int resultado2 = escolha2.getResultadoBatalha(escolha1);

        String vencedor = mostraCampeao(resultado1, resultado2);

        System.out.printf("----->RESULTADO: ");
        System.out.printf(vencedor);

        // a diferenca dessa funcao para a melhor de 1 é que essa retorna um int
        // que serve para achar o vencedor na melhor de 3
        return resultado1;
    }

    public static String mostraCampeao(int p1, int p2){
        if (p1 > p2) return "Jogador 1 venceu!\n";
        else if (p1 < p2) return "Jogador 2 venceu!\n";
        else return "Empate!\n";
    }
}