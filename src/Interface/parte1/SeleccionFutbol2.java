package Interface.parte1;

abstract class SeleccionFutbol2 implements IntegranteSeleccionFutbol {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public SeleccionFutbol2(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void concentrarse() {
        System.out.println("Concentrarse (Clase Padre)");
    }

    public void viajar() {
        System.out.println("Viajar (Clase Padre)");
    }

    public void entrenar() {
        System.out.println("Entrenar (Clase Padre)");
    }

    public void jugarPartido() {
        System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
    }
}
