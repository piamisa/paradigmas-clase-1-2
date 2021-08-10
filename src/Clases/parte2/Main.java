package Clases.parte2;

public class Main {
    public static void main(String[] args) {
        Banco bbva = new Banco();
        bbva.operar();
        bbva.depositosTotales();

        //Ejercicio2
        JuegoDeDados juego1 = new JuegoDeDados();
        juego1.jugar();
    }
}
