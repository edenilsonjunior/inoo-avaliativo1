package view;

import javax.swing.JOptionPane;
import model.*;

public class Main {

    public static void main(String[] args) {

        int opcao;

        do {
            opcao = menu();

            switch (opcao) {
                case 1:

                    jogadorXjogador();
                    break;

                case 2:
                    jogadorXmaquina();
                    break;

                case 3:
                    maquinaXmaquina();
                    break;

                case 0:
                    String titulo = "Fim do programa";
                    String mensagem = "Obrigado por jogar!";

                    JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    break;
            }

        } while (opcao != 0);

    }

    public static int menu() {

        String answer;
        String msg = "Escolha sua opção: ";
        String title = "Menu";

        Object opcoes[] = { "Jogador x Jogador",
                "Jogador x Máquina",
                "Máquina x Máquina",
                "Sair" };

        answer = (String) JOptionPane.showInputDialog(null,
                msg,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (answer.equals("Jogador x Jogador"))
            return 1;
        else if (answer.equals("Jogador x Máquina"))
            return 2;
        else if (answer.equals("Máquina x Máquina"))
            return 3;
        else
            return 0;

    }

    public static void jogadorXjogador() {

        String answer = escolhe_qnt_jogada();

        if (answer.equals("Melhor de 3")) {
            int vitorias_p1 = 0, vitorias_p2 = 0;

            for (int i = 0; i < 3; i++) {

                Jogador p1 = new Jogador(escolhe_jogada(1));
                Jogador p2 = new Jogador(escolhe_jogada(2));

                int aux = imprime_resultado(p1, p2);

                if (aux == 1)
                    vitorias_p1++;
                else if (aux == -1)
                    vitorias_p2++;
            }

            String titulo = "Resultado MD3";
            String mensagem = mostrar_campeao(vitorias_p1, vitorias_p2);

            JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
        } else {
            Jogador p1 = new Jogador(escolhe_jogada(1));
            Jogador p2 = new Jogador(escolhe_jogada(2));

            imprime_resultado(p1, p2);
        }
    }

    public static void jogadorXmaquina() {

        String answer = escolhe_qnt_jogada();

        if (answer.equals("Melhor de 3")) {
            int vitorias_p1 = 0, vitorias_p2 = 0;

            for (int i = 0; i < 3; i++) {

                Jogador p1 = new Jogador(escolhe_jogada(1));
                Jogador p2 = new Jogador();

                int aux = imprime_resultado(p1, p2);

                if (aux == 1)
                    vitorias_p1++;
                else if (aux == -1)
                    vitorias_p2++;
            }

            String titulo = "Resultado MD3";
            String mensagem = mostrar_campeao(vitorias_p1, vitorias_p2);

            JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
        } else {
            Jogador p1 = new Jogador(escolhe_jogada(1));
            Jogador p2 = new Jogador();

            imprime_resultado(p1, p2);
        }

    }

    public static void maquinaXmaquina() {

        String answer = escolhe_qnt_jogada();

        if (answer.equals("Melhor de 3")) {
            int vitorias_p1 = 0, vitorias_p2 = 0;

            for (int i = 0; i < 3; i++) {

                Jogador p1 = new Jogador();
                Jogador p2 = new Jogador();

                int aux = imprime_resultado(p1, p2);

                if (aux == 1)
                    vitorias_p1++;
                else if (aux == -1)
                    vitorias_p2++;
            }

            String titulo = "Resultado MD3";
            String mensagem = mostrar_campeao(vitorias_p1, vitorias_p2);

            JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
        } else {
            Jogador p1 = new Jogador();
            Jogador p2 = new Jogador();

            imprime_resultado(p1, p2);
        }
    }

    public static int escolhe_jogada(int jogador) {

        String answer;
        String msg = "Jogador " + jogador + ":";
        String title = "Escolha sua jogada:";

        Object opcoes[] = { "Pedra", "Papel", "Tesoura" };

        answer = (String) JOptionPane.showInputDialog(null,
                msg,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (answer.equals("Pedra"))
            return 0;
        else if (answer.equals("Papel"))
            return 1;
        else
            return 2;
    }

    public static int imprime_resultado(Jogador n1, Jogador n2) {

        Coisa escolha1 = n1.getEscolha();
        Coisa escolha2 = n2.getEscolha();

        int r1 = escolha1.getResultadoBatalha(escolha2);
        int r2 = escolha2.getResultadoBatalha(escolha1);

        String titulo = "Resultado";
        String vencedor;

        vencedor = "Jogador 1: " + n1.getEscolha().getNome() + "\n";
        vencedor += "Jogador 2: " + n2.getEscolha().getNome() + "\n";
        vencedor += mostrar_campeao(r1, r2);

        JOptionPane.showMessageDialog(null, vencedor, titulo, JOptionPane.WARNING_MESSAGE);

        return r1;
    }

    public static String mostrar_campeao(int p1, int p2) {
        if (p1 > p2)
            return "Jogador 1 venceu!";
        else if (p1 < p2)
            return "Jogador 2 venceu!";
        else
            return "Empate!";
    }

    public static String escolhe_qnt_jogada() {
        String answer;
        String msg = "Melhor de 3 ou melhor de 1?";
        String title = "Quantidade de jogos";

        Object opcoes[] = { "Melhor de 1", "Melhor de 3" };

        answer = (String) JOptionPane.showInputDialog(null,
                msg,
                title,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        return answer;
    }

}