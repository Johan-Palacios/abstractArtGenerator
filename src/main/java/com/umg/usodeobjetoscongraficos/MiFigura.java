package com.umg.usodeobjetoscongraficos;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MiFigura {
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private Color color;
  public MiFigura() {
    this.x1 = 0;
    this.x2 = 0;
    this.y2 = 0;
    this.y1 = 0;
    this.color = Color.BLACK;
  }
  public abstract void dibujar(Graphics g);
  public abstract int getX1();
  public abstract void setX1(int x1);
  public abstract int getY1();
  public abstract void setY1(int y1);
  public abstract int getX2();
  public abstract void setX2(int x2);
  public abstract int getY2();
  public abstract void setY2(int y2);
  public abstract Color getColor();
  public abstract void setColor(Color color);

  
}
