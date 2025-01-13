package Actividades;
import java.util.*;
public class Ejer7favoritos {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		final int tam=10;
		int fav[]=new int[tam];
		int n;
		do {
			System.out.println("Indique ek elemento a eliminar");
			n=sc.nextInt();
		if(n >= fav.length) {
			System.out.println("El elemento no existe");
		}else {
			fav=borrar(fav,n);
			System.out.println("La nueva tabla es: ");
			System.out.println(Arrays.toString(fav));
		}
		}while(fav.length !=0 && n>=0);
	}
	//----------------------------------------
	public static int[] borrar(int[] tabla, int ind) {
		int aux[]=new int[tabla.length-1];
		for(int i=0; i<ind;i++) {
			aux[i]=tabla[i];
		}
		for(int i=ind;i<aux.length;i++) {
			aux[i]=tabla[i+1];
		}
		return aux;
	}



}