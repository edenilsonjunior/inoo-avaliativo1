# Jogo Pedra, Papel e Tesoura em Java

## Criador
Este jogo foi criado por [Edenilson Júnior](https://github.com/edenilsonjunior).

## Conceitos Abordados
Neste jogo, diversos conceitos de programação orientada a objetos são abordados, incluindo:

- Orientação a objeto
- Encapsulamento
- Getters e Setters
- Herança
- Polimorfismo
- Sobrecarga

## Como Funciona

### Classe Coisa
`Coisa` é uma classe abstrata que possui dois atributos: `nome` (uma string) e `resultado` (um inteiro). O resultado é obtido através do método abstrato `public abstract int getResultadoBatalha(Coisa outroJogador);`.

### Classes Pedra, Papel e Tesoura
`Pedra`, `Papel` e `Tesoura` são classes filhas da classe abstrata `Coisa`. Elas implementam o método abstrato `getResultadoBatalha` e retornam 1 para ganhou, -1 para perdeu e 0 para empate, armazenando o resultado em `this.resultado`.

### Classe Jogador
`Jogador` é uma classe abstrata que possui apenas um atributo protegido, `Coisa escolhaJogador`. Além disso, ela possui um método abstrato, `public abstract Coisa getEscolhaCoisa();`.

### Classes JogadorHumano e JogadorRobo
`JogadorHumano` e `JogadorRobo` são classes filhas da classe `Jogador`. A diferença entre elas está no método `getEscolhaCoisa()`. Em `JogadorHumano`, a escolha é perguntada ao usuário, enquanto em `JogadorRobo`, a escolha é feita aleatoriamente. Ambas as classes possuem sobrecarga de construtor para permitir que o usuário escolha sua jogada como argumento.

### Classe Main
A classe `Main` contém um loop `do-while` que apresenta um menu de interação ao jogador. O menu inclui as seguintes opções:

1. Jogador contra Jogador
2. Jogador contra Robô
3. Robô contra Robô
0. Sair

O jogador pode escolher uma das opções digitando o número correspondente, e o jogo seguirá de acordo com a escolha.

## Como jogar

1. Clone ou faça o download deste repositório para a sua máquina.

2. Abra o projeto em uma IDE Java de sua escolha.

3. Execute o programa.

5. O programa determinará o vencedor com base nas escolhas dos jogadores e exibirá o resultado.
