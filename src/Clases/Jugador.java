
package Clases;


public class Jugador {
    private String nombre;
    private int score;
    
    public Jugador(String nombre, int score){
        this.nombre = nombre;
        this.score = score;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}
