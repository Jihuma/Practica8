public class Jugador {
    private int numero, puntos;
    private String nombre, posicion;
    private float estatura;

    public Jugador(int numero, String nombre, int puntos, String posicion, float estatura){
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setPuntos(puntos);
        this.setPosicion(posicion);
        this.setEstatura(estatura);
    }

    private void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    private void setPuntos(int puntos){
        this.puntos = puntos;
    }

    public int getPuntos(){
        return this.puntos;
    }

    private void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public String getPosicion(){
        return this.posicion;
    }

    private void setEstatura(float estatura){
        this.estatura = estatura;
    }

    public float getEstatura(){
        return this.estatura;
    }
}