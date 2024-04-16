package com.umg.usodeobjetoscongraficos;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
  private int randomFigurasNumber = getRandomFiguresNumber();

  private MiFigura choseFigure() {
    SecureRandom random = new SecureRandom();
    int option = random.nextInt(3);
    int width = getWidth() + 1;
    int height = getHeight() + 1;
    int x1 = random.nextInt(width);
    int x2 = random.nextInt(width);
    int y1 = random.nextInt(height);
    int y2 = random.nextInt(height);
    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    boolean isFill = random.nextBoolean();
    if (option == 0) {
      return new MiLinea(x1, x2, y1, y2, color);
    }
    if (option == 1) {
      return new MiOvalo(x1, x2, y1, y2, color, isFill);
    }
    return new MiRectangulo(x1, x2, y1, y2, color, isFill);
  }

  private int getRandomFiguresNumber() {
    String number = JOptionPane.showInputDialog("Introduce el número de figuras");
    return Integer.parseInt(number);
  }

  private void createDraws(Graphics g) {
    SecureRandom random = new SecureRandom();
    MiFigura[] figuras = new MiFigura[random.nextInt(randomFigurasNumber)];
    for (int i = 0; i < figuras.length; i++) {
      figuras[i] = choseFigure();
    }
    for (MiFigura figura : figuras) {
      figura.dibujar(g);
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    createDraws(g);
    g.setColor(Color.black);
    g.drawString(
        "Rectangulos: "
            + MiRectangulo.counter
            + " Ovalos: "
            + MiOvalo.counter
            + " Lineas: "
            + MiLinea.counter,
        10,
        getHeight() - 10);
  }
}
