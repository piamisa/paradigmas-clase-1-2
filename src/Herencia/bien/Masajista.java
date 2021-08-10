package Herencia.bien;

public class Masajista extends SeleccionFutbol{
    private String Titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String Titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
		//TODO
    }
}
