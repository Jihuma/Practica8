import java.util.HashMap;
import java.util.Map;
public class Torneo {
    private Map<Integer, Equipo> equipos;
    private String nombre, region;
    private int num_part, part_jug, part_pen;

    public Torneo(String nombre, String region, int participantes, int partidosjugados, int partidosperdidos){
        this.equipos = new HashMap();
        this.setnombre(nombre);
        this.setregion(region);
        this.setnum_part(participantes);
        this.setpart_jug(partidosjugados);
        this.setpart_pen(partidosperdidos);
        this.addequipos();
    }

    public void revisar_Nombres(String nombrearevisar){
        int contequ,contjug;
        if(!this.equipos.isEmpty()){
            for(contequ=0;contequ<this.num_part;contequ++){
                for(contjug=0;contjug<this.equipos.get(contequ).jugadores_registrados();contjug++){
                    if(nombrearevisar.equals(this.getnombre_jugador(contequ, contjug))){
                        Jugador crearjug = new Jugador(this.equipos.get(contequ).jugadores.get(contjug).getNumero(),
                                Captura.capturaString("Se encontro que el jugador " + this.equipos.get(contequ).jugadores.get(contjug).getNombre() + "Ya estaba registrado en otro equipo, ingresa un nombre valido "),
                                this.equipos.get(contequ).jugadores.get(contjug).getPuntos(),
                                this.equipos.get(contequ).jugadores.get(contjug).getPosicion(),
                                this.equipos.get(contequ).jugadores.get(contjug).getEstatura());
                        this.equipos.get(contequ).jugadores.replace(contjug, crearjug);
                    }
                }
            }
        }
    }
    public int getnumjugadores(int con){
        return this.equipos.get(con).jugadores_registrados();
    }
    public int getnumuniforme(int con1,int con2){
        return this.equipos.get(con1).getnum_uniforme(con2);
    }
    public String getnombre_jugador(int con1, int con2){
        return this.equipos.get(con1).getnombre_jug(con2);
    }
    public int getpuntos_equipos(int con){
        return this.equipos.get(con).puntos_anotados();
    }
    public String getnombre_equipo(int con){
        return this.equipos.get(con).getnombre();
    }
    public String getdivision(int con){
        return this.equipos.get(con).getdivision();
    }
    public String getnombre(){
        return this.nombre;
    }
    private void setnombre(String a){
        this.nombre = a;
    }
    public String getregion(){
        return this.region;
    }
    private void setregion(String a){
        this.region = a;
    }
    public int getnum_part(){
        return this.num_part;
    }
    private void setnum_part(int a){
        this.num_part = a;
    }
    public int getpart_jug(){
        return this.part_jug;
    }
    private void setpart_jug(int a){
        this.part_jug = a;
    }
    public int getpart_pen(){
        return this.part_pen;
    }
    private void setpart_pen(int a){
        this.part_pen = a;
    }
    private void addequipos(){
        int cont;
        for (cont=0;cont<this.getnum_part();cont++){
            Equipo crearequipo = new Equipo(Captura.capturaString("Nombre del equipo"),
                    Captura.capturaString("Division"),
                    Captura.capturaString("Entrenador"),
                    Captura.capturaEntero("Torneos participados"),
                    Captura.capturaEntero("Torneos ganados"),
                    Captura.capturaEntero("Torneos perdidos"),
                    Captura.capturaEntero("Cantidad de jugadores a registrar"),
                    this.num_part);
            this.equipos.put(cont,crearequipo);
        }
    }
}