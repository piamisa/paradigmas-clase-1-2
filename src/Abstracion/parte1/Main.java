package Abstracion.parte1;

import javax.management.openmbean.ArrayType;
import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList();

        //Declaro el objeto
        Veiculo fitito = new Auto("amarillo", "volkswagen", 3);
        veiculos.add(fitito);

        // Declaro en el constructor el objeto
        veiculos.add(new Bicicleta("roja", "montagne", 28));

        for (Veiculo obj: veiculos) {
            obj.arrancar();
            obj.acelerar();
            obj.frenar();
            System.out.println("---------------- \n");
        }
    }
}
