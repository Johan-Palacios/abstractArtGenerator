package com.umg.usodeobjetoscongraficos;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MiFiguraDelimitada extends MiFigura {
  private int x1;
  private int y1;
  private int x2;
  private int y2;
  private Color color;
  private boolean isFill = true;

  public MiFiguraDelimitada() {
    this.x1 = 0;
    this.x2 = 0;
    this.y2 = 0;
    this.y1 = 0;
    this.color = Color.BLACK;
    this.isFill = true;
  }

  public MiFiguraDelimitada(int x1, int y1, int x2, int y2, Color color, boolean isFill) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.color = color;
    this.isFill = isFill;
  }


  @Override
  public abstract void dibujar(Graphics g);


  public abstract int obtenerXSupIzq();

  public abstract int obtenerYSupIzq();

  public abstract int obtenerAnchura();

  public abstract int obtenerAltura();

  public abstract boolean getIsFill();

  public abstract void setFill(boolean isFill);
}
