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

        if (x == 0) return new Pedra();
        else if (x == 1) return new Papel();
        else return new Tesoura();
    }

    @Override
    public Coisa getEscolhaCoisa(int resultado) {

        if (resultado == 0) return new Pedra();
        else if (resultado == 1) return new Papel();
        else if (resultado == 2) return new Tesoura();
        else return getEscolhaCoisa();
    }
}