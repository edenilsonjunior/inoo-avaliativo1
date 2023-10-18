package model;

public abstract class Jogador {

    // atributo protected (apenas humano e robo irao acessar)
    protected Coisa escolhaJogador;

    public Coisa getEscolha() {
        return escolhaJogador;
    }

    // assinatura do metodo abstrato (Além de sobrecargas caso o jogador queira
    // manipular o resultado)
    public abstract Coisa getEscolhaCoisa();

    public abstract Coisa getEscolhaCoisa(String resultado);

    public abstract Coisa getEscolhaCoisa(int resultado);

}