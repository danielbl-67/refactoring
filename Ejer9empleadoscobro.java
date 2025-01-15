package Actividades;
import java.util.*;
public class Ejer9empleadoscobro {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
        String[] emp = {
            "Juan", "Ana", "Luis", "Carlos", "María", "Pedro",
            "Laura", "José", "Sofía", "David",
            "Marta", "Antonio", "Rosa", "Carlos", "Elena",
            "Raúl", "Susana", "Pablo", "Sandra", "Daniel",
            "Javier", "Beatriz", "Alberto", "Felipe", "Cristina",
            "Mónica", "Tomás", "Luis", "Victor", "Nuria", "Paula"
        };
        int[] horas = {
            160, 150, 145, 170, 160, 155, 148, 160, 162, 158,
            150, 165, 170, 145, 160, 155, 148, 162, 160, 155,
            167, 155, 153, 168, 160, 162, 155, 150, 159, 168
        };

        int salHora = 20;
        int salMax = horas[0] * salHora;
        int salMin = salMax;
        String empMax = emp[0];
        String empMin = emp[0];

        System.out.println("Salario de los empleados:");

        for (int i = 0; i < emp.length; i++) {
            int salario = horas[i] * salHora;
            System.out.println(emp[i] + ": " + salario + " €");

            if (salario > salMax) {
                salMax = salario;
                empMax = emp[i];
            }
            if (salario < salMin) {
                salMin = salario;
                empMin = emp[i];
            }
        }

        System.out.println("Empleado que más gana: " + empMax + " con " + salMax + " €");
        System.out.println("Empleado que menos gana: " + empMin + " con " + salMin + " €");
    }
}