/*
6. Escriba una aplicación que lea cinco números enteros, cada uno entre 1 y 30, valide que se encuentren en este rango. Por cada número leído, su programa debe mostrar ese número de asteriscos adyacentes. Por ejemplo, si su programa lee el número 7, debe mostrar *******. Muestre las barras de asteriscos después de leer los cinco números.
*/
import java.util.Scanner;

// No sirve para mi clase porque aun no nos pasamos Arrays, pero sirve, y es gneral para cualquier valor
class Ejercicio6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size, num;
        System.out.println("Ingresa la cantidad de terminos: "); 
        size = sc.nextInt();
        int[] nums = new int[size];


        for (int i =0; i < size; i++){
            System.out.println("Ingresa el termino #"+(i+1)+": ");
            num = sc.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i< size; i++){
            for (int j=0; j<nums[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
