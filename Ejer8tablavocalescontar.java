package Actividades;
import java.util.*;
public class Ejer8tablavocalescontar {

	public static void main(String[] args) {
		var sc= new Scanner(System.in); 
		 Random random = new Random();
	
		 char[] tablaDeVocales = new char[20];
		 int[] cont = new int[5];
		 char[] vocales = {'a', 'e', 'i', 'o', 'u'};
	
		 for (int i = 0; i < tablaDeVocales.length; i++) {
	            int index = random.nextInt(5);
	            tablaDeVocales[i] = vocales[index];
	            cont[index]++;
	        }
		 System.out.println("Tabla de vocales generada:");
	        for (char vocal : tablaDeVocales) {
	            System.out.print(vocal + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Frecuencia de las vocales:");
	        System.out.println("a: " + cont[0]);
	        System.out.println("e: " + cont[1]);
	        System.out.println("i: " + cont[2]);
	        System.out.println("o: " + cont[3]);
	        System.out.println("u: " + cont[4]);
	}

	
}