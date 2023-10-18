package model;

import java.util.Scanner;

public class JogadorHumano extends Jogador {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public Coisa getEscolhaCoisa() {

        int escolha;

        do {
            System.out.println("Escolha sua jogada:\n0- Pedra\n1- Papel\n2- Tesoura\n");

            escolha = scanner.nextInt();

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
    public Coisa getEscolhaCoisa(String resultado) {

        if (resultado.equals("Pedra"))
            return new Pedra();
        else if (resultado.equals("Papel"))
            return new Papel();
        else if (resultado.equals("Tesoura"))
            return new Tesoura();
        else
            // se o usuario digitar algo que nao é um dos 3 tipos de jogada,
            // ele retorna a primeira sobrecarga que irá perguntar dnv a jogada
            return getEscolhaCoisa();
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
            // se o usuario digitar algo que nao é um dos 3 tipos de jogada,
            // ele retorna a primeira sobrecarga que irá perguntar dnv a jogada
            return getEscolhaCoisa();
    }

}
