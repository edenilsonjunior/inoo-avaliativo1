package model;

public class Papel extends Coisa {

    public Papel() {
        super("Papel");
    }

    @Override
    public int getResultadoBatalha(Coisa outroJogador) {
        int resultado;

        if (outroJogador instanceof Pedra)
            resultado = 1; // ganhou
        else if (outroJogador instanceof Tesoura)
            resultado = -1; // perdeu
        else
            resultado = 0; // empate

        this.resultado = resultado;
        return getResultado();
    }
}
