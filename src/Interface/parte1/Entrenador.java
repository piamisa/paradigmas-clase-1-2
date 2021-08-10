package Interface.parte1;

public class Entrenador extends SeleccionFutbol implements DeportistaInterface, IntegranteInterface {

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.setIdFederacion(idFederacion);
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
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