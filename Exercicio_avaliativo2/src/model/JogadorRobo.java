package model;

import java.util.Random;

// classe do robo 
public class JogadorRobo extends Jogador {

    private Random jogadaAleatoria = new Random();

    @Override
    public Coisa getEscolhaCoisa() {

        // escolhe um numero aleatorio de 0 a 2 e retorna um objeto, se der errado,
        // retorna null
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
    public Coisa getEscolhaCoisa(String resultado) {

        if (resultado.equals("Pedra"))
            return new Pedra();
        else if (resultado.equals("Papel"))
            return new Papel();
        else if (resultado.equals("Tesoura"))
            return new Tesoura();
        else
            // se o usuario digitar algo que nao é um dos 3 tipos de jogada,
            // ele retorna a primeira sobrecarga que irá fazer a jogada aleatória
            // pelo usuario
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
            // ele retorna a primeira sobrecarga que irá fazer a jogada aleatória
            // pelo usuario
            return getEscolhaCoisa();
    }
}