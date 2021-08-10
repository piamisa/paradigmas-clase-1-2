package Clases.parte1;
/*
 * Para crear una clase solo es necesario:
 *
 * class <class_name> {
 *     Atributos o Caracteristicas;
 *     metodos o Acciones;
 * }
 *
 * ----------------------------------------------
 *
 * Para instanciar una clase es necesario:
 *
 * ClassName nombre_objeto = new ClassName();
 *
 */

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal();
        perro.nombre = "Pancho";
        perro.anios = 4;

        Animal gato = new Animal();
        gato.nombre = "Paco";
        gato.anios = 3;

        perro.comer();
        gato.caminar();
    }
}
