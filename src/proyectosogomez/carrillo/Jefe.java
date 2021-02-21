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
<<<<<<< HEAD
    int dia;
    String estado;
=======
    //Tiempo que dura un día en la simulación (medido en segundos)
    int dia;
    //Estado del jefe
    String estado;
    //Semáforo para verificar que nadie está accediendo al contador
>>>>>>> f037417f98354dc240d1065de230b37addd36e3b
    Semaphore mutexCont;

    public Jefe(int dia, Semaphore mutexCont) {
        this.dia = dia;
        this.estado = "Desocupado";
        this.mutexCont = mutexCont;
    }
    
    @Override
    public void run() {
<<<<<<< HEAD
=======
        //Valor de una hora dentro de la simulación (medido en segundos)
>>>>>>> f037417f98354dc240d1065de230b37addd36e3b
        double x = this.dia/24;
        
        while (true) {
            try {
<<<<<<< HEAD
                System.out.println("Jefe: " + this.estado);
                Thread.sleep((int)((this.dia - (x*6)) * 1000));
=======
                //System.out.println("Jefe: " + this.estado);
                Thread.sleep((int)((this.dia - (x*6)) * 1000)); //24 horas - 6 horas
>>>>>>> f037417f98354dc240d1065de230b37addd36e3b
                
                //Verificar que el gerente no ha accedido al contador.
                mutexCont.acquire();
                
                if (Simulacion.contador > 0) {
                    this.estado = "Modificando contador...";
<<<<<<< HEAD
                    System.out.println("Jefe: " + this.estado);
                    Thread.sleep((int)(x*6*1000));
                    Simulacion.contador--;
=======
                    //System.out.println("Jefe: " + this.estado);
                    Thread.sleep((int)(x*6*1000)); //6 horas
                    Simulacion.contador--;
                    System.out.println("Días restantes: " + Simulacion.contador);
>>>>>>> f037417f98354dc240d1065de230b37addd36e3b
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
