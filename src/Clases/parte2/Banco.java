package Clases.parte2;

public class Banco {
    //TODO: Atributos privados
    private Cliente cliente1, cliente2, cliente3;

    //TODO: Constructor
    public Banco() {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Ana");
        cliente3 = new Cliente("Pedro");
    }

    //TODO: Metodos public

    /**
     * @name: operar
     * @description: Funcion que deposita montos en la cuenta
     * Tambien se extrae dinero
     */
    public void operar() {
        cliente1.depositar(100);
        cliente2.depositar(150);
        cliente3.depositar(200);
        cliente3.extraer(150);
    }

    /**
     * @description: Funcion que imprimira el monto del banco y de cada cliente
     */
    public void depositosTotales () {
        int totales = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
        System.out.println ("El total de dinero en el banco es:" + totales);

        //Imprimir totales de los clientes
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }
}
