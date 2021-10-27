package com.felipeflohr.swing;

import com.felipeflohr.cm.modelo.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {
        setLayout(new GridLayout
                (tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));

        // Solução multithreading para resolver o problema do "X" somente apa-
        // recer após a mensagem ser fechada
        tabuleiro.registrarObservador(e -> {
            SwingUtilities.invokeLater(() -> {
                if (e.isGanhou()) {
                    JOptionPane.showMessageDialog(null, "Ganhou!");
                } else {
                    JOptionPane.showMessageDialog(null, "Perdeu!");
                }

                tabuleiro.reiniciar();
            });
        });
    }
}
