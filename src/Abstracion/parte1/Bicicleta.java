package Abstracion.parte1;

public class Bicicleta extends Veiculo {
    private int rodado;

    public Bicicleta(String color, String marca, int rodado) {
        super(color, marca);
        this.rodado = rodado;
    }
    public void imprirRodado() {
        System.out.println("El rodado es: " + rodado);
    }
}
