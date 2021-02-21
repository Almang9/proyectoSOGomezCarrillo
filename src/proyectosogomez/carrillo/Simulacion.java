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
public class Simulacion {
<<<<<<< HEAD
    public static volatile int contador = 3;
    
    public static void main(String[] args) {
        Semaphore semCont = new Semaphore(1);
        Jefe j = new Jefe(24, semCont);
        Gerente g = new Gerente(24, 3, semCont);
        
        
        j.start();
        g.start();
=======
    //Contador de días restantes
    public static volatile int contador;
    
    //Almacén con los contadores de cada pieza y de las consolas producidas
    Almacen almacen;
    
    //Parámetros de la simulación (archivo)
    
    
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
        
        //Establecer el contador de días a su cantidad inicial
        contador = 15; //CAMBIAR VALOR CON EL QUE APARECE EN EL ARCHIVO
        
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
        semProductorBotones = new Semaphore(45);
        semProductorPantallas = new Semaphore(40);
        semProductorJoysticks = new Semaphore(20);
        semProductorSD = new Semaphore(15);
        
        //ENSAMBLADORES
        semEnsambladorBotones = new Semaphore(0);
        semEnsambladorPantallas = new Semaphore(0);
        semEnsambladorJoysticks = new Semaphore(0);
        semEnsambladorSD = new Semaphore(0);
        
        //Cantidades iniciales de productores y ensambladores
        //CAMBIAR VALORES POR EL NÚMERO QUE APARECE INDICADO EN EL ARCHIVO
        cantPBotones = 1;
        cantPPantallas = 1;
        cantPJoysticks = 1;
        cantPSD = 1;
        cantEnsambladores = 1;
        
        //Construir los arreglos de productores y ensambladores
        //CAMBIAR VALORES POR EL NÚMERO QUE APARECE INDICADO EN EL ARCHIVO
        botones = new Productor[3];
        pantallas = new Productor[5];
        joysticks = new Productor[4];
        lectoresSD = new Productor[4];
        ensambladores = new Ensamblador[5];
        
        //Llenar arreglos
        
        //BOTONES
        for (int i=0; i < botones.length; i++) {
            botones[i] = new Productor(
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
        jefe = new Jefe(24, semCont);
        gerente = new Gerente(24, 15, semCont, semConsolas, almacen);
        
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
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
                    24, //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
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
>>>>>>> f037417f98354dc240d1065de230b37addd36e3b
    }
}
