package library;

public class Revista extends Publication {
    private String nombre;
    private String tematica;
    private Periodo periodo;

    public Revista(String editor, int numPag, boolean color, String nombre, String tematica, Periodo periodo) {
        super(editor, numPag, color);
        this.nombre=nombre;
        this. tematica=tematica;
        this.periodo=periodo;
    }



    public enum Periodo {
        SEMANAL("semanal"),
        MENSUAL("mensual"),
        TRIMESTRAL("trimestral");
        private Periodo(String trimestral) {
        }
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"   Tematica: "+this.tematica+"   Periodo: "+this.periodo;
    }

}
