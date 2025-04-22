package Controllers;

import Models.Persona;

public class PersonaController {

    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona actual = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }

            personas[j + 1] = actual;
        }
    }
    
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        for (Persona persona : personas) {
            if (persona.getEdad() == edad) {
                return persona;
            }
        }
        return null;
    }
}
