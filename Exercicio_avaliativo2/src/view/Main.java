package view;

import java.util.Scanner;
import model.*;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            menu();

            opcao = input.nextInt();

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

    public static void menu() {
        System.out.printf("\n\n-----PEDRA, PAPEL E TESOURA!-----\n");
        System.out.printf("1- Jogador x Jogador\n");
        System.out.printf("2- Jogador x Máquina\n");
        System.out.printf("3- Máquina x Máquina\n");
        System.out.printf("0- Sair\n");
        System.out.printf("Digite sua opção: ");
    }

    public static void jogadorXjogador() {

        int numero;
        System.out.printf("\nMelhor de 1 (digite 0) ou Melhor de 3 (digite 1): ");
        numero = input.nextInt();

        int vitorias_n1 = 0, vitorias_n2 = 0;
        int total = 0;
        if (numero == 1) {
            
            while (total != 3) {
                
                System.out.printf("\n-----RODADA: %d-----\n", total+1);

                System.out.println("Jogador 1:");
                Jogador m1 = new JogadorHumano();
        
                System.out.println("Jogador 2:");
                Jogador m2 = new JogadorHumano();
        
                int aux = imprimeMelhorDeTres(m1, m2);
                
                if (aux == 1)
                    vitorias_n1++;
                else if (aux == -1)
                    vitorias_n2++;

                total++;
            }

            System.out.printf("\n-----RESULTADO da melhor de 3!-----\n");

            if (vitorias_n1 > vitorias_n2)
                System.out.println("Jogador 1 venceu!");
            else if(vitorias_n1 < vitorias_n2)
                System.out.println("Jogador 2 venceu!");
            else
            System.out.println("Empate!");

            System.out.printf("-------------------\n");
        }
        else if(numero == 0) {
            System.out.println("\nJogador 1:");
            Jogador m1 = new JogadorHumano();
    
            System.out.println("Jogador 2:");
            Jogador m2 = new JogadorHumano();
    
            imprimeResultado(m1, m2);
        }
    }

    public static void jogadorXmaquina() {

        int numero;
        System.out.printf("\nMelhor de 1 (digite 0) ou Melhor de 3 (digite 1): ");
        numero = input.nextInt();

        int vitorias_n1 = 0, vitorias_n2 = 0;
        int total = 0;
        if (numero == 1) {
            
            while (total != 3) {
                
                System.out.printf("\n-----RODADA: %d-----\n", total+1);

                System.out.println("Jogador 1:");
                Jogador m1 = new JogadorHumano();

                Jogador m2 = new JogadorRobo();
        
                int aux = imprimeMelhorDeTres(m1, m2);
                
                if (aux == 1)
                    vitorias_n1++;
                else if (aux == -1)
                    vitorias_n2++;

                total++;
            }

            System.out.printf("\n-----RESULTADO da melhor de 3!-----\n");

            if (vitorias_n1 > vitorias_n2)
                System.out.println("Jogador 1 venceu!");
            else if(vitorias_n1 < vitorias_n2)
                System.out.println("Jogador 2 venceu!");
            else
            System.out.println("Empate!");

            System.out.printf("-------------------\n");
        }
        else if(numero == 0) {
            System.out.println("\nJogador 1:");
            Jogador m1 = new JogadorHumano();
    
            System.out.println("Jogador 2:");
            Jogador m2 = new JogadorRobo();
    
            imprimeResultado(m1, m2);
        }

    }

    public static void maquinaXmaquina() {

        int resultado;

        System.out.printf("Voce gostaria de interferir no resultado final dos robôs? 1-S/2-N: ");
        resultado = input.nextInt();

        if (resultado == 1) {
            int r1, r2;

            System.out.printf("\n0- Pedra, 1- Papel, 2- Tesoura:");
            System.out.printf("\nDigite a resposta do primeiro robô: ");
            r1 = input.nextInt();
 
            System.out.printf("\nDigite a resposta do segundo robô: ");
            r2 = input.nextInt();

            Jogador m1 = new JogadorRobo(r1);
            Jogador m2 = new JogadorRobo(r2);

            imprimeResultado(m1, m2);

        } else {
            Jogador m1 = new JogadorRobo();
            Jogador m2 = new JogadorRobo();

            imprimeResultado(m1, m2);
        }

    }

    public static void imprimeResultado(Jogador n1, Jogador n2) {

        Coisa escolhaPlayer1 = n1.getEscolha();
        Coisa escolhaPlayer2 = n2.getEscolha();

        int resultado = escolhaPlayer1.getResultadoBatalha(escolhaPlayer2);

        System.out.printf("\n-----RESULTADO-----\n");
        System.out.println("Jogador 1: " + escolhaPlayer1.getNome());
        System.out.println("Jogador 2: " + escolhaPlayer2.getNome());

        if (resultado > 0) {
            System.out.println("Jogador 1 venceu!");
        } else if (resultado < 0) {
            System.out.println("Jogador 2 venceu!");
        } else {
            System.out.println("Empate!");
        }
        System.out.printf("-------------------\n");
    }



    public static int imprimeMelhorDeTres(Jogador n1, Jogador n2){
        
        Coisa escolhaPlayer1 = n1.getEscolha();
        Coisa escolhaPlayer2 = n2.getEscolha();

        int resultado = escolhaPlayer1.getResultadoBatalha(escolhaPlayer2);

        System.out.printf("----->RESULTADO: ");

        if (resultado > 0) {
            System.out.printf("Jogador 1 venceu a rodada!\n");
        } else if (resultado < 0) {
            System.out.printf("Jogador 2 venceu a rodada!\n");
        } else {
            System.out.printf("Empate!\n");
        }
        return resultado;
    }        
}

