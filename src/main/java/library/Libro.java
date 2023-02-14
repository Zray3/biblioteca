package library;

public class Libro extends Publication{
    private String autor;
    private String isbn;
    private GenericLinkedList<Ejemplar> ejemplares = new GenericLinkedList<Ejemplar>();

    public Libro(String editor, int numPag, boolean color, String autor, String isbn) {

        super(editor, numPag, color);
        this.autor = autor;
        this.isbn = isbn;

    }
    public void anadirPublicacion(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
         return isbn;
    }

    public GenericLinkedList getEjemplares() {
        return ejemplares;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        return "Autor: "+this.autor+"   ISBN: "+this.isbn+"   Ejemplares: "+getEjemplares();
    }

}
