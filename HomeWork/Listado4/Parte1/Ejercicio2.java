/* 
2. Construya un programa Java que permita determinar el rango de notas de un estudiante, siendo
los rangos siguientes: A[1.0 - 2.9]; B[3.0 – 3.9]; C[4.0 – 5.5] y D[5.6 – 7.0].

Para lo anterior deberá leer una secuencia de notas. La secuencia concluirá cuando se lea un
cero. Por ejemplo, la siguiente es una secuencia posible: 4.5 6.3 3.9 7.0 4.7 6.1 0

Debe validar que las notas ingresadas se encuentran dentro de la escala, esto es, entre 1 y 7. Si
el usuario ingresa como primer valor un cero, significa que no hay datos que procesar y el
programa debe concluir.
*/

import java.util.Scanner;
class Ejercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float nota = 0;

        do{
            nota = sc.nextFloat();
        }while(nota < 0 && nota>7);


        while (nota != 0){
            if (nota >= 5.6){
                System.out.println("D" + nota);
            }else if (nota >=4.0){
                System.out.println("C" + nota);
            }else if(nota >= 3.0){
                System.out.println("B" + nota);
            }else {
                System.out.println("A" + nota);
            }


            
        }
        sc.close();
    }
}
