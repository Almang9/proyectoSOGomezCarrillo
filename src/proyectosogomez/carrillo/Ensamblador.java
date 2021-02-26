/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosogomez.carrillo;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AJCV0
 */
public class Ensamblador extends Thread{
    //Tiempo que dura un día en la simulación (medido en segundos)
    int dia;
    //Semáforos para verificar si el almacén no está ocupado
    Semaphore mutexBotones, mutexPantallas, mutexJoysticks, mutexSD, mutexConsolas;
    //Semáforos para verificar cuántas piezas pueden producirse
    Semaphore pBotones, pPantallas, pJoysticks, pSD;
    //Semáforos para verificar cuántas piezas existen
    Semaphore eBotones, ePantallas, eJoysticks, eSD;
    //Condición del productor (contratado o no)
    boolean contratado;
    //Almacen donde se guardan las piezas y las consolas terminadas
    Almacen almacen;
    // Interfaz
    Window window;
    public Ensamblador(
            int dia,
            Semaphore mutexBotones,
            Semaphore mutexPantallas,
            Semaphore mutexJoysticks,
            Semaphore mutexSD,
            Semaphore mutexConsolas,
            Semaphore pBotones,
            Semaphore pPantallas,
            Semaphore pJoysticks,
            Semaphore pSD,
            Semaphore eBotones,
            Semaphore ePantallas,
            Semaphore eJoysticks,
            Semaphore eSD,
            Almacen almacen,
            Window window
        ) {
        this.dia = dia;
        this.mutexBotones = mutexBotones;
        this.mutexPantallas = mutexPantallas;
        this.mutexJoysticks = mutexJoysticks;
        this.mutexSD = mutexSD;
        this.mutexConsolas = mutexConsolas;
        this.pBotones = pBotones;
        this.pPantallas = pPantallas;
        this.pJoysticks = pJoysticks;
        this.pSD = pSD;
        this.eBotones = eBotones;
        this.ePantallas = ePantallas;
        this.eJoysticks = eJoysticks;
        this.eSD = eSD;
        this.contratado = true;
        this.almacen = almacen;
        this.window = window;
    }
    
    public void run() {
        while (this.contratado) {
            try {
                //Verificar que todas las piezas necesarias se encuentran disponibles
                eBotones.acquire(5); //5 botones
                ePantallas.acquire(2); //1 pantalla normal y 1 táctil
                eJoysticks.acquire(2); //2 joysticks
                eSD.acquire(); //1 lector SD
                
                Thread.sleep(dia * 1000); //1 día
                
                //Se verifica que todos los almacenes no estén siendo ocupados
                mutexBotones.acquire();
                mutexPantallas.acquire();
                mutexJoysticks.acquire();
                mutexSD.acquire();
                mutexConsolas.acquire();
                
                //ENSAMBLAJE
                almacen.botones = almacen.botones - 5; //Se restan 5 botones
                window.setBotones(Integer.toString(almacen.botones));
                
                almacen.pantallas--; //Se resta 1 pantalla normal
                window.setPantallasN(Integer.toString(almacen.pantallas));
                
                almacen.pantallasTactil--; //Se resta 1 pantalla táctil
                window.setPantallasT(Integer.toString(almacen.pantallasTactil));
                
                almacen.joysticks = almacen.joysticks - 2; //Se restan 2 joysticks
                window.setJoysticks(Integer.toString(almacen.joysticks));
                
                almacen.lectoresSD--; //Se resta 1 lector SD
                window.setTarjetasSD(Integer.toString(almacen.lectoresSD));
                
                almacen.consolas++; //Se añade 1 consola
                window.setConsolas(Integer.toString(almacen.consolas));
                
                mutexBotones.release();
                mutexPantallas.release();
                mutexJoysticks.release();
                mutexSD.release();
                mutexConsolas.release();
                
                //Aumenta la cantidad de piezas que se pueden producir
                pBotones.release(5); //5 botones
                pPantallas.release(2); //1 pantalla normal y 1 táctil
                pJoysticks.release(2); //2 joysticks
                pSD.release(); //1 lector SD
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Ensamblador.java: " + ex);
            }
        }
    }
}
