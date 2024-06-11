/* 
En un casino se ofrecen 3 distintos platos para el almuerzo de cada día. Se desea construya un
programa Java que procese la venta de almuerzos del día y presente el número de unidades
vendidas por plato, ordenados de mayor a menor. Si dos o más platos tienen la misma cantidad
de unidades, entonces se deben presentar ordenados según número del plato.
La secuencia de datos corresponde al número de cada plato vendido (1, 2 o 3) y finaliza cuando
se ingresa el valor 0 dos veces. Por ejemplo, una secuencia sería: 3 3 2 1 3 1 0 2 3 3 2 2 2 1 2 1 3
1 0 0
Y el resultado debería presentarse del siguiente modo:
Unidades vendidas del plato 2: 6
Unidades vendidas del plato 3: 6
Unidades vendidas del plato 1: 5
Debe validar que los datos sean correctos, es decir que el número de cada plato se encuentre en
el rango 1 a 3. Recuerde que solo un doble cero significa término de la secuencia de datos.
*/

import java.util.Scanner;
public class Ejercicio1P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int plato, plato1=0,plato2=0,plato3=0;

        plato = sc.nextInt();


        // caso 2ble 0
        if(plato == 0){
            plato = sc.nextInt();
        }
        while (plato != 0 && (plato < 1 || plato >3)){
            plato = sc.nextInt();
        }

        // leer hasta 2ble 0
        while (plato != 0){
            if(plato == 1){
                plato1++;
            }else if(plato == 2){
                plato2++;
            }else if(plato == 3){
                plato3++;
            }
            plato = sc.nextInt();
            if (plato == 0){
                plato = sc.nextInt();
            }
        }
        

        

        if ((plato1 > plato2 && plato1 > plato3)||(plato1 == plato2 && plato1 > plato3)){
            System.out.println("Plato 1: " + plato1);

            if (plato3 > plato2){
                System.out.println("Plato 3: " + plato3); 
                System.out.println("Plato 2: " + plato2);
            }else{
                System.out.println("Plato 2: " + plato2);
                System.out.println("Plato 3: " + plato3);
            }

        } else if ((plato2 > plato1 && plato2 > plato3)||(plato2 == plato3 && plato2>plato1)){
            System.out.println("Plato 2: " + plato2);

            if (plato3 > plato1){
                System.out.println("Plato 3: " + plato3);
                System.out.println("Plato 1: " + plato1);
            }else{
                System.out.println("Plato 1: " + plato1);
                System.out.println("Plato 3: " + plato3);
            }
            
        }else if (plato3 > plato1 && plato3 > plato2){
            System.out.println("Plato 3: " + plato3);

            if (plato2 > plato1){
                System.out.println("Plato 2: " + plato2);
                System.out.println("Plato 1: " + plato1);
            }else{
                System.out.println("Plato 1: " + plato1);
                System.out.println("Plato 2: " + plato2);
            }
        }

        sc.close();
    }
}
