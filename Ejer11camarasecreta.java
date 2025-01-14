package Actividades;
import java.util.*;

public class Ejer11camarasecreta {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Random random = new Random();

        // Solicitar la longitud de la combinación secreta
        System.out.print("Ingrese la longitud de la combinación secreta (de 1 a 5 dígitos): ");
        int longitud = sc.nextInt();

        // Validar la longitud ingresada
        if (longitud < 1 || longitud > 5) {
            System.out.println("Longitud inválida. Debe estar entre 1 y 5.");
            return;
        }

        // Generar la combinación secreta aleatoria
        int[] combinacionSecreta = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            combinacionSecreta[i] = random.nextInt(10); // Números aleatorios entre 0 y 9
        }

        System.out.println("¡Bienvenido a la Cámara Secreta!");
        int intentos = 0;
        boolean adivinada = false;

        // Iniciar el juego
        while (!adivinada) {
            intentos++;
            System.out.print("Ingrese su intento (combinación de " + longitud + " dígitos): ");
            String intento = sc.next();

            // Validar que el intento tenga la longitud correcta
            if (intento.length() != longitud) {
                System.out.println("El intento debe tener " + longitud + " dígitos.");
                continue;
            }

            // Convertir el intento a un arreglo de enteros
            int[] intentoNumeros = new int[longitud];
            for (int i = 0; i < longitud; i++) {
                intentoNumeros[i] = Character.getNumericValue(intento.charAt(i));
            }

            // Verificar el intento y dar pistas
            adivinada = true;
            for (int i = 0; i < longitud; i++) {
                if (intentoNumeros[i] > combinacionSecreta[i]) {
                    System.out.println("El dígito " + (i + 1) + " es mayor que el de la combinación secreta.");
                    adivinada = false;
                } else if (intentoNumeros[i] < combinacionSecreta[i]) {
                    System.out.println("El dígito " + (i + 1) + " es menor que el de la combinación secreta.");
                    adivinada = false;
                } else {
                    System.out.println("El dígito " + (i + 1) + " es correcto.");
                }
            }

            // Si la combinación fue adivinada
            if (adivinada) {
                System.out.println("¡Felicidades! Has adivinado la combinación secreta en " + intentos + " intentos.");
            }
        }
    }
}