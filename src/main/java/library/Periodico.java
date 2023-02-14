package library;

public class Periodico extends Publication {

    private String nombre;
    private int publicacion;

    public Periodico(String editor, int numPag, boolean color, String nombre, int publicacion) {
        super(editor, numPag, color);
        this.nombre=nombre;
        this.publicacion=publicacion;
    }

}
