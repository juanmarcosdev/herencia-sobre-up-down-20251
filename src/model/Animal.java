package model;

public class Animal {
    private String nombre;
    private int edad;

    public Animal() { }
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public void makeSound() {
        System.out.println("El animal hace un sonido generico");
    }

    public String getInfo() {
        return "Animal: " + nombre + ", edad: " + edad;
    }
    public String getInfo(boolean detailed) {
        String base = getInfo();
        if (detailed) {
            base += " (detalles: clase = " + this.getClass().getSimpleName() + ")";
        }
        return base;
    }
}