package model;

public abstract class Jogador {

    // contexto: a classe Jogador tem 3 sobrecargas do construtor
    // caso o usuario nao informe o tipo da "coisa" nos parametros,
    // ele pergunta ao usuario, se nao ele nao pergunta e ja cria
    // com base na String resultado

    protected Coisa escolhaJogador;

    public Jogador() {
        this.escolhaJogador = getEscolhaCoisa();
    }

    public Jogador(int resultado) {
        this.escolhaJogador = getEscolhaCoisa(resultado);
    }

    public Coisa getEscolha() {
        return escolhaJogador;
    }

    public abstract Coisa getEscolhaCoisa();

    public abstract Coisa getEscolhaCoisa(int resultado);
}