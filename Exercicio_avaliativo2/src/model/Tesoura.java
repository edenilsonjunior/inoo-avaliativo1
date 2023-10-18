package model;

public class Tesoura extends Coisa{
    
    public Tesoura(){
        super("Tesoura");
    }

    @Override
    public int getResultadoBatalha(Coisa outroJogador) {
        int resultado;

        if (outroJogador instanceof Papel) 
            resultado = 1; // ganhou
        else if (outroJogador instanceof Pedra) 
            resultado = -1; // perdeu
        else
            resultado = 0; // empate

        this.resultado = resultado;
        return getResultado();
    }
}