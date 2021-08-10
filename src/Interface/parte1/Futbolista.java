package Interface.parte1;

public class Futbolista extends SeleccionFutbol implements DeportistaInterface, IntegranteInterface {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido() {

    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar() {

    }
}
