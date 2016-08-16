
public class Jugador {

    public String nombre;
    public String apellido;
    public int año_de_nacimiento;
    public int mes_de_nacimiento;
    public int día_de_nacimiento;
    public String nacionalidad;
    public Float altura;
    public Float peso;
    private Puntos2 puntos;
    private Puntos2 games;

    //EL JUGADOR TIENE SU PROPIO MARCADOR DONDE SE VEN REFLEJADOS LOS PUNTOS QUE HAYA ANOTADO.
    
    public Jugador() {
    }

    public Jugador(String nombre, Puntos2 puntos,Puntos2 games, String apellido, int año_de_nacimiento, int mes_de_nacimiento, int día_de_nacimiento, String nacionalidad, Float altura, Float peso) {
        this.nombre = nombre;
        this.año_de_nacimiento = año_de_nacimiento;
        this.mes_de_nacimiento = mes_de_nacimiento;
        this.día_de_nacimiento = día_de_nacimiento;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.altura = altura;
        this.peso = peso;
        this.puntos = new Puntos2();
        this.games = new Puntos2();
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

    public Puntos2 getPuntos() {
        return puntos;
    }

    public void setPuntos2(Puntos2 puntos) {
        this.puntos = puntos;
    }

    public Puntos2 getGames2() {
        return games;
    }

    public void setGames2(Puntos2 games) {
        this.games = games;
    }
    
    
    public void aumentar_Puntos() {
        int puntos_aux = 0 ;
        if (puntos.getPuntos() == puntos_aux) {
            puntos.setPuntos(15);

        }
        if (puntos.getPuntos() == 15) {
            puntos.setPuntos(puntos.getPuntos() + 15);

        }
        if (puntos.getPuntos() == 30) {
            puntos.setPuntos(puntos.getPuntos() + 10);

        }
        if (puntos.getPuntos() == 40) {
            aumentar_games();
        }
    }

    public void aumentar_games() {        
        puntos.setGames(puntos.getGames() + 1); 
        puntos.setPuntos(puntos.getPuntos() - puntos.getPuntos());
        if (puntos.getGames() == 6) {
            aumentar_sets();
        }
        
    }

    public void aumentar_sets() {
        
        puntos.setGames(puntos.getGames() - puntos.getGames());
        puntos.setPuntos(puntos.getPuntos() - puntos.getPuntos());
        puntos.setSets(puntos.getSets() - puntos.getSets());
        ganar();
    }

    public void ganar() {
        if (puntos.getSets() == Partido.sets_max) {
            System.out.println("FINAL");
        }
    }

    public void jugados_ganados() {
        puntos.setPuntos_jugados(puntos.getPuntos_jugados() + 1);
        puntos.setPuntos_ganados(puntos.getPuntos_ganados() + 1);
    }
    
    public void saber_puntos(){
        System.out.println(puntos.getPuntos() + "");
    }

}
