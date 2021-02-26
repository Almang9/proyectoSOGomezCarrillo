/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectosogomez.carrillo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


/**
 *
 * @author Alman
 */
public class Archivo {
 String cadena = "";
 File file;
String path = "test\\datafile.txt";
String line;
String text= "";
String[][] keys = {
    {"contador", "0"},
    {"duracionDia", "1"},
    {"almacenBotones", "6"},
    {"almacenPantallas","2"},
    {"almacenJoystick","2"},
    {"almacenSD","1"},
    {"productorBotonesI","0"},
    {"productorBotonesF","0"},
    {"productorPantallasI","0"},
    {"productorPantallasF","0"},
    {"productorJoystickI","0"},
    {"productorJoystickF","0"},
    {"productorSDI","0"},
    {"productorSDF","0"},
    {"ensambladoresI","0"},
    {"ensambladoresF","0"}};
String[][] defaultOpt = {{"contador","14"},
    {"duracionDia","24"},
    {"almacenBotones","45"},
    {"almacenSD","15"},
    {"almacenPantallas","40"},
    {"almacenJoystick","20"},
    {"almacenSD","15" },
    {"productorBotonesI","1"},
    {"productorBotonesF","3"},
    {"productorPantallasI","2"},
    {"productorPantallasF","5"},
    {"productorJoystickI","3"},
    {"productorJoystickF","4"},
    {"productorSDI","1"},
    {"productorSDF","4"},
    {"ensambladoresI","1"},
    {"ensambladoresF","5"}};

String[][] parameters;
Map<String, String> dictionary;
    public Archivo() {
        file = new File(path);
        parameters = new String[16][2];        
        dictionary = new HashMap<>();
        createDatafile();
    }
    public void createDatafile() {        
        try{
    if (!file.exists()){
        file.createNewFile();
        for (String[] defaultOpt1 : defaultOpt){
                dictionary.put(defaultOpt1[0], defaultOpt1[1]);
                text = defaultOpt1[0] + ":" + defaultOpt1[1] + "\n";
        }
        FileWriter fw = new FileWriter("test\\datafile.txt");
        fw.write(text);
        fw.close();
    } else {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while ((line = br.readLine()) != null){
            if(!line.isEmpty()){
                text += line + "\n";
            }
        }
        br.close();
        String[] text_split = text.split("\n");
        if(!"".equals(text) && !text.isEmpty() && checkDatafile(text_split) ){
        
        
        for (int i = 0; i < text_split.length; i++) {
            dictionary.put(text_split[i].split(":")[0],text_split[i].split(":")[1]);
        }        
        }else{
            text = "";
        this.parameters = this.defaultOpt;
            for (String[] defaultOpt1 : defaultOpt) {
                this.dictionary.put(defaultOpt1[0], defaultOpt1[1]);
                text += defaultOpt1[0] + ":" + defaultOpt1[1] + "\n";
            }
            FileWriter fw = new FileWriter("test\\datafile.txt");
            fw.write(text);
            fw.close();
        }
    }
        }
    catch(IOException e) {
    System.out.println(e);
        for (String[] defaultOpt1 : defaultOpt) {
            dictionary.put(defaultOpt1[0], defaultOpt1[1]);
        }
            parameters = defaultOpt;
    }    
}
    public boolean checkDatafile(String[] file){        
        //* Esta función revida que los datos obtenidos del archivo estén correctamente formateados               
        String field;
        String value;
        String[] splitFile;
        try{
            //Comprobando que el archivo tiene todos los campos necesarios
            System.out.println(keys.length);
            if(file.length < 15){
                return false;
            }
            for(int i = 0; i < file.length -1; i++){
                splitFile = file[i].split(":");
                field = splitFile[0];
                value = splitFile[1];      
                //Comprobando que el archivo tiene todos los campos definidos correctamente
                // Comprobando que el archivo tenga valores que no son menores al límite
                System.out.println("field:  " + field +"key:  "+  keys[i][0]);
                    System.out.println("value: "+  value + "min: " + keys[i][0]);
                if(!(field.equals(keys[i][0]) && Integer.parseInt(value)> Integer.parseInt(keys[i][1]))){                    
                return false;
                }
            }
            return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;}
        }
        
        
    
    public void saveDatafile(String duracionDia,
            String contador, 
            String almacenBotones, 
            String almacenPantallas,
            String almacenJoystick,
            String almacenSD,
            String productorBotonesI,
            String productorBotonesF,
            String productorPantallasI,
            String productorPantallasF, 
            String productorJoystickI, 
            String productorJoystickF, 
            String productorSDI, 
            String productorSDF, 
            String ensambladoresI, 
            String ensambladoresF){      
        String[] values={
    contador,
    duracionDia,
    almacenBotones,
    almacenPantallas,
    almacenJoystick,
    almacenSD,
    productorBotonesI,
    productorBotonesF,
    productorPantallasI,
    productorPantallasF,
    productorJoystickI,
    productorJoystickF,
    productorSDI,
    productorSDF,
    ensambladoresI,
    ensambladoresF};
      text = "";
     for (int i = 0; i<keys.length; i++)
     {
         text += keys[i][0]+ ":"+ values[i] + "\n";
     }
        try{
    PrintWriter pw = new PrintWriter("test\\datafile.txt");
    pw.print(text);
    pw.close();
    JOptionPane.showMessageDialog(null,"Configuración guardada de manera exitosa");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,"Hubo un Error al guardar");
        }
    }
    public Map<String,String> getParametros(){
     return this.dictionary;   
    }
}
