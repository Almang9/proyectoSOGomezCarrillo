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
            Almacen almacen
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
    }
    
    public void run() {
        while (this.contratado) {
            try {
                //BOTONES
                
                //Verificar que hay suficientes botones disponibles
                eBotones.acquire(5); //5 botones
                
                //Verificar que el almacén de botones esté desocupado
                mutexBotones.acquire();
                
                almacen.botones = almacen.botones - 5;
                System.out.println("Se han tomado 5 botones del almacén");
                System.out.println("Cantidad de botones: " + almacen.botones);
                
                mutexBotones.release();
                
                pBotones.release(5);
                
                //PANTALLAS
                
                //Verificar que hay suficientes pantallas disponibles
                ePantallas.acquire(2); //1 pantalla normal y 1 táctil
                
                //Verificar que el almacén de pantallas esté desocupado
                mutexPantallas.acquire();
                
                //PANTALLAS NORMALES
                almacen.pantallas--;
                System.out.println("Se ha tomado 1 pantalla normal del almacén");
                System.out.println("Cantidad de pantallas normales: " + almacen.pantallas);
                
                //PANTALLAS TÁCTILES
                almacen.pantallasTactil--;
                System.out.println("Se ha tomado 1 pantalla táctil del almacén");
                System.out.println("Cantidad de pantallas táctiles: " + almacen.pantallasTactil);
                
                mutexPantallas.release();
                
                pPantallas.release(2);
                
                //JOYSTICKS
                
                //Verificar que hay suficientes joysticks disponibles
                eJoysticks.acquire(2); //2 joysticks
                
                //Verificar que el almacén de joysticks esté desocupado
                mutexJoysticks.acquire();
                
                almacen.joysticks = almacen.joysticks - 2;
                System.out.println("Se han tomado 2 joysticks del almacén");
                System.out.println("Cantidad de joysticks: " + almacen.joysticks);
                
                mutexJoysticks.release();
                
                pJoysticks.release(2);
                
                //LECTORES SD
                
                //Verificar que hay suficientes lectores SD disponibles
                eSD.acquire(); //1 lector SD
                
                //Verificar que el almacén de lectoresSD esté desocupado
                mutexSD.acquire();
                
                almacen.lectoresSD--;
                System.out.println("Se han tomado 1 lector SD del almacén");
                System.out.println("Cantidad de lectores SD: " + almacen.lectoresSD);
                
                mutexSD.release();
                
                pSD.release();
                
                //ENSAMBLAJE
                
                Thread.sleep(dia * 1000); //1 dia
                
                //Verificar que el almacen de consolas está desocupado
                mutexConsolas.acquire();
                
                almacen.consolas++;
                System.out.println("Se ha fabricado 1 consola New 15SD XL");
                System.out.println("Cantidad de consolas: " + almacen.consolas);
                
                mutexConsolas.release();
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Ensamblador.java: " + ex);
            }
        }
    }
}
