/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosogomez.carrillo;

import java.util.concurrent.Semaphore;

/**
 *
 * @author AJCV0
 */
public class Simulacion {
    public static volatile int contador = 3;
    
    public static void main(String[] args) {
        Semaphore semCont = new Semaphore(1);
        Jefe j = new Jefe(24, semCont);
        Gerente g = new Gerente(24, 3, semCont);
        
        
        j.start();
        g.start();
    }
}
