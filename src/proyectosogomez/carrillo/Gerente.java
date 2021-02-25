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
public class Gerente extends Thread{
    //Tiempo que dura un día en la simulación (medido en segundos)
    int dia;
    //Número de días inicial para cada despliegue (necesario para reiniciar el contador de días)
    int cantDias;
    //Estado del gerente
    String estado;
    //Semáforo para verificar que nadie está accediendo al contador
    Semaphore mutexCont;
    //Semáforo para verificar que nadie esté accediendo al almacén de consolas
    Semaphore mutexAlmacen;
    //Almacén donde están todos los almacenes
    Almacen almacen;
    //Interfaz
    Window window;
    public Gerente(int dia, int cantDias, Semaphore mutexCont, Semaphore mutexAlmacen, Almacen almacen, Window window) {
        this.dia = dia;
        this.cantDias = cantDias;
        this.estado = "Desocupado";
        this.mutexCont = mutexCont;
        this.mutexAlmacen = mutexAlmacen;
        this.almacen = almacen;
        this.window = window;
    }
    
    @Override
    public void run() {
        //Valor de una hora dentro de la simulación (medido en segundos)
        double x = this.dia/24;
        
        while (true) {
            try {
                //Verificar que el jefe no ha accedido al contador
                mutexCont.acquire();
                
                this.estado = "Revisando contador...";
                window.setGerente(this.estado);
                // System.out.println("Gerente: " + this.estado);
                if (Simulacion.contador == 0) {
                    this.estado = "Desplegando New 15SD XL...";
                    window.setGerente(this.estado);
                    //System.out.println("Gerente: " + this.estado);
                    
                    //Verificar que los ensambladores no estén en el almacén
                    mutexAlmacen.acquire();
                    
                    almacen.consolas = 0;
                    window.setConsolas(Integer.toString(this.almacen.consolas));
                    mutexAlmacen.release();
                    
                    //Reinicializar contador de días
                    Simulacion.contador = this.cantDias;
                    window.setDays(Integer.toString(this.cantDias));
                }
                
                //System.out.println("Días restantes: " + Simulacion.contador);
                
                mutexCont.release();
                
                this.estado = "Desocupado";
                window.setGerente(this.estado);
               
                Thread.sleep((int)(x*2*1000)); //2 horas
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Gerente.java: " + ex);
            }
        }
    }
}
