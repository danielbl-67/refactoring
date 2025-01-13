package Actividades;

import java.util.Random;
import java.util.Scanner;

public class Ejer11CámaraSecreta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la longitud de la combinación secreta (de 1 a 5 dígitos): ");
        int longitud = sc.nextInt();

        if (longitud < 1 || longitud > 5) {
            System.out.println("Longitud inválida. Debe estar entre 1 y 5.");
            sc.close();
            return;
        }

        String combinacionSecreta = generarCombinacionSecreta(longitud, random);
        System.out.println("¡La combinación secreta ha sido generada!");
        System.out.println("Combinación: " + combinacionSecreta); // Para propósitos de depuración

        sc.close();
    }

    /**
     * Genera una combinación secreta de dígitos aleatorios de la longitud especificada.
     *
     * @param longitud La longitud de la combinación.
     * @param random   El objeto Random utilizado para generar los dígitos.
     * @return Una cadena que representa la combinación secreta.
     */
    private static String generarCombinacionSecreta(int longitud, Random random) {
        StringBuilder combinacion = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int digito = random.nextInt(10); // Genera un número entre 0 y 9
            combinacion.append(digito);
        }

        return combinacion.toString();
    }
}

