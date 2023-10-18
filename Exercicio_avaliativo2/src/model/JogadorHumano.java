package model;

import java.util.Scanner;

public class JogadorHumano extends Jogador {

    // scanner do tipo static
    private static Scanner scanner = new Scanner(System.in);

    public JogadorHumano() {
        super();
    }

    public JogadorHumano(int resultado) {
        super(resultado);
    }

    @Override
    public Coisa getEscolhaCoisa() {

        int escolha;

        do {
            System.out.println("0-Pedra | 1-Papel | 2-Tesoura");
            System.out.printf("Escolha sua jogada: ");
            escolha = scanner.nextInt();
            System.out.printf("\n");

            if (escolha == 0)
                return new Pedra();
            else if (escolha == 1)
                return new Papel();
            else if (escolha == 2)
                return new Tesoura();
            return null;

        } while ((escolha != 0) || (escolha != 1) || (escolha != 2));

    }

    @Override
    public Coisa getEscolhaCoisa(int resultado) {

        if (resultado == 0)
            return new Pedra();
        else if (resultado == 1)
            return new Papel();
        else if (resultado == 2)
            return new Tesoura();
        else
            // ele retorna a primeira sobrecarga que irá perguntar dnv a jogada,
            // caso a string esteja errada
            return getEscolhaCoisa();
    }
}
