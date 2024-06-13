/*
Dadas las edades de tres personas, determinar el promedio de ellas. 
Dicho promedio debe ser presentado como un número decimal y como un entero.
 */

import java.util.Scanner;
public class Parte3Ej1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int edad1,edad2, edad3, prom;
        float dProm;

        // Read the user input
        edad1 = sc.nextInt();
        edad2 = sc.nextInt();
        edad3 = sc.nextInt();

        // Calculate the int prom and float prom
        prom = (edad1 + edad2 + edad3)/3;
        dProm = (edad1 + edad2 + edad3)/(float)3;

        // Print out the results
        System.out.println(prom);
        System.out.println(dProm);
    }
}