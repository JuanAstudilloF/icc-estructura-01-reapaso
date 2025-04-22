package main;

import Controllers.PersonaController;
import Models.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonaController controller = new PersonaController();

        System.out.print("cuantas personas deseas ingresar");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("persona #" + (i + 1));
            System.out.print("nombre ");
            String nombre = scanner.nextLine();
            System.out.print("edad ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            personas[i] = new Persona(nombre, edad);
        }

        System.out.println("personas antes de ordenar por edad ");
        for (Persona p : personas) {
            System.out.println(p);
        }

        controller.ordenarPorEdad(personas);

        System.out.println("personas despues de ordenar por edad ");
        for (Persona p : personas) {
            System.out.println(p);
        }

        System.out.print("ingrese la edad que desea buscar ");
        int edadBuscada = scanner.nextInt();

        Persona resultado = controller.buscarPorEdad(personas, edadBuscada);

        System.out.println("resultado de la busqueda por edad (" + edadBuscada + "):");
        if (resultado != null) {
            System.out.println(resultado);
        } else {
            System.out.println("no se encontro ninguna persona con esa edad ");
        }

        scanner.close();
    }
}

