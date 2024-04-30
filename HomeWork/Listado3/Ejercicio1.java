/*
Escriba una aplicación que encuentre el menor de varios enteros. Suponga que el primer valor leído
especifica la cantidad de valores que el usuario introducirá (dicho valor pudiera ser cero). Si el usuario
ingresa un valor negativo se le debe solicitar nuevamente hasta que ingrese un valor no negativo.
 */

import java.util.Scanner;
 public class Ejercicio1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        int cant, menor,num, i=1;
        cant = sc.nextInt();
        while (cant < 1){
            System.out.println("Ingrese una cantidad mayor que 0");
            cant = sc.nextInt();
        }

        menor = sc.nextInt();

        while (i < cant){
            num = sc.nextInt();
            if (num<menor){
                menor = num;
            }
            i += 1;
        }
     
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
