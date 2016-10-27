package Clases;
import Interfáz.*;

public class Partido {

    public static int sets_max;

    public static int diferencia;

    public static int errores;
    
    public static int volver;
    
    private Puntos puntos;
    
    private Actualizar_marcador clase;
    
    private static Jugador[] jugador = new Jugador [2];
    
    public static Jugador[] getJugador(){
        return jugador;
    }

    public Partido() {
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

    public static void duración_partido() {
        if (Caracteristica_partido.jComboBox.getSelectedIndex() == 1) {
            Partido.sets_max = 1;
        }
        if (Caracteristica_partido.jComboBox.getSelectedIndex() == 2) {
            Partido.sets_max = 3;

        }
        if (Caracteristica_partido.jComboBox.getSelectedIndex() == 3) {
            Partido.sets_max = 5;

        }
    }

    public static void diferencia() {
        if (Caracteristica_partido.jDiferencia.isSelected() == true) {
            Partido.diferencia = 1;
        }
        if (Caracteristica_partido.jDiferenciaNo.isSelected() == true) {
            Partido.diferencia = 0;
        }
    }

    public boolean addPersona(Jugador partido) {
        for (int i = 0; i < jugador.length; i++) {
            if (jugador[i] == null) {
                jugador[i] = partido;
                return true;
            }
        }
        return false;
    }

    public Jugador findByNombre(String nombre) {
        for (int i = 0; i < jugador.length; i++) {
            if (jugador[i].getNombre().equals(nombre)) {
                return jugador[i];
            }

        }
        return null;
    }

    public int cantidadCargada() {
        int count = 0;
        for (int i = 0; i < jugador.length; i++) {
            if (jugador[i] != null) {
                count++;
            }
        }
        return count;
    }
//<<<<<<< HEAD:Proyecto/src/Clases/Partido.java

//    public static void game_ganado(){
//        for (int i=0;i<jugador.length;i++){
//            if (jugador[0].getPunto()  != jugador[1].getPunto()){
//                System.out.println(jugador[1].getPunto() + "");
//                jugador[1].vale_0();
//                jugador[0].vale_0();
//                jugador[0].aumentar_games();
//                return;
//            }  
//        }
//    }
  
    public static void cambiar_marcador(){
        Marcador.jPuntos1.setText(jugador[0].getPunto().getPunto() + "");
        Marcador.jGames1.setText(jugador[0].getGames().getGames() + "");
        Marcador.jSets1.setText(jugador[0].getSets().getSets() + "");
            
        Marcador.jPuntos2.setText(jugador[1].getPunto().getPunto() + "");
        Marcador.jGames2.setText(jugador[1].getGames().getGames() + "");
        Marcador.jSets2.setText(jugador[1].getSets().getSets() + "");
    }

    public static void game_ganado() {
        if ((jugador[1].getPunto().getPunto() == 40) && (jugador[0].getPunto().getPunto() != 40)) {
            jugador[0].vale_0();
            jugador[1].vale_0();
            jugador[1].aumentar_games();        
            return;
        }
        if ((jugador[0].getPunto().getPunto() == 40) && (jugador[1].getPunto().getPunto() != 40)) {
            jugador[0].vale_0();
            jugador[1].vale_0();
            jugador[0].aumentar_games();
        }
    }
     
    
//    public static void set_ganado() {
//        if (jugador[0].getPunto().getGames() == 6 && jugador[1].getPunto().getGames() != 6){         
//            jugador[1].vale_0();
//            jugador[1].vale_0_games();
//            jugador[0].vale_0();
//            jugador[0].vale_0_games();
//            jugador[0].aumentar_sets();     
//        }
//        if (jugador[1].getPunto().getGames() == 6 && jugador[0].getPunto().getGames() != 6){
//            jugador[0].vale_0_games();
//            jugador[0].vale_0();
//            jugador[1].vale_0_games();
//            jugador[0].vale_0();
//            jugador[1].aumentar_sets();    
        

    
//    public static void deuce_ju1(){
//        if (jugador[0].getPunto().getPunto() == 40 && jugador[1].getPunto().getPunto() == 40){
//            jugador[0].vale_0();
//            jugador[1].vale_0();
//            Deuce deuce = new Deuce();
//            deuce.setVisible(true);
//}
//
//    
//    
//    public static void deuce_ju2(){
//        if (jugador[1].getPunto().getPunto() == 40 && jugador[0].getPunto().getPunto() == 40){
//            jugador[0].vale_0();
//            jugador[1].vale_0();
//            Deuce deuce = new Deuce();
//            deuce.setVisible(true);
//        }
   
   public static void marcador_deuce(){
        Deuce.jDeuce.setText(jugador[0].getPunto().getPunto() +  "     -     " + jugador[1].getPunto().getPunto());
        
    }
    
    public static void aumentar_deuce(){
        if (jugador[0].getPunto().getPunto() == 0 && jugador[1].getPunto().getPunto() == 0){
            jugador[0].aumentar_ventaja();
            marcador_deuce();
            return;
        }
        if (jugador[0].getPunto().getPunto() == 1 && jugador[1].getPunto().getPunto() == 0){
            jugador[0].vale_0();
            jugador[1].vale_0();
            jugador[0].aumentar_games_por_deuce();
            Deuce deuce = new Deuce();
            deuce.setVisible(false);
            return;
        }  
        if (jugador[0].getPunto().getPunto() == 1 && jugador[1].getPunto().getPunto() == 1){
            jugador[0].vale_0();
            jugador[1].vale_0();
            marcador_deuce();
            return;
        }
  }



    public static void aumentar_deuce2(){    
       //SEGUNDO JUGADOR
        if (jugador[0].getPunto().getPunto() == 0 && jugador[1].getPunto().getPunto() == 0){
            jugador[1].aumentar_ventaja();
            marcador_deuce();
            return;
        }
        
        if (jugador[1].getPunto().getPunto() == 1 && jugador[0].getPunto().getPunto() == 0){
            jugador[0].vale_0();
            jugador[1].vale_0();
            jugador[1].aumentar_games();
            Deuce deuce = new Deuce();
            deuce.setVisible(false);
            return;
            
        }
         
         if (jugador[0].getPunto().getPunto() == 1 && jugador[1].getPunto().getPunto() == 1){
            jugador[0].vale_0();
            jugador[1].vale_0();
            marcador_deuce();
            return;
        }
        
    }
    
}
