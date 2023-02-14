package library;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro elCamino = new Libro("El amigo de Brandon", 1195, false, "Brandon Sanderson", "123456789P");
        Libro hijosDeLaBruma = new Libro("El amigo de Brandon", 1195, false, "Brandon Sanderson", "098765431H");
        Revista hola = new Revista("Pedro el vagabundo", 50,true, "HOLA", "Actualidad", Revista.Periodo.SEMANAL);
        Periodico elEspanyol = new Periodico("Felipe VI", 69, true,"El Espanyol", 23322);

        Abonado juja = new Abonado("El Juja");
        Abonado alex = new Abonado("Alexelcapo");
        Abonado rehen = new Abonado("Ayuda, me han secuestrado, me obligan a escribir este codigo, llamad a mi familia a XXX-XX-XX-XX");

        biblioteca.anadirPublicacion(elCamino);
        biblioteca.anadirPublicacion(hijosDeLaBruma);
        biblioteca.anadirPublicacion(hola);
        biblioteca.anadirPublicacion(elEspanyol);
        biblioteca.bajaPublicacion(elEspanyol);

        biblioteca.anadirAbonado(juja);
        biblioteca.anadirAbonado(alex);
        biblioteca.bajaAbonado(juja);
        biblioteca.anadirAbonado(rehen);

        rehen.setNombre("NO HAGAS CASO, HA SIDO EL AUTOCORRECTOR :)");
        biblioteca.mostrarPublicaciones();


    }
}
