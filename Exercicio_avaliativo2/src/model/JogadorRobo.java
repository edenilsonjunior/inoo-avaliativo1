package model;

import java.util.Random;

public class JogadorRobo extends Jogador {

    public JogadorRobo() {
        super();
    }

    public JogadorRobo(int resultado) {
        super(resultado);
    }

    @Override
    public Coisa getEscolhaCoisa() {

        Random jogadaAleatoria = new Random();
        int x = jogadaAleatoria.nextInt(3);

        if (x == 0)
            return new Pedra();
        else if (x == 1)
            return new Papel();
        else if (x == 2)
            return new Tesoura();

        return null;
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