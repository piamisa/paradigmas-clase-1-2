package Abstracion.parte1;

public class Auto extends Veiculo {
    private int puertas;

    public Auto(String color, String marca, int puertas) {
        super(color, marca);
        this.puertas = puertas;
    }
    public void imprirPuertas() {
        System.out.println("Cantidad de puertas: " + puertas);
    }
}
