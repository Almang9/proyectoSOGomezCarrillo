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
    //Interfaz
    Window window;
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
        datos = archivo.getParametros();
        window = new Window(this);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setMaxcapacity(
                datos.get("almacenBotones"),
                datos.get("almacenPantallas"),
                datos.get("almacenPantallas"), 
                datos.get("almacenJoystick"),
                datos.get("almacenSD"),
                datos.get("productorBotonesF"),
                datos.get("productorJoystickF"),
                datos.get("productorPantallasF"),
                datos.get("productorSDF"),
                datos.get("ensambladoresF"));
        window.setProductorB(datos.get("productorBotonesI"));
        window.setProductorJoystick(datos.get("productorJoystickI"));
        window.setProductorPantallas(datos.get("productorPantallasI"));
        window.setProductorSD(datos.get("productorSDI"));
        window.setDays(datos.get("contador"));
        window.setEnsambladores(datos.get("ensambladoresI"));
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
                    almacen,
                    window
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
                    almacen,
                    window
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
                    almacen,
                    window
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
                    almacen,
                    window
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
                    almacen,
                    window
                );
            if (i < cantEnsambladores) {
                ensambladores[i].start();
            }
        }
        
        //Crear jefe y gerente
        jefe = new Jefe(Integer.parseInt(datos.get("duracionDia")), semCont,window);
        gerente = new Gerente(Integer.parseInt(datos.get("duracionDia")), Integer.parseInt(datos.get("contador")), semCont, semConsolas, almacen,window);
        
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
            System.out.println("La cantidad de productores a cambiado a " + Integer.toString(this.cantPBotones));
            System.out.println("La variable cantidad es de: " + cantidad);
            switch(productor[0].tipo){
                    case 0:
                        System.out.println("Botones");
                        this.cantPBotones++;
                        window.setProductorB(Integer.toString(this.cantPBotones));
                        break;
                    case 1:
                        System.out.print("Pantallas");
                        this.cantPPantallas++;
                        window.setProductorPantallas(Integer.toString(cantidad));
                        break;
                    case 2:
                        System.out.print("Joystick");
                        this.cantPJoysticks++;
                        window.setProductorJoystick(Integer.toString(cantidad));
                        break;
                    case 3:
                        this.cantPSD++;
                        window.setProductorSD(Integer.toString(cantidad));
                        System.out.println("SD");
                                
            }
        }
    }
    public void contratarPBotones(){
    if (this.cantPBotones < this.botones.length) {
            this.botones[this.cantPBotones].start();            
            this.cantPBotones++;
            System.out.println("La cantidad de PRODUCTORES DE BOTONES a cambiado a " + Integer.toString(this.cantPBotones));
            System.out.println("La variable CANTIDAD DE BOTONES es de: " + this.cantPBotones);
            System.out.println("Botones");           
            window.setProductorB(Integer.toString(this.cantPBotones));            
    }
    }
    
    public void contratarPPantalla(){
    if (this.cantPPantallas < this.pantallas.length) {
            this.pantallas[this.cantPPantallas].start();            
            this.cantPPantallas++;
            System.out.println("La cantidad de PRODUCTORES DE Pantallas a cambiado a " + Integer.toString(this.cantPPantallas));
            System.out.println("La variable CANTIDAD DE PANTALLAS es de: " + this.cantPPantallas);
            System.out.println("Botones");           
            window.setProductorPantallas(Integer.toString(this.cantPPantallas));            
    }
            }
    public void contratarPJoystick(){
    if (this.cantPJoysticks < this.joysticks.length) {
            this.joysticks[this.cantPJoysticks].start();            
            this.cantPJoysticks++;
            System.out.println("La cantidad de PRODUCTORES DE JOYSTICKS a cambiado a " + Integer.toString(this.cantPJoysticks));
            System.out.println("La variable CANTIDAD DE JOYSTICKS es de: " + this.cantPJoysticks);
            System.out.println("Joysticks");           
            window.setProductorJoystick(Integer.toString(this.cantPJoysticks));            
    }
    }
    public void contratarPSD(){
    if (this.cantPSD < this.lectoresSD.length) {
            this.lectoresSD[this.cantPSD].start();
            this.cantPSD++;
            System.out.println("La cantidad de PRODUCTORES DE LECTORES SD a cambiado a " + Integer.toString(this.cantPSD));
            System.out.println("La variable CANTIDAD DE LECTORES SD es de: " + this.cantPSD);
            System.out.println("Tarjetas SD");           
            window.setProductorSD(Integer.toString(this.cantPSD));            
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
            window.setEnsambladores(Integer.toString(cantidad));
        }
    }
    public void contratarEnsamblador(){
    if (this.cantEnsambladores < this.ensambladores.length) {
            this.ensambladores[this.cantEnsambladores].start();
            this.cantEnsambladores++;
            window.setEnsambladores(Integer.toString(this.cantEnsambladores));
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
                    almacen,
                    window
                );
        }
    }
    
    public void despedirB(){
    if (this.cantPBotones > 0) {
            this.cantPBotones--;
            
            this.botones[this.cantPBotones].contratado = false;
            this.botones[this.cantPBotones] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    0,
                    this.semBotones,
                    this.semProductorBotones,
                    this.semEnsambladorBotones,
                    almacen,
                    window
                );
        }
    System.out.println("LA CANTIDAD DE PRODUCTORES DE BOTONES ES: "+ this.cantPBotones);
    System.out.println("EL PRODUCTOR " + this.cantPBotones + " ESTA CONTRATADO: "+ this.botones[this.cantPBotones].contratado);
    window.setProductorB(Integer.toString(this.cantPBotones));
    }
    public void despedirPantalla(){
    if (this.cantPPantallas > 0) {
            this.cantPPantallas--;
            
            this.pantallas[this.cantPPantallas].contratado = false;
            this.pantallas[this.cantPPantallas] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    1,
                    this.semPantallas,
                    this.semProductorPantallas,
                    this.semEnsambladorPantallas,
                    almacen,
                    window
                );
        }
    System.out.println("LA CANTIDAD DE PRODUCTORES DE PANTALLAS ES: "+ this.cantPPantallas);
    System.out.println("EL PRODUCTOR " + this.cantPPantallas + " ESTA CONTRATADO: "+ this.pantallas[this.cantPPantallas].contratado);
    window.setProductorPantallas(Integer.toString(this.cantPPantallas));
    }
    public void despedirJoystick(){
    if (this.cantPJoysticks > 0) {
            this.cantPJoysticks--;
            
            this.joysticks[this.cantPJoysticks].contratado = false;
            this.joysticks[this.cantPJoysticks] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    2,
                    this.semJoysticks,
                    this.semProductorJoysticks,
                    this.semEnsambladorJoysticks,
                    almacen,
                    window
                );
        }
    System.out.println("LA CANTIDAD DE PRODUCTORES DE JOYSTICKS ES: "+ this.cantPJoysticks);
    System.out.println("EL PRODUCTOR " + this.cantPJoysticks + " ESTA CONTRATADO: "+ this.joysticks[this.cantPJoysticks].contratado);
    window.setProductorJoystick(Integer.toString(this.cantPJoysticks));
    }
    public void despedirSD(){        
    if (this.cantPSD > 0) {
            this.cantPSD--;
            
            this.lectoresSD[this.cantPSD].contratado = false;
            this.lectoresSD[this.cantPSD] = new Productor(
                    Integer.parseInt(datos.get("duracionDia")), //CAMBIAR VALOR POR EL QUE APARECE EN EL ARCHIVO
                    2,
                    this.semLectoresSD,
                    this.semProductorSD,
                    this.semEnsambladorSD,
                    almacen,
                    window
                );
        }
    System.out.println("LA CANTIDAD DE PRODUCTORES DE JOYSTICKS ES: "+ this.cantPSD);
    System.out.println("EL PRODUCTOR " + this.cantPSD + " ESTA CONTRATADO: "+ this.lectoresSD[this.cantPSD].contratado);
    window.setProductorSD(Integer.toString(this.cantPSD));
    }
    /**
     *
     * @param ensamblador -> Arreglo de ensambladores
     * @param cantidad -> Cantidad de ensambladores trabajando actualmente
     */
    public void despedirEnsambladores() {
        if (this.cantEnsambladores > 0) {
            this.cantEnsambladores--;
            window.setEnsambladores(Integer.toString(this.cantEnsambladores));
            this.ensambladores[this.cantEnsambladores].contratado = false;
            this.ensambladores[this.cantEnsambladores] = new Ensamblador(
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
                    almacen,
                    window
                );
        }
    }
}
