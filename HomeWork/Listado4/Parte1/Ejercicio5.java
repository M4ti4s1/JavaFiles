/* 
Construya un programa Java que permita determinar cuántos estudiantes tienen promedioentre los rangos siguientes: A[1.0 - 2.9]; B[3.0 – 3.9]; C[4.0 – 5.5] y D[5.6 – 7.0].
Para lo anterior deberá leer una secuencia de notas de uno o más estudiantes. La secuencia de
notas de un estudiante concluirá cuando se lea un cero. La secuencia de notas concluirá al
ingresar un segundo cero consecutivo. Por ejemplo, la siguiente es una serie posible: 4.5 6.3
3.9 7.0 4.7 6.1 0 4.8 6.4 0 7.0 7.0 7.0 6.8 6.9 0 0
Debe validar que las notas ingresadas se encuentran dentro de la escala, esto es, entre 1 y 7. Si
el usuario ingresa como primer valor un cero y luego notas válidas, debe ignorar el cero. Si el
usuario ingresa inicialmente un doble cero significa que no hay datos que procesar y el
programa debe concluir.
Usted debe leer las notas de cada estudiante, calcular el promedio y determinar el rango que le
corresponde.
Se espera que el programa, al finalizar la lectura de datos, despliegue el número de estudiantes
con promedio en el rango A, el número de estudiantes con promedio en el rango B, etc.
*/

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        // 1 3 3 0 0
        // leer secuencia que termine con 0 0
        float nota, sum, cantNotas, promedio;
        int numEstudEnA=0, numEstudEnB=0, numEstudEnC=0, numEstudEnD=0;
        nota = sc.nextFloat();

        if (nota == 0){
            nota = sc.nextFloat();
        }

        while (nota != 0 && (nota < 1 || nota > 7)){
            nota = sc.nextFloat();
        }
        
        while (nota != 0){
            sum = 0;
            cantNotas = 0;
            while (nota != 0){
                sum += nota;
                cantNotas++;

                while (nota != 0 && (nota<1 || nota>7)){
                    nota = sc.nextFloat();
                }
            }
            promedio = sum/cantNotas;
            if (promedio <= 2.9){
                numEstudEnA++;
            }else if(promedio <= 3.9){
                numEstudEnB++;
            }else if(promedio <=5){
                numEstudEnC++;
            }else{
                numEstudEnD++;
            }
        }

        
        System.out.println("Estudiantes en A: "+ numEstudEnA);
        System.out.println("Estudiantes en B: "+ numEstudEnB);
        System.out.println("Estudiantes en C: "+ numEstudEnC);
        System.out.println("Estudiantes en D: "+ numEstudEnD);
        
        sc.close();
    }
}
