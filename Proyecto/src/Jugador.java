
public class Jugador {

    private String nombre;
    private String apellido;
    private int año_de_nacimiento;
    private int mes_de_nacimiento;
    private int día_de_nacimiento;
    private String nacionalidad;
    private Float altura;
    private Float peso;
    private Puntos punto;
    private Puntos games;
    private Puntos sets;

    //EL JUGADOR TIENE SU PROPIO MARCADOR DONDE SE VEN REFLEJADOS LOS PUNTOS QUE HAYA ANOTADO.
    
    public Jugador() {
    }

    public Jugador(String nombre, Puntos punto,Puntos games,Puntos sets, String apellido, int año_de_nacimiento, int mes_de_nacimiento, int día_de_nacimiento, String nacionalidad, Float altura, Float peso) {
        this.nombre = nombre;
        this.año_de_nacimiento = año_de_nacimiento;
        this.mes_de_nacimiento = mes_de_nacimiento;
        this.día_de_nacimiento = día_de_nacimiento;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.altura = altura;
        this.peso = peso;
        this.punto = new Puntos();
        this.games = new Puntos();
        this.sets = new Puntos();
    }

    public Puntos getSets() {
        return sets;
    }

    public void setSets(Puntos sets) {
        this.sets = sets;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño_de_nacimiento() {
        return año_de_nacimiento;
    }

    public void setAño_de_nacimiento(int año_de_nacimiento) {
        this.año_de_nacimiento = año_de_nacimiento;
    }

    public int getMes_de_nacimiento() {
        return mes_de_nacimiento;
    }

    public void setMes_de_nacimiento(int mes_de_nacimiento) {
        this.mes_de_nacimiento = mes_de_nacimiento;
    }

    public int getDía_de_nacimiento() {
        return día_de_nacimiento;
    }

    public void setDía_de_nacimiento(int día_de_nacimiento) {
        this.día_de_nacimiento = día_de_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Puntos getPunto() {
        return punto;
    }

    public void setPunto(Puntos puntos) {
        this.punto = puntos;
    }

    public Puntos getGames() {
        return games;
    }

    public void setGames(Puntos games) {
        this.games = games;
    }
 
    public void aumentar_Puntos() {
        if (punto.getPunto() == 0) {
            punto.setPunto(15);   
            Partido.cambiar_marcador();
            return;

        }
        if (punto.getPunto() == 15) {
            punto.setPunto(30);
            Partido.cambiar_marcador();
            return;

        }
        if (punto.getPunto() == 30) {
            punto.setPunto(40);
            Partido.cambiar_marcador();
            return;

        }
        if (punto.getPunto() == 40) {
            Partido.game_ganado();
            return;
        }
    }

    public void aumentar_games() {        
        punto.setGames(punto.getGames() + 1);
        Partido.cambiar_marcador();
        if (punto.getGames() == 6) {
            Partido.set_ganado();
            return;
        }
        return;
    }

    public void aumentar_sets() {
        punto.setSets(punto.getSets() + 1);
        Partido.cambiar_marcador();
        ganar();
    }

    public void ganar() {
        if (punto.getSets() == Partido.sets_max) {
            System.out.println("FINAL");
        }
    }

    public void jugados_ganados() {
        punto.setPuntos_jugados(punto.getPuntos_jugados() + 1);
        punto.setPuntos_ganados(punto.getPuntos_ganados() + 1);
    }
    
    public void vale_0(){
        punto.setPunto(punto.getPunto() - punto.getPunto());
        Partido.cambiar_marcador();
    }

    public void vale_0_games(){
        punto.setGames(punto.getGames() - punto.getGames());
        Partido.cambiar_marcador();
    }
    
    public void deuce(){
        Partido.aumentar_deuce();
    }
    
    public void deuce2(){
        Partido.aumentar_deuce2();
    }
    
    public void aumentar_games_por_deuce(){
        punto.setGames(punto.getGames() + 1);
        Partido.cambiar_marcador();
        if (punto.getGames() == 6) {
            Partido.set_ganado();
            return;
        }
        return;
    
    }
    
    public void aumentar_ventaja(){
        punto.setPunto(1);
    }
}
