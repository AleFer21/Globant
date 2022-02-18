package practicoprogramacionbasica;

import java.util.Scanner;

public class PracticoProgramacionBasica {

    //Ejercicio 11
    public static int ejerciciosEjecutados[] = {6, 7, 8, 9, 10};

    public static void main(String[] args) {

        //Ejercicio 1
        char persona = 'F';
        System.out.println("El sexo es masculino o femenino? " + sexoPersona(persona));

        //Ejercicio 2
        int arreglo[] = {7, 1, 9, 4, 6};
        int suma = arreglo[2] + arreglo[3] + arreglo[4];
        System.out.println("La suma es par? " + arregloPar(suma));

        //Ejercicio 3
        int enteros[] = {1, 3, 5};
        System.out.println("El arreglo contiene al menos un numero par? " + contienePar(enteros));

        //Ejercicio 4
        var palabra1 = "barco";
        var palabra2 = "barco";
        System.out.println("Las dos palabras son iguales? " + palabrasIguales(palabra1, palabra2));

        //Ejercicio 5
        int numero = 12321;
        System.out.println("El numero es capicua? " + numeroCapicua(numero));

        //Ejercicio 6
        int a = 5;
        int b = 2;
        System.out.println("Es a menor que b? " + esMenor(a, b));

        //Ejercicio 7
        System.out.println("La multiplicacion es igual a la division? " + esIgual(a, b));

        //Ejercicio 8
        int arregloA[] = {4, 6, 9, 2, 1, 3};
        int arregloB[] = {11, 5, 6, 7, 4, 8};
        System.out.println("Los arreglos contienen al menos dos numeros iguales? " + numerosIguales(arregloA, arregloB));

        //Ejercicio 9 
        String palabra = "Al reves";
        StringBuilder sb = new StringBuilder(palabra);
        System.out.println(sb.reverse());

        //Ejercicio 10
        String texto = "Verde";
        System.out.println(texto.replace('e', 'x'));

        //Ejercicio 12
        System.out.println("Imprimir los ultimos cinco ejercicios dados: ");
        System.out.println("Es a menor que b? " + esMenor(a, b));
        System.out.println("La multiplicacion es igual a la division? " + esIgual(a, b));
        System.out.println("Los arreglos contienen al menos dos numeros iguales? " + numerosIguales(arregloA, arregloB));
        System.out.println(sb.reverse());
        System.out.println(texto.replace('e', 'x'));

    }

    //Ejercicio 1
    public static boolean sexoPersona(char persona) {

        if (persona == 'F') {
            return true;
        } else if (persona == 'M') {
            return true;
        }
        return false;
    }

    //Ejercicio 2
    public static boolean arregloPar(int suma) {

        if (suma % 2 == 0) {
            return true;
        }
        return false;
    }

    //Ejercicio 3
    public static boolean contienePar(int enteros[]) {

        int contPar = 0;
        for (int i = 0; i < 3; i++) {
            if (enteros[i] % 2 == 0) {
                contPar++;
                if (contPar != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    //Ejercicio 4
    public static boolean palabrasIguales(String palabra1, String palabra2) {

        if (palabra1 == palabra2) {
            return true;
        }
        return false;
    }

    //Ejercicio 5
    public static boolean numeroCapicua(int numero) {

        String capicua = String.valueOf(numero);

        for (int i = 0, j = capicua.length() - 1; i <= j; i++, --j) {
            if (capicua.charAt(i) != capicua.charAt(j)) {
                return false;
            }
        }
        return true;

    }

    //Ejercicio 6
    public static boolean esMenor(int a, int b) {

        if (a < b) {
            return true;
        }
        return false;
    }

    //Ejercicio 7
    public static boolean esIgual(int a, int b) {

        if (a * b == a / b) {
            return true;
        }
        return false;
    }

    //Ejercicio 8
    public static boolean numerosIguales(int arregloA[], int arregloB[]) {

        int contIguales = 0;
        for (int i = 0; i < 6; i++) {
            if (arregloA[i] == arregloB[i]) {
                contIguales++;
                if (contIguales >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

}
