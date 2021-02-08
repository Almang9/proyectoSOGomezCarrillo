/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosogomez.carrillo;

/**
 *
 * @author Alman
 */
public class ProyectoSOGomezCarrillo {
    public static volatile int  counter;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Productor a = new Productor("manuel","gomez", "prodcutor a");
        Productor b = new Productor("Stefi","Perez", "prodcutor b");
        a.start();
        b.start();
        
    }
    
}
