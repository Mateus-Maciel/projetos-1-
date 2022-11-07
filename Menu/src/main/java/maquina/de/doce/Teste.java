/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquina.de.doce;

import view.Tela;

public class Teste {

    public static void main(String[] args) {
        boolean st = true;

        Produtos doceA = new Produtos("A", 6);
        Produtos doceB = new Produtos("B", 7);
        Produtos doceC = new Produtos("C", 8);

        Maquina m = new Maquina();
        m.setTipoA(doceA);
        m.setTipoB(doceB);
        m.setTipoC(doceC);
        Tela j = new Tela();

        j.setVisible(st);

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
