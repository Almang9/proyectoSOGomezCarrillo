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
    int dia;
    int cantDias;
    String estado;
    Semaphore mutexCont;

    public Gerente(int dia, int cantDias, Semaphore mutexCont) {
        this.dia = dia;
        this.cantDias = cantDias;
        this.estado = "Desocupado";
        this.mutexCont = mutexCont;
    }
    
    public void run() {
        double x = this.dia/24;
        
        while (true) {
            try {
                //Verificar que el jefe no ha accedido al contador
                mutexCont.acquire();
                
                this.estado = "Revisando contador...";
                System.out.println("Gerente: " + this.estado);
                if (Simulacion.contador == 0) {
                    this.estado = "Desplegando New 15SD XL...";
                    System.out.println("Gerente: " + this.estado);
                    
                    //AQUÍ HACE FALTA ACTUALIZAR EL CONTADOR DE CONSOLAS FABRICADAS
                    
                    Simulacion.contador = this.cantDias;
                }
                //Es posible tener que hacer cambios aquí
                
                System.out.println("Días restantes: " + Simulacion.contador);
                
                mutexCont.release();
                
                this.estado = "Desocupado";
                System.out.println("Gerente: " + this.estado);
                Thread.sleep((int)(x*2*1000));
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Gerente.java: " + ex);
            }
        }
    }
}
