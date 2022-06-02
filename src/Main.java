public class Main {
    public static void main(String[] args) {
        int i,j;

        Torneo Nba = new Torneo(Captura.capturaString("Nombre del torneo"),
                Captura.capturaString("Region"),
                Captura.capturaEntero("Cantidad de equipos que jugaran"),
                Captura.capturaEntero("Partidos jugados"),
                Captura.capturaEntero("Partidos por jugar"));

        System.out.println("Torneo: " + Nba.getnombre());
        System.out.println("Region: " + Nba.getregion());
        System.out.println("Numero de participantes: " + Nba.getnum_part());
        System.out.println("Partidos jugados: " + Nba.getpart_jug() + "partidos");
        System.out.println("Partidos por jugar: " + Nba.getpart_pen() + "partidos");

        for(i=0; i<Nba.getnum_part(); i++){
            System.out.println("\nEquipo: " + Nba.getnombre_equipo(i));
            System.out.println("Division: " + Nba.getdivision(i));
            System.out.println("Puntos anotados: " + Nba.getpuntos_equipos(i) + "puntos");
            System.out.println("Tiene registrados a: " + Nba.getnumjugadores(i) + "jugadores");

            for(j = 0; j<Nba.getnumjugadores(i); j++){
                System.out.println("Numero: " + Nba.getnumuniforme(i, j) + " " +  Nba.getnombre_jugador(i, j) + "\n\n");
            }
        }
    }
}