package Interface.parte1;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("Da una entrevista");
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido() {

    }
}
