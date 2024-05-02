/*Escriba distintas versiones de un programa Java que calcule el producto de los enteros impares de 1 al 75.
Cada versión debe usar un ciclo iterativo distinto para el cálculo. */

import java.util.Scanner;
class Ejercicio2a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = 1, mul=1;

        while (num <= 75){
            mul *= num;
            num +=2;
        }
        System.out.println(mul);
        sc.close();
                        
    }
}

class Ejercicio2b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // num = 1, 1 es el primer impar 1,3,5,7
        long num = 1, mul=1;

        do{
            mul *= num;
            num +=2;
        }while (num <= 75);

        System.out.println(mul);
        sc.close();
    }   
}
