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
    // Interfaz Gráfica
    Window interfaz;
    public Productor(
            int dia,
            int tipo,
            Semaphore mutexAlmacen,
            Semaphore productor,
            Semaphore ensamblador,
            Almacen almacen,
            Window interfaz
        ) {
        this.dia = dia;
        this.tipo = tipo;
        this.mutexAlmacen = mutexAlmacen;
        this.productor = productor;
        this.ensamblador = ensamblador;
        this.contratado = true;
        this.almacen = almacen;
        this.interfaz = interfaz;
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
                        interfaz.setBotones(Integer.toString(almacen.botones));
                        
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
                        interfaz.setPantallasN(Integer.toString(almacen.pantallas));
                        
                        mutexAlmacen.release();
                        
                        //PANTALLAS TÁCTILES
                        Thread.sleep(this.dia * 2 * 1000); //2 días
                        
                        //Verificar si el almacén de pantallas está desocupado
                        mutexAlmacen.acquire();
                        
                        //Se almacena la pantalla táctil producida
                        almacen.pantallasTactil++;
                        interfaz.setPantallasT(Integer.toString(almacen.pantallasTactil));
                        
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
                        interfaz.setJoysticks(Integer.toString(almacen.joysticks));
                        
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
                        interfaz.setTarjetasSD(Integer.toString(almacen.lectoresSD));
                        
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
