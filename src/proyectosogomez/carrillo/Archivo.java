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
String[] keys = {
    "contador",
    "duracionDia",
    "almacenBotones",
    "almacenPantallas",
    "almacenJoystick",
    "productorBotonesI",
    "productorBotonesF",
    "productorPantallasI",
    "productorPantallasF",
    "pruductorJoystickI",
    "productorJoystickF",
    "productorSDI",
    "productorSDF",
    "ensambladoresI",
    "ensambladoresF"};
String[][] defaultOpt = {{"contador","14"},
    {"duracionDia","24"},
    {"almacenBotones","45"},
    {"almacenSD","15"},
    {"almacenPantallas","40"},
    {"almacenJoystick","20"},
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
                System.out.println(" ");
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
        if(!"".equals(text) && !text.isEmpty()){
        String[] text_split = text.split("\n");
        System.out.println("It WORKS");
        for (int i = 0; i < text_split.length; i++) {
            dictionary.put(text_split[i].split(":")[0],text_split[i].split(":")[1]);
        }
        }else{
        parameters = defaultOpt;
            for (String[] defaultOpt1 : defaultOpt) {
                dictionary.put(defaultOpt1[0], defaultOpt1[1]);
                text += defaultOpt1[0] + ":" + defaultOpt1[1] + "\n";                
                System.out.println(Arrays.toString(defaultOpt1));
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
            System.out.println(" ");}
            parameters = defaultOpt;
     }
    
}
    public void saveDatafile(Map<String,String> dictionary){
        String value;
     for (String key : keys) {
         value = dictionary.get(key);
         text += key + ":" + value + "\n";
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
