package model;

import java.util.Scanner;

public class JogadorHumano extends Jogador {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Coisa getEscolhaCoisa() {

        System.out.println("Escolha sua jogada:\n1- Pedra\n2- Papel\n3- Tesoura\n");

        int escolha = scanner.nextInt();

        if (escolha == 1)
            return new Pedra();
        else if (escolha == 2)
            return new Papel();
        else if (escolha == 3)
            return new Tesoura();
        return null;

    }

}
