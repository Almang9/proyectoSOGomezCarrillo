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
    //Tiempo que dura un día en la simulación (medido en segundos)
    int dia;
    //Estado del jefe
    String estado;
    //Semáforo para verificar que nadie está accediendo al contador
    Semaphore mutexCont;
    //Interfaz
    Window window;
    public Jefe(int dia, Semaphore mutexCont, Window window) {
        this.dia = dia;
        this.estado = "Desocupado";
        this.mutexCont = mutexCont;
        this.window = window;
    }
    
    @Override
    public void run() {
        //Valor de una hora dentro de la simulación (medido en segundos)
        double x = this.dia/24;
        
        while (true) {
            try {
                //System.out.println("Jefe: " + this.estado);
                Thread.sleep((int)((this.dia - (x*6)) * 1000)); //24 horas - 6 horas
                
                //Verificar que el gerente no ha accedido al contador.
                mutexCont.acquire();
                
                if (Simulacion.contador > 0) {
                    this.estado = "Modificando contador...";
                    window.setJefe(estado);
                    //System.out.println("Jefe: " + this.estado);
                    Thread.sleep((int)(x*6*100)); //6 horas
                    Simulacion.contador--;
                    System.out.println("Días restantes: " + Simulacion.contador);
                    window.setDays(Integer.toString(Simulacion.contador));
                }
                
                mutexCont.release();
                this.estado = "Desocupado";
                window.setJefe(estado);
                
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Jefe.java: " + ex);
            }
        }
    }
}
