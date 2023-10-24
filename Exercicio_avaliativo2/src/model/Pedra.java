package model;

public class Pedra extends Coisa {

    public Pedra() {
        super("Pedra");
    }

    @Override
    public int getResultadoBatalha(Coisa outroJogador) {
        int resultado;

        if (outroJogador instanceof Tesoura)
            resultado = 1; // ganhou
        else if (outroJogador instanceof Papel)
            resultado = -1; // perdeu
        else
            resultado = 0; // empate

        this.resultado = resultado;
        return getResultado();
    }
}
