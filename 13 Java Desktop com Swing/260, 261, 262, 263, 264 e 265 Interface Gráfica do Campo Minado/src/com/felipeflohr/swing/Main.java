package com.felipeflohr.swing;

import com.felipeflohr.cm.modelo.Tabuleiro;

import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);

        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
