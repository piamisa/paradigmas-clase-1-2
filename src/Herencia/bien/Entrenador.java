package Herencia.bien;

public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
		//TODO
    }

    public void dirigirEntreno() {
		//TODO
    }
}
