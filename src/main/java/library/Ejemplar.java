package library;

public class Ejemplar {
    private int codEjemplar;
    private boolean prestado;
    private GenericLinkedList<Abonado> prestadoA;

    public Ejemplar(){
        this.codEjemplar=(int)(Math.random()*10000);
        prestado = false;
        prestadoA = new GenericLinkedList<Abonado>();
    }

    public int getCodEjemplar() {
        return codEjemplar;
    }

    public boolean isPrestado(){return prestado;}

    public GenericLinkedList<Abonado> getPrestadoA() {
        return prestadoA;
    }

    @Override
    public String toString(){
        return "Cod.Ejemplar: "+this.codEjemplar+"   Prestado: "+prestado+"   Prestado a: "+getPrestadoA();
    }

}