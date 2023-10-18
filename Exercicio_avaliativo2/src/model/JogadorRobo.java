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

}
