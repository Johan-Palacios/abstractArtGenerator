package com.umg.usodeobjetoscongraficos;

import javax.swing.JFrame;

public class Usodeobjetoscongraficos {

  public static void main(String[] args) {
    PanelDibujo panel = new PanelDibujo();
    JFrame aplicacion = new JFrame();
    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.add(panel);
    aplicacion.setSize(1000, 1000);
    aplicacion.setVisible(true);
  }
}
