package Clases;

public class Puntos {
    public int puntoa;
    private int punto ;
    private int puntos_ganados;
    private int puntos_jugados;
    private int games ;
    private int sets;
    private int cant_games;
    private int cant_sets;
        
    public Puntos() {
    }

//    @Override
//    public String toString() {
//        return "Punto{" + "punto= " + punto + ", games= " + games + ", sets= " + sets + '}';
//    }

    public int getPuntoa() {
        return puntoa;
    }

    public void setPuntoa(int puntoa) {
        this.puntoa = puntoa;
    }
    
    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto12) {
        this.punto = punto12;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games12) {
        this.games = games12;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets12) {
        this.sets = sets12;
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
