/*
* Estrategia:
* 
* Fazer do-while enquando a opcao nao foi 0
* 
* opcoes:
* 1- jogador contra jogador
* 2- jogador contra robo
* 3- robo contra robo
* 0- sair
* 
* Opcao de confronto unitario ou melhor de 3
* 
* Conceitos abordados:
* 
* Orientado a objeto: ok
* encapsulamento: ok
* getters e setters: ok
* herança: ok
* polimorfismo: ok
* sobrecarga: ok
* 
*/

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
        System.out.printf("Digite sua opção:\n");
        System.out.printf("1- Jogador x Jogador\n");
        System.out.printf("2- Jogador x Máquina\n");
        System.out.printf("3- Máquina x Máquina\n");
        System.out.printf("0- Sair\n");
    }

    public static void jogadorXjogador(){
        Jogador m1 = new JogadorHumano();
        Jogador m2 = new JogadorHumano();   

        imprimeResultado(m1, m2);
    }

    public static void jogadorXmaquina(){
        Jogador m1 = new JogadorHumano();
        Jogador m2 = new JogadorRobo();   

        imprimeResultado(m1, m2);
    }

    public static void maquinaXmaquina(){

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

        }
        else{
            Jogador m1 = new JogadorRobo();
            Jogador m2 = new JogadorRobo();   

            imprimeResultado(m1, m2);
        }

    }

    public static void imprimeResultado(Jogador n1, Jogador n2){

        Coisa escolhaPlayer1 = n1.getEscolha();
        Coisa escolhaPlayer2 = n2.getEscolha();

        int resultado = escolhaPlayer1.getResultadoBatalha(escolhaPlayer2);

        System.out.printf("\n");
        System.out.println("Jogador 1: " + escolhaPlayer1.getNome());
        System.out.println("Jogador 2: " + escolhaPlayer2.getNome());

        if (resultado > 0) {
            System.out.println("Jogador 1 venceu!");
        } else if (resultado < 0) {
            System.out.println("Jogador 2 venceu!");
        } else {
            System.out.println("Empate!");
        }
    }
}