package Clases;


import Interfáz.Actualizar_marcador;
import Clases.Jugador;

public class Partido {

    public static int sets_max;
    
    public static int diferencia;
    
    public static int errores;
    
    private Puntos puntos;
    
    private Actualizar_marcador clase;
    
    private static Jugador[] jugador = new Jugador [2];
    
    public static Jugador[] getJugador(){
        return jugador;
    }
    
    
    
        
    public Partido(){
        
    }
    
    public Partido(int sets_max, int diferencia, Puntos puntos) {
        Partido.sets_max = sets_max;
        Partido.diferencia = diferencia;
        puntos = new Puntos();
        
    }

    public static int getSets_max() {
        return sets_max;
    }

    public static void setSets_max(int sets_max) {
        Partido.sets_max = sets_max;
    }

    public static int getDiferencia() {
        return diferencia;
    }

    public static void setDiferencia(int diferencia) {
        Partido.diferencia = diferencia;
    }

    public Puntos getPuntos() {
        return puntos;
    }

    public void setPuntos(Puntos puntos) {
        this.puntos = puntos;
    }
    
   
    public static void duración_partido(){
        if (Caracteristica_partido.jComboBox.getSelectedIndex() == 1){
            Partido.sets_max = 1;
        }
        if (Caracteristica_partido.jComboBox.getSelectedIndex() == 2){
            Partido.sets_max = 3;
            
        }
        if (Caracteristica_partido.jComboBox.getSelectedIndex() == 3){
            Partido.sets_max = 5;
            
        }
    }
    
    public static void diferencia(){
        if (Caracteristica_partido.jDiferencia.isSelected() == true){
            Partido.diferencia = 1;
        }
        if (Caracteristica_partido.jDiferenciaNo.isSelected() == true){
            Partido.diferencia = 0;
        }
    }
    
    public boolean addPersona(Jugador partido){
        for (int i=0; i<jugador.length; i++){
            if (jugador[i]== null){
                jugador[i] = partido;
                return true;
            }
        }
        return false;
    }
    
    public Jugador findByNombre(String nombre){
        for (int i=0; i< jugador.length;i++) {
            if (jugador[i].getNombre().equals(nombre)) {
                return jugador[i];
            }
            
        }
        return null;
    }
    

    public int cantidadCargada(){
        int count = 0;
        for (int i=0; i<jugador.length; i++){
            if (jugador[i]!= null){
                count++;
            }
        }
        return count;
    }

    public static void game_ganado(){
        for (int i=0;i<jugador.length;i++){
            if (jugador[0].getPunto()  != jugador[1].getPunto()){
                System.out.println(jugador[1].getPunto() + "");
                jugador[1].vale_0();
                jugador[0].vale_0();
                jugador[0].aumentar_games();
                return;
            }       
        }
    }
    
}
