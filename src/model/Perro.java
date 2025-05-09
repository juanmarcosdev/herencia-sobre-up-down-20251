package model;

public class Perro extends Animal {
    private String raza;

    public Perro() {
        super();
    }
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    @Override
    public void makeSound() {
        System.out.println("¡Guau guau!");
    }

    public void makeSound(int veces) {
        for (int i = 0; i < veces; i++) {
            makeSound();
        }
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando en modo perro!");
    }
}