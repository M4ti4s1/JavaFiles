import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int size;
        String caracter;


        size = LeeEnteroNoNegativo();
        caracter = LeerCaracter();
        while (size != 0) {

            DibujaCuadrado(size, caracter);
            size = LeeEnteroNoNegativo();
            caracter = LeerCaracter();
        }
    }    

    public static int LeeEnteroNoNegativo(){
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingresa un numero positivo o 0");
            numero = sc.nextInt();
        }while (numero < 0);
        return numero;
    }
    
    public static String LeerCaracter(){
        Scanner sc = new Scanner(System.in);
        String caracter; 
        do{
            System.out.println("Ingresa un caracter" );
            caracter = sc.next();
        }while (caracter.length()>1);
        return caracter;
    }
    
    public static void DibujaCuadrado(int size, String caracter){
        System.out.println();
        if (size == 1){
            System.out.println(caracter);
        }else {
            
            for (int i = 0; i < size; i++){
                System.out.print(caracter);
            }

            System.out.println();

            for (int i = 0; i < size-2; i++){
                for (int j =0; j< 1; j++){
                    System.out.print(caracter);
                }
                for (int j =0; j < size - 2; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < 1; j++)
                System.out.println(caracter);
            }
            
            for (int i = 0; i < size; i++){
                System.out.print(caracter);
            }
        }
        System.out.println();
    }
}
