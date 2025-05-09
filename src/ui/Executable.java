package ui;

import model.Animal;
import model.Controller;

public class Executable {

    private Controller cont = new Controller();

    public void run() {

        Animal miPerro = cont.crearPerro("Bobby", 4, "Beagle");
        cont.mostrarInfo(miPerro);                 
        cont.hacerLadrarSiEsPerro(miPerro);        
        cont.mostrarInfo(miPerro, true);           

        System.out.println("--- Demo ---");
        cont.demoPolimorfismo();                   
    }

    public static void main(String[] args) {
        new Executable().run();
    }
}