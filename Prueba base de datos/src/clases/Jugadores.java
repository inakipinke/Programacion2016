/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pinke
 */
public abstract class Jugadores implements Serializable{
    private static ArrayList<Jugador> jugadores = new ArrayList() ;
    private static final String archivo = "DataBase.TdB";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;

    public static ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public static void addJugador(Jugador jugadorR) {
        if (jugadores.size() < 2){
            jugadores.add(jugadorR);      
        }
    }
    
    public static boolean numJugadores (){
        if (jugadores.size() < 2){
            return false;
        }else{
            return true;
        }
    }
    
    public static String save() {
        String ret = "Carga exitosa";
        boolean flag = true;
        String fileTmp = "tmpFile.db";
        //Se carga el array en un archivo temporal
        try {
            fos = new FileOutputStream(fileTmp);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(jugadores);
            

        } catch (FileNotFoundException ex) {
            flag = false;
            System.out.println("No se encuentra el archivo");
        } catch (IOException ex) {
            flag = false;
            System.out.println("Error al guardar el archivo");
            return ret;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        //Si todo salió bien, se borra el archivo db actual 
        //y lo reemplaza por tmpFile.db
        File fdel = new File(archivo);
        File ftmp = new File(fileTmp);
        if (fdel.exists()) {
            if (fdel.delete()) {
                ftmp.renameTo(new File(archivo));
            }
        } else {
            ftmp.renameTo(new File(archivo));
        }


        return ret;

    }

    public static void load() {
        
        System.out.println("Intentando levantar la lista");
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            while (true) {
                jugadores = (ArrayList<Jugador>) ois.readObject();                
            }

        }catch (EOFException e1) {
            //END OF FILE!
            System.out.println("Sale");
        } catch (Exception e2) {
            System.out.println("Error!!!" + e2);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        
    }
    
    
}
