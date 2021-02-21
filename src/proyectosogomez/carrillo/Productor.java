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
public class Productor extends Thread{
    //Tiempo que dura un día en la simulación (medido en segundos)
    int dia;
    //Tipo de productor
    int tipo;
    //Semáforo para verificar si el almacén no está ocupado
    Semaphore mutexAlmacen;
    //Semáforo para verificar cuántas piezas pueden producirse
    Semaphore productor;
    //Semáforo para verificar cuántas piezas existen
    Semaphore ensamblador;
    //Condición del productor (contratado o no)
    boolean contratado;
    //Almacen donde se guardan las piezas y las consolas terminadas
    Almacen almacen;

    public Productor(
            int dia,
            int tipo,
            Semaphore mutexAlmacen,
            Semaphore productor,
            Semaphore ensamblador,
            Almacen almacen
        ) {
        this.dia = dia;
        this.tipo = tipo;
        this.mutexAlmacen = mutexAlmacen;
        this.productor = productor;
        this.ensamblador = ensamblador;
        this.contratado = true;
        this.almacen = almacen;
    }
    
    @Override
    public void run() {
        while (this.contratado) {
            try {
                switch (this.tipo) {
                    case 0: //Botones
                        //Verificar si hay espacio en el almacén
                        productor.acquire(2); //2 botones
                        
                        Thread.sleep(this.dia * 1000); //1 día
                        
                        //Verificar si el almacén de botones está desocupado
                        mutexAlmacen.acquire();
                        
                        //Se almacenan los dos botones producidos
                        almacen.botones = almacen.botones + 2;
                        System.out.println("Se produjeron 2 botones");
                        System.out.println("Cantidad de botones: " + almacen.botones);
                        
                        mutexAlmacen.release();
                        
                        //Aumenta la cantidad de botones que hay disponibles
                        ensamblador.release(2); //2 botones
                        
                        break;
                    
                    case 1: //Pantallas
                        //Verificar si hay espacio en el almacén
                        productor.acquire(2); //1 pantalla normal y 1 táctil
                        
                        //PANTALLAS NORMALES
                        Thread.sleep(this.dia * 1000); //1 día
                        
                        //Verificar si el almacén de pantallas está desocupado
                        mutexAlmacen.acquire();
                        
                        //Se almacena la pantalla normal producida
                        almacen.pantallas++;
                        System.out.println("Se produjo 1 pantalla normal");
                        System.out.println("Cantidad de pantallas normales: " + almacen.pantallas);
                        
                        mutexAlmacen.release();
                        
                        //PANTALLAS TÁCTILES
                        Thread.sleep(this.dia * 2 * 1000); //2 días
                        
                        //Verificar si el almacén de pantallas está desocupado
                        mutexAlmacen.acquire();
                        
                        //Se almacena la pantalla táctil producida
                        almacen.pantallasTactil++;
                        System.out.println("Se produjo 1 pantalla táctil");
                        System.out.println("Cantidad de pantallas táctiles: " + almacen.pantallasTactil);
                        
                        mutexAlmacen.release();
                        
                        //Aumenta la cantidad de pantallas que hay disponibles
                        ensamblador.release(2); //1 pantalla normal y 1 táctil;
                        
                        break;
                        
                    case 2: //Joysticks
                        //Verificar si hay espacio en el almacén
                        productor.acquire(); //1 joystick
                        
                        Thread.sleep(this.dia * 2 * 1000); //2 días
                        
                        //Verificar si el almacén de joysticks está desocupado
                        mutexAlmacen.acquire();
                        
                        //Se almacenan el joystick producido
                        almacen.joysticks++;
                        System.out.println("Se produjo 1 joystick");
                        System.out.println("Cantidad de joysticks: " + almacen.joysticks);
                        
                        mutexAlmacen.release();
                        
                        //Aumenta la cantidad de joysticks que hay disponibles
                        ensamblador.release(); //1 joystick
                        
                        break;
                        
                    case 3: //Lectores SD
                        //Verificar si hay espacio en el almacén
                        productor.acquire(); //1 lector SD
                        
                        Thread.sleep(this.dia * 3 * 1000); //3 días
                        
                        //Verificar si el almacén de lectores SD está desocupado
                        mutexAlmacen.acquire();
                        
                        //Se almacena el lector SD producido
                        almacen.lectoresSD++;
                        System.out.println("Se produjo 1 lector SD");
                        System.out.println("Cantidad de lectores SD: " + almacen.lectoresSD);
                        
                        mutexAlmacen.release();
                        
                        //Aumenta la cantidad de lectores SD que hay disponibles
                        ensamblador.release(); //1 lector SD
                        
                        break;
                        
                }
            }
            catch (InterruptedException ex) {
                System.out.println("Ocurrió un error en Productor.java: " + ex);
            }
        }
    }
}