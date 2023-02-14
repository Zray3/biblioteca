package library;

public class Abonado {
    private String nombre;
    private Ejemplar[] prestamos;
    private int aux;

    public Abonado(String nombre){
        this.nombre=nombre;
        this.aux=0;
        this.prestamos = new Ejemplar[3];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrestamos(Ejemplar[] prestamos) {
        this.prestamos = prestamos;
    }
    public boolean darEjemplar(Libro libro){
        aux--;
        do{
            aux++;
            if (prestamos[aux]==null){

                prestamos[aux]= new Ejemplar();
                libro.anadirPublicacion(prestamos[aux]);
                return true;
            }
        }while(aux==2);
        return false;
    }

    public boolean Devolver(Ejemplar ejemplar){
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i].getCodEjemplar()==ejemplar.getCodEjemplar()){
                prestamos[i]=null;
                return true;
            }
        }
        return false;
    }

    public void AnadirEjemplar(){
        if(aux<3) {
            prestamos[aux] = new Ejemplar();
            aux++;
        }
    }
    @Override
    public String toString(){
        String aux = "";
        for (int i = 0; i < prestamos.length; i++) {
            aux = aux + prestamos.toString()+" ";
        }
        return "Nombre: "+this.nombre+"   Prestamos: "+aux;

    }

}
