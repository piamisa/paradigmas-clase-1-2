package Interface.parte1;

public class Entrenador extends SeleccionFutbol2 {
    private int dorsal;

    Entrenador(int id, String nombre, String apellidos, int edad, int dorsal) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
    }

    @Override
    public void entrenar() {
        System.out.println("Realiza un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificar Entrenamiento");
    }
}
