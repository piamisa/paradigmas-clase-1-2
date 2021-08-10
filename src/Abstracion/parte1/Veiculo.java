package Abstracion.parte1;

abstract class Veiculo {
    private String color;
    private String marca;

    public Veiculo(String color, String marca) {
        color = color;
        marca = marca;
    }

    public void arrancar() {
        System.out.println("Como diria fonsi... despacito");
    }

    public void acelerar() {
        System.out.println("Run Forest run!!!");
    }

    public void frenar() {
        System.out.println("dont stop me now!!!");
    }
}
