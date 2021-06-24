package ico.fes.herencia;

import java.awt.Color;

public class Animal {

    private int NumPatas;
    private String sonido;
    private Color ColorDeOjos;
    private float Peso;
    private boolean Pelo;

    public Animal() {
    }

    public Animal(int getNumeroPatas, String sonido, Color ColorDeOjos, float Peso, boolean Pelo) {
        this.ColorDeOjos = ColorDeOjos;
        this.Peso = Peso;
        this.NumPatas = getNumeroPatas;
        this.sonido = sonido;
        this.ColorDeOjos = ColorDeOjos;
        this.Peso = Peso;
        this.Pelo = Pelo;
    }

    public int getNumPatas() {
        return NumPatas;
    }

    public void setNumeroPatas(int NumPatas) {
        this.NumPatas = NumPatas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public Color getColorDeOjos() {
        return ColorDeOjos;
    }

    public void setColorDeOjos(Color ColorDeOjos) {
        this.ColorDeOjos = ColorDeOjos;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public boolean isPelo() {
        return Pelo;
    }

    public void setPelo(boolean Pelo) {
        this.Pelo = Pelo;
    }

    @Override
    public String toString() {
        return "Animal{" + "NumPatas=" + NumPatas + ", sonido=" + sonido + ", ColorDeOjos=" + ColorDeOjos + ", Peso=" + Peso + ", Pelo=" + Pelo + '}';
    }

}
