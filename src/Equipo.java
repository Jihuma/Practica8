import java.util.HashMap;
import java.util.Map;

public class Equipo {
    public Map<Integer,Jugador> jugadores;
    private String nombre, division, entrenador;
    private int torn_part,torn_gan,torn_perd, num_jug,num_equ;

    public Equipo(String nombre, String division, String entrenador, int torpar, int torgan, int torper, int numjug,int numequ){
        this.jugadores = new HashMap();
        this.setnombre(nombre);
        this.setdivision(division);
        this.setentrenador(entrenador);
        this.settorn_part(torpar);
        this.settorn_gan(torgan);
        this.settorn_perd(torper);
        this.setnum_jug(numjug);
        this.setnum_equ(numequ);
        this.addjugador();
    }

    private void setnum_equ(int numeq){
        this.num_equ = numeq;
    }

    private void setnum_jug(int numjug){
        this.num_jug = numjug;
    }

    private void setnombre(String nombre){
        this.nombre = nombre;
    }

    private void setdivision(String division){
        this.division = division;
    }

    private void setentrenador(String entrenador){
        this.entrenador = entrenador;
    }
    private void settorn_part(int tornpart){
        this.torn_part = tornpart;
    }

    private void settorn_gan(int torngan){
        this.torn_gan = torngan;
    }

    private void settorn_perd(int tornperd){
        this.torn_perd = tornperd;
    }

    private int getnum_jug(){
        return this.num_jug;
    }

    public int getnum_uniforme(int nuniforme){
        return jugadores.get(nuniforme).getNumero();
    }

    public String getnombre_jug(int nombrejug){
        return jugadores.get(nombrejug).getNombre();
    }

    public String getnombre(){
        return this.nombre;
    }

    public String getdivision(){
        return this.division;
    }

    public String getentrenador(){
        return this.entrenador;
    }

    public void gettorn_part(int tornpart){
        this.torn_part = tornpart;
    }

    public int gettorn_part(){
        return this.torn_part;
    }

    public void gettorn_gan(int torngan){
        this.torn_gan = torngan;
    }

    public int gettorn_gan(){
        return this.torn_gan;
    }

    public void gettorn_perd(int tornperd){
        this.torn_perd = tornperd;
    }

    public int gettorn_perd(){
        return this.torn_perd;
    }

    public int jugadores_registrados(){
        return jugadores.size();
    }

    private void addjugador(){
        int i;
        for (i=0; i<this.getnum_jug(); i++){
            Jugador crearjug = new Jugador(this.revisar_num_uniforme(i, Captura.capturaEntero("Numero de uniforme")),
                    Captura.capturaString("Nombre del jugador"),
                    Captura.capturaEntero("Puntos anotados"),
                    Captura.capturaString("Posicion"),
                    Captura.capturaFloat("Estatura"));
            this.jugadores.put(i,crearjug);
        }
    }

    public int revisar_num_uniforme(int jug, int numuni){
        int m;
        if(this.jugadores.isEmpty()){
            return numuni;
        }
        else{
            for(m = 0; m<this.jugadores_registrados(); m++){
                if(numuni == this.jugadores.get(m).getNumero()){
                    numuni = Captura.capturaEntero("Numero de jugador ya existente, elige oto");
                }
            }
        }
        return numuni;
    }

    public int puntos_anotados(){
        int cuenta = 0, cont, jug;
        jug = this.jugadores_registrados();
        for (cont = 0; cont<jug; cont++){
            cuenta += this.jugadores.get(cont).getPuntos();
        }
        return cuenta;
    }
}