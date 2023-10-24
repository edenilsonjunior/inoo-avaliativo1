# Jogo Pedra, Papel e Tesoura em Java

## Criador
Este jogo foi criado por [Edenilson Júnior](https://github.com/edenilsonjunior).

## Imagem do jogo
![image](https://github.com/edenilsonjunior/inoo-avaliativos/assets/110670578/2b38bf8b-2e77-4ff5-92db-1a2ed0f3483c)

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
`Jogador` é uma classe que possui apenas um atributo privado, `Coisa escolha`. Além disso, essa classe possui sobrescrita de construtor, se o usuário escolher jogar com robôs, ele cria um construtor vazio `public Jogador()`, já se o usuário escolhe um jogador humano, ele cria um construtor `public Jogador(int resultado)`.

### Classe Main
A classe `Main` contém um loop `do-while` que apresenta um menu de interação ao jogador. O menu inclui as seguintes opções:

1. Jogador contra Jogador
2. Jogador contra Robô
3. Robô contra Robô
0. Sair

O jogador pode escolher uma das opções, e o jogo seguirá de acordo com a escolha, após isso, o programa pergunta se o usuário quer uma melhor de 1 ou melhor de 3.

## Como jogar

1. Clone ou faça o download deste repositório para a sua máquina.

2. Abra o projeto em uma IDE Java de sua escolha.

3. Execute o programa.

5. O programa determinará o vencedor com base nas escolhas dos jogadores e exibirá o resultado.
