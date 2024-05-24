/* Construya un programa Java que lea el primer nombre de dos personas y sus edades y, a
continuación, despliegue el nombre de la persona (con la primera letra en mayúscula y el resto en
minúsculas) que es menor. Si ambas personas tienen igual edad debe desplegar un mensaje
indicando esta situación.
Incluya mensajes claros al usuario. Suponga que los datos leídos son siempre válidos.
Indicación: Tome en cuenta las operaciones con strings explicadas en la Parte I de este
laboratorio.
Pruebe que su programa es correcto, ejecutándolo para distintos casos. Por ejemplo:
• La primera persona es menor.
• La segunda persona es menor.
• Las dos personas tienen la misma edad.*/

import java.util.Scanner;

public class Edades{
	
	public static void main(String[] args){
		
		String nombre1, nombre2, restoPal;
		char primerChar;
		
		int edad1, edad2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese los nombre y edad de la persona 1");
		nombre1 = sc.next();
		edad1 = sc. nextInt();
		
		System.out.println("Ingrese los nombre y edad de la persona 2");
		nombre2 = sc.next();
		edad2 = sc.nextInt();
		
		
		nombre1 = nombre1.toUpperCase();
		primerChar = nombre1.charAt(0);
		restoPal = nombre1.substring(1);
		restoPal = restoPal.toLowerCase();
		nombre1 = primerChar+restoPal;
		
		nombre2 = nombre2.toUpperCase();
		primerChar = nombre2.charAt(0);
		restoPal = nombre2.substring(1);
		restoPal = restoPal.toLowerCase();
		nombre2 = primerChar + restoPal;
		
		
		if (edad1 < edad2){
			System.out.println(nombre1);
		}else if (edad2 < edad1){
			System.out.println(nombre2);
		}else{
			System.out.println("Las edades son iguales");
		}
		
		
		
		System.out.println("Damn I'm good");
	}
}
