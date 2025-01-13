package Actividades;
import java.util.*;
public class Ejer10parinpar {

	public static void main(String[] args) {
		var sc =new Scanner(System.in);
		
		 
        System.out.print("¿Cuántos números deseas ingresar? ");
        int n = sc.nextInt();
        
        int[] num = new int[n];
        
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
        	num[i] = sc.nextInt();
        }
 
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
            	contPares++;
            } else {
            	contImpares++;
            }
        }
      
        int[] Pares = new int[contPares];
        int[] Impares = new int[contImpares];

        // Llena los arrays de números pares e impares
        int indexPares = 0;
        int indexImpares = 0;

        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
            	Pares[indexPares++] = num[i];
            } else {
            	Impares[indexImpares++] = num[i];
            }
        }
  
        System.out.println("Números pares:");
        for (int num1 : Pares) {
            System.out.print(num1 + " ");
        }
        System.out.println();

        System.out.println("Números impares:");
        for (int num1 : Pares) {
            System.out.print(num1 + " ");
        }
    }
}
