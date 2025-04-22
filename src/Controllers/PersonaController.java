package Controllers;

import Models.Persona;

public class PersonaController {

    /**
     * Ordena un arreglo de Persona por edad utilizando el algoritmo de inserción.
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona actual = personas[i];
            int j = i - 1;

            // Mover elementos mayores a la edad actual hacia la derecha
            while (j >= 0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = actual;
        }
    }

    /**
     * Busca la primera persona con una edad específica.
     * 
     * @param personas Array donde buscar.
     * @param edad     Edad objetivo.
     * @return La primera Persona con la edad especificada, o null si no se encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        for (Persona persona : personas) {
            if (persona.getEdad() == edad) {
                return persona;
            }
        }
        return null;
    }
}
