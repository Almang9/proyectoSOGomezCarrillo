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
public class Jefe extends Thread{
    int dia;
    String estado;
    Semaphore mutexCont;

    public Jefe(int dia, Semaphore mutexCont) {
        this.dia = dia;
        this.estado = "Desocupado";
        this.mutexCont = mutexCont;
    }
    
    @Override
    public void run() {
        double x = this.dia/24;
        
        while (true) {
            try {
                System.out.println("Jefe: " + this.estado);
                Thread.sleep((int)((this.dia - (x*6)) * 1000));
                
                //Verificar que el gerente no ha accedido al contador.
                mutexCont.acquire();
                
                if (Simulacion.contador > 0) {
                    this.estado = "Modificando contador...";
                    System.out.println("Jefe: " + this.estado);
                    Thread.sleep((int)(x*6*1000));
                    Simulacion.contador--;
                }
                
                mutexCont.release();
                this.estado = "Desocupado";
                
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Jefe.java: " + ex);
            }
        }
    }
}
