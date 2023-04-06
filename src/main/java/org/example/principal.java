package org.example;

import org.example.model.Tabuleiro;
import org.example.model.TabuleiroConsole;

public class principal {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);


    }

}
