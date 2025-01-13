package Actividades;
import java.util.*;
public class Ejer11camarasecreta {

	public static void main(String[] args) {
		var sc =new Scanner(System.in);
			Random random=new Random();
	
	 System.out.print("Ingrese la longitud de la combinación secreta (de 1 a 5 dígitos): ");
     int longitud = sc.nextInt();

       if (longitud < 1 || longitud > 5) {
            System.out.println("Longitud inválida. Debe estar entre 1 y 5.");
            return;
        }
	
	
	}
}
