package com.corenetworks.modelo;

public class  Rectangulo extends Figura{
  private int base;
  private  int altura;

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public Rectangulo(int x, int y) {
        super(x, y);
    }

    public Rectangulo(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
