package com.umg.usodeobjetoscongraficos;

import java.awt.Color;
import java.awt.Graphics;

public class MiOvalo extends MiFiguraDelimitada {
  public static int counter;
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private boolean isFill;
  private Color color;

  public MiOvalo() {
    this.x1 = 0;
    this.x2 = 0;
    this.y1 = 0;
    this.y2 = 0;
    this.isFill = false;
    this.color = Color.BLACK;
  }

  public MiOvalo(int x1, int y1, int x2, int y2, Color color, boolean isFill) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.color = color;
    this.isFill = isFill;
  }

  public void dibujar(Graphics g) {
    g.setColor(color);
    if (isFill) {
      g.fillOval(obtenerXSupIzq(), obtenerYSupIzq(), obtenerAnchura(), obtenerAltura());
    } else {
      g.drawOval(obtenerXSupIzq(), obtenerYSupIzq(), obtenerAnchura(), obtenerAltura());
    }
    counter += 1;
  }

  @Override
  public int getX1() {
    return x1;
  }

  @Override
  public int getY1() {
    return y1;
  }

  @Override
  public int getX2() {
    return x2;
  }

  @Override
  public int getY2() {
    return y2;
  }

  public boolean isFill() {
    return isFill;
  }

  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public void setX1(int x1) {
    this.x1 = x1;
  }

  @Override
  public void setY1(int y1) {
    this.y1 = y1;
  }

  @Override
  public void setX2(int x2) {
    this.x2 = x2;
  }

  @Override
  public void setY2(int y2) {
    this.y2 = y2;
  }

  public void setFill(boolean isFill) {
    this.isFill = isFill;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public boolean getIsFill() {
    return this.isFill;
  }

  public int obtenerXSupIzq() {
    return Math.min(x1, x2);
  }

  public int obtenerYSupIzq() {
    return Math.min(y1, y2);
  }

  public int obtenerAnchura() {
    return Math.abs(x1 - x2);
  }

  public int obtenerAltura() {
    return Math.abs(y1 - y2);
  }
}
