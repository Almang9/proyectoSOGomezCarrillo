/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosogomez.carrillo;

import java.util.Map;
import java.util.concurrent.Semaphore;

/** 
 *
 * @author AJCV0
 */
public class Simulacion {
    //Contador de días restantes
    public static volatile int contador;
    
    //Almacén con los contadores de cada pieza y de las consolas producidas
    Almacen almacen;
    
    //Parámetros de la simulación (archivo)
     Map <String,String> datos;
    
    //Arreglos de productores
    Productor[] botones, pantallas, joysticks, lectoresSD;
    
    //Arreglo de ensambladores
    Ensamblador[] ensambladores;
    
    //Jefe
    Jefe jefe;
    
    //Gerente
    Gerente gerente;
    
    //Semáforo para el contador de días
    Semaphore semCont;
    
    //Semáforos para ingresar al almacén
    Semaphore semBotones, semPantallas, semPantallasTouch, semJoysticks, semLectoresSD, semConsolas;
    
    //Semáforos para saber cuántas piezas se pueden hacer (Productores)
    Semaphore semProductorBotones, semProductorPantallas, semProductorJoysticks, semProductorSD;
    
    //Semáforos para saber cuántas piezas existen (Ensambladores)
    Semaphore semEnsambladorBotones, semEnsambladorPantallas, semEnsambladorJoysticks, semEnsambladorSD;
    
    //Cantidad de productores actual
    int cantPBotones, cantPPantallas, cantPJoysticks, cantPSD;
    
    //Cantidad de ensambladores actual
    int cantEnsambladores;

    public Simulacion() {
        this.inicializar();
    }
    
    //Inicializar simulación
    public void inicializar() {
        //Leer el archivo para obtener los parámetros
        //FALTA
        Archivo archivo = new Archivo();
        datos =archivo.getParametros();
        //Establecer el contador de días a su cantidad inicial
        contador = Integer.parseInt(datos.get("contador")); //CAMBIAR VALOR CON EL QUE APARECE EN EL ARCHIVO
        
        //Crear semáforos
        
        //CONTADOR
        semCont = new Semaphore(1);
        
        //EXCLUSION MUTUA
        semBotones = new Semaphore(1);
        semPantallas = new Semaphore(1);
        semJoysticks = new Semaphore(1);
        semLectoresSD = new Semaphore(1);
        semConsolas = new Semaphore(1);
        
        //PRODUCTORES
        //CAMBIAR VALORES POR LOS QUE APARECEN EN EL ARCHIVO
        semProductorBotones = new Semaphore(Integer.parseInt(datos.get("almacenBotones")));
        semProductorPantallas = new Semaphore(Integer.parseInt(datos.get("almacenPantallas")));
        semProductorJoysticks = new Semaphore(Integer.parseInt(datos.get("almacenJoystick")));
        semProductorSD = new Semaphore(Integer.parseInt(datos.get("almacenSD")));
        
        //ENSAMBLADORES
        semEnsambladorBotones = new Semaphore(0);
        semEnsambladorPantallas = new Semaphore(0);
        semEnsambladorJoysticks = new Semaphore(0);
        semEnsambladorSD = new Semaphore(0);
        
        //Cantidades iniciales de productores y ensambladores
        //CAMBIAR VALORES POR EL NÚMERO QUE APARECE INDICADO EN EL ARCHIVO
        cantPBotones = Integer.parseInt(datos.get("productorBotonesI"));
        cantPPantallas = Integer.parseInt(datos.get("productorPantallasI"));
        cantPJoysticks = Integer.parseInt(datos.get("productorJoystickI"));
        cantPSD = Integer.parseInt(datos.get("productorSDI"));
        cantEnsambladores = Integer.parseInt(datos.get("ensambladoresI"));
        
        //Construir los arreglos de productores y ensambladores
        //CAMBIAR VALORES POR EL NÚMERO QUE APARECE INDICADO EN EL ARCHIVO
        botones = new Productor[Integer.parseInt(datos.get("productorBotonesF"))];
        pantallas = new Productor[Integer.parseInt(datos.get("productorPantallasF"))];
        joysticks = new Productor[Integer.parseInt(datos.get("productorJoystickF"))];
        lectoresSD = new Productor[Integer.parseInt(datos.get("productorSDF"))];
        ensambladores = new Ensamblador[Integer.parseInt(datos.get("ensambladoresF"))];
        
        //Llenar arreglos
        
        //BOTONES
        for (int i=0; i < botones.length; i++) {
            botones[i] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    0,
                    semBotones,
                    semProductorBotones,
                    semEnsambladorBotones,
                    almacen
                );
            if (i < cantPBotones) {
                botones[i].start();
            }
        }
        
        //PANTALLAS
        for (int i=0; i < pantallas.length; i++) {
            pantallas[i] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    1,
                    semPantallas,
                    semProductorPantallas,
                    semEnsambladorPantallas,
                    almacen
                );
            if (i < cantPPantallas) {
                pantallas[i].start();
            }
        }
        
        //JOYSTICKS
        for (int i=0; i < joysticks.length; i++) {
            joysticks[i] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    2,
                    semJoysticks,
                    semProductorJoysticks,
                    semEnsambladorJoysticks,
                    almacen
                );
            if (i < cantPJoysticks) {
                joysticks[i].start();
            }
        }
        
        //LECTORES SD
        for (int i=0; i < lectoresSD.length; i++) {
            lectoresSD[i] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    3,
                    semLectoresSD,
                    semProductorSD,
                    semEnsambladorSD,
                    almacen
                );
            if (i < cantPSD) {
                lectoresSD[i].start();
            }
        }
        
        //ENSAMBLADORES
        for (int i=0; i < ensambladores.length; i++) {
            ensambladores[i] = new Ensamblador(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    semBotones,
                    semPantallas,
                    semJoysticks,
                    semLectoresSD,
                    semConsolas,
                    semProductorBotones,
                    semProductorPantallas,
                    semProductorJoysticks,
                    semProductorSD,
                    semEnsambladorBotones,
                    semEnsambladorPantallas,
                    semEnsambladorJoysticks,
                    semEnsambladorSD,
                    almacen
                );
            if (i < cantEnsambladores) {
                ensambladores[i].start();
            }
        }
        
        //Crear jefe y gerente
        jefe = new Jefe(Integer.parseInt(datos.get("duracionDia")), semCont);
        gerente = new Gerente(Integer.parseInt(datos.get("duracionDia")), 15, semCont, semConsolas, almacen);
        
        jefe.start();
        gerente.start();
    }
    
    //Contratar productor

    /**
     *
     * @param productor -> Arreglo de productores
     * @param cantidad -> Cantidad de productores trabajando actualmente
     */
    public void contratar(Productor[] productor, int cantidad) {
        if (cantidad < productor.length) {
            productor[cantidad].start();
            cantidad++;
        }
    }
    
    //Contratar ensamblador

    /**
     *
     * @param ensamblador -> Arreglo de ensambladores
     * @param cantidad -> Cantidad de ensambladores trabajando actualmente
     */
    public void contratar(Ensamblador[] ensamblador, int cantidad) {
        if (cantidad < ensamblador.length) {
            ensamblador[cantidad].start();
            cantidad++;
        }
    }
    
    //Despedir ensamblador

    /**
     *
     * @param productor -> Arreglo de productores
     * @param cantidad -> Cantidad de productores trabajando actualmente
     * @param tipo -> Tipo de productores
     * @param mutexAlmacen -> Semáforo para verificar si el almacén está ocupado
     * @param p -> Semáforo para verificar cuántas piezas se pueden hacer
     * @param e -> Semáforo para verificar cuántas piezas se pueden retirar del almacén
     */
    public void despedir(
            Productor[] productor,
            int cantidad,
            int tipo,
            Semaphore mutexAlmacen,
            Semaphore p,
            Semaphore e
        ) {
        if (cantidad > 0) {
            cantidad--;
            productor[cantidad].contratado = false;
            productor[cantidad] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    tipo,
                    mutexAlmacen,
                    p,
                    e,
                    almacen
                );
        }
    }
    
    /**
     *
     * @param ensamblador -> Arreglo de ensambladores
     * @param cantidad -> Cantidad de ensambladores trabajando actualmente
     */
    public void despedir(Ensamblador[] ensamblador, int cantidad) {
        if (cantidad > 0) {
            cantidad--;
            ensamblador[cantidad].contratado = false;
            ensamblador[cantidad] = new Ensamblador(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    semBotones,
                    semPantallas,
                    semJoysticks,
                    semLectoresSD,
                    semConsolas,
                    semProductorBotones,
                    semProductorPantallas,
                    semProductorJoysticks,
                    semProductorSD,
                    semEnsambladorBotones,
                    semEnsambladorPantallas,
                    semEnsambladorJoysticks,
                    semEnsambladorSD,
                    almacen
                );
        }
    }
}
