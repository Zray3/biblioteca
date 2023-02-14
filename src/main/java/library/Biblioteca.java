package library;

public class Biblioteca {

    private GenericLinkedList<Abonado> abonados;
    private GenericLinkedList<Publication> publicaciones;

    public Biblioteca(){
        abonados = new GenericLinkedList<>();
        publicaciones = new GenericLinkedList<>();
    }

    public GenericLinkedList<Abonado> getAbonados() {
        return abonados;
    }

    public GenericLinkedList<Publication> getPublicaciones() {
        return publicaciones;
    }

    public void anadirPublicacion(Publication publication){
        this.publicaciones.add(publication);
        publicaciones.add(publication);
    }
    public void bajaPublicacion(Publication publication){
        publicaciones.remove(publicaciones.search(publication));
    }
    public void anadirAbonado(Abonado abonado){
        abonados.add(abonado);
    }
    public void bajaAbonado(Abonado abonado){
        abonados.remove(abonados.search(abonado));
    }

    public void mostrarPublicaciones(){
        System.out.println(publicaciones);
    }

    public void mostrarAbonados(){
        System.out.println(abonados);
    }

}
