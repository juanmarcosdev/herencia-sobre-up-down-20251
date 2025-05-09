package model;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public Controller() { }


    public Animal crearPerro() {
        return new Perro("Firulais", 3, "Labrador");
    }

    public Animal crearPerro(String nombre, int edad, String raza) {
        return new Perro(nombre, edad, raza);
    }


    public void mostrarInfo(Animal a) {
        System.out.println(a.getInfo());
        a.makeSound();
    }

    public void mostrarInfo(Animal a, boolean detailed) {
        System.out.println(a.getInfo(detailed));
        a.makeSound();
    }


    public void hacerLadrarSiEsPerro(Animal a) {
        if (a instanceof Perro) {
            Perro p = (Perro) a; 
            p.ladrar();
        } else {
            System.out.println("Este animal no es un perro");
        }
    }

    // Lista heterogénea para demostrar polimorfismo en bucle
    public void demoPolimorfismo() {
        List<Animal> lista = new ArrayList<>();
        lista.add(new Animal("Generico", 5));
        lista.add(new Perro("Rex", 2, "Pastor Aleman"));
        for (Animal a : lista) {
            mostrarInfo(a);
        }
    }
}