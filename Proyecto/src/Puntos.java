
import javax.swing.JOptionPane;

public class Puntos {
 
    private int puntos ;
    private int puntos_ganados;
    private int puntos_jugados;
    private int games ;
    private int sets ;
    private int cant_games;
    private int cant_sets;
    
    public Puntos() {
    }

    @Override
    public String toString() {
        return "Puntos{" + "puntos=" + puntos + '}';
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getPuntos_ganados() {
        return puntos_ganados;
    }

    public void setPuntos_ganados(int puntos_ganados) {
        this.puntos_ganados = puntos_ganados;
    }

    public int getPuntos_jugados() {
        return puntos_jugados;
    }

    public void setPuntos_jugados(int puntos_jugados) {
        this.puntos_jugados = puntos_jugados;
    }
    
    
    
}
