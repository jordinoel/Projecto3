package ico.fes.herencia;

import java.awt.Color;

public class Perro extends Animal {

    private String Raza;
    private float Tamanio;
    private int Edad;
    private String Nombre;

    public Perro() {
    }

    public Perro(String Raza, float Tamanio, int Edad, String Nombre) {
        this.Raza = Raza;
        this.Tamanio = Tamanio;
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public Perro(String Raza, float Tamanio, int Edad, String Nombre, int getNumeroPatas, String sonido, Color ColorDeOjos, float Peso, boolean Pelaje) {
        super(getNumeroPatas, sonido, ColorDeOjos, Peso, Pelaje);
        this.Raza = Raza;
        this.Tamanio = Tamanio;
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public float getTamanio() {
        return Tamanio;
    }

    public void setTamanio(float Tamanio) {
        this.Tamanio = Tamanio;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "Raza=" + Raza + ", Tamanio=" + Tamanio + ", Edad=" + Edad + ", Nombre=" + Nombre + '}';
    }

}
