// My love is my radio QuQ
package herencia;

import ico.fes.herencia.Perro;
import ico.fes.herencia.Gato;
import java.awt.Color;

public class Herencia {

    public static void main(String[] args) {

        Perro Perro1 = new Perro("Labrador", 62, 5, "Ken", 4, "Ladridos", Color.black, 20, true);
        System.out.println("Datos de su Perro:" + "\n\n" + "Raza: \t" + Perro1.getRaza() + "\n" + "Tamaño en cm: \t" + Perro1.getTamanio() + "cm" + "\n"
                + "Edad: \t" + Perro1.getEdad() + "años" + "\n" + "Nombre: \t" + Perro1.getNombre() + "\n" + "Número de patas: \t" + Perro1.getNumPatas() + "\n"
                + "Sonido: \t" + Perro1.getSonido() + "\n" + "Color de ojos: \t" + Perro1.getColorDeOjos() + "\n" + "Peso en kilos: \t" + Perro1.getPeso() + "Kg" + "\n"
                + "Pelaje: \t" + Perro1.isPelo() + "\n");
        Gato Gato1 = new Gato("Birmano", 25, 4, "Ren", 4, "Miados", Color.green, 4.6f, true);
        System.out.println("Datos de su Gato:" + "\n\n" + "Raza: \t" + Gato1.getRaza() + "\n" + "Tamaño en cm: \t" + Gato1.getTamanio() + "cm" + "\n"
                + "Edad: \t" + Gato1.getEdad() + "años" + "\n" + "Nombre: \t" + Gato1.getNombre() + "\n" + "Número de patas: \t" + Gato1.getNumPatas() + "\n"
                + "Sonido: \t" + Gato1.getSonido() + "\n" + "Color de ojos: \t" + Gato1.getColorDeOjos() + "\n" + "Peso en kilos: \t" + Gato1.getPeso() + "Kg" + "\n"
                + "Pelaje: \t" + Gato1.isPelo());

    }

}
