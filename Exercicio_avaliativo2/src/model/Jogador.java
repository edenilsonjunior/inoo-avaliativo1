package model;

public abstract class Jogador {

    // atributo protected (apenas humano e robo irao acessar)
    protected Coisa escolhaJogador;

    // construtor que chama o metodo abstrato
    public Jogador() {
        this.escolhaJogador = getEscolhaCoisa();
    }

    public Coisa getEscolha() {
        return escolhaJogador;
    }

    // assinatura do metodo abstrato
    public abstract Coisa getEscolhaCoisa();
}