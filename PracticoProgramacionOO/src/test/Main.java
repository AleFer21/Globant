package test;

import practicoprogramacionoo.*;

public class Main {

    public static void main(String[] args) {

        Uruguayo uruguayo = new Uruguayo("Juan", "Perez", 28, "Masculino", 10574263, "Canelones", "Artigas");
        uruguayo.imprimirInfo();
        uruguayo.mudarse("Punta del Este", "Suarez");
        uruguayo.imprimirInfo();

        Persona persona = new Uruguayo("Edison", "Cavani", 34, "Masculino", 1479358, "Salto", "Durazno");
        Persona persona1 = new Chileno("Alexis", "Sanchez", 26, "Masculino", 12751884, "Antofagasta", "Mapuche");
        Persona persona2 = new Persona("Alicia", "Soto", 32, "Femenino");

        soyUruguayoOChileno(persona);
        soyUruguayoOChileno(persona1);
        soyUruguayoOChileno(persona2);

        Perro perro = new Perro("Tifon", "Pug", 12, "Macho");
        Chileno chileno = new Chileno("Arturo", "Vidal", 30, "Masculino", 1195364, "Centro", "Providencia");

        perro.esAdulto();
        chileno.esAdulto();

    }

    public static void soyUruguayoOChileno(Persona persona) {
        if (persona instanceof Uruguayo) {
            System.out.println("True");
        }
        if (persona instanceof Chileno) {
            System.out.println("True");
        }
        if (persona instanceof Chileno) {
            System.out.println("False");
        }
    }
}
