package model;

public abstract class Coisa {
    
    private String nome;
    protected int resultado;

    public Coisa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getResultado() {
        return resultado;
    }

    public abstract int getResultadoBatalha(Coisa outroJogador);
}
