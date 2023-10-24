package model;

import java.util.Random;

public class Jogador {

    private Coisa escolha;

    // Construtores
    public Jogador() {
        this.escolha = getEscolhaRandom();
    }

    public Jogador(int resultado) {

        if (resultado == 0)
            this.escolha = new Pedra();
        else if (resultado == 1)
            this.escolha = new Papel();
        else if (resultado == 2)
            this.escolha = new Tesoura();
    }

    // Getters e Setters

    public Coisa getEscolha() {
        return escolha;
    }

    public void setEscolha(Coisa escolha) {
        this.escolha = escolha;
    }

    // Escolher Random
    private Coisa getEscolhaRandom() {

        Random jogadaAleatoria = new Random();
        int x = jogadaAleatoria.nextInt(3);

        if (x == 0)
            return new Pedra();
        else if (x == 1)
            return new Papel();
        else
            return new Tesoura();
    }

}