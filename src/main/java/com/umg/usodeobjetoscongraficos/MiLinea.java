package com.umg.usodeobjetoscongraficos;

import java.awt.Color;
import java.awt.Graphics;

public class MiLinea extends MiFigura {
  public static int counter;
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private Color color;

  public MiLinea() {}

  public MiLinea(int x1, int y1, int x2, int y2, Color color) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.color = color;
  }

  public void dibujar(Graphics g) {
    g.setColor(color);
    g.drawLine(x1, y1, x2, y2);
    counter += 1;
  }

  @Override
  public int getX1() {
    return x1;
  }

  @Override
  public void setX1(int x1) {
    this.x1 = x1;
  }

  @Override
  public int getY1() {
    return y1;
  }

  @Override
  public void setY1(int y1) {
    this.y1 = y1;
  }

  @Override
  public int getX2() {
    return x2;
  }

  @Override
  public void setX2(int x2) {
    this.x2 = x2;
  }

  @Override
  public int getY2() {
    return y2;
  }

  @Override
  public void setY2(int y2) {
    this.y2 = y2;
  }

  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public void setColor(Color color) {
    this.color = color;
  }
}
