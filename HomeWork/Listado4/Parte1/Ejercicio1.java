/*
1. Construya un programa Java que genere la siguiente serie:
1/2 + 1/5 + 1/8 + 1/11 + 1/ 14 + … + 1/x.
Se pide que:
    a) Consulte al usuario el número de términos a generar. Valide que no se trate de un valor negativo. Si ingresa el valor cero, significa que no debe generar la serie.
    b) Presente la sumatoria anterior, desplegando cada término como una fracción.
    c) Presente el resultado de la suma, como un valor decimal.
 * 
*/
import java.util.Scanner;
class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cantTerminos;
        int den=2;
        float sum = 0;
        do{
            System.out.println("Ingrese la cantidad de terminos: ");
            cantTerminos = sc.nextInt();
        }while(cantTerminos <0);
        

        
        if (cantTerminos != 0){
            for (int i = 0; i<cantTerminos; i++, den +=3){
                System.out.print(1 +"/"+den+"  ");
                sum += (float)1/den;
            }
            System.out.println("\n"+sum);
        }else{
            System.out.println("Operacion cancelada");
        }
        sc.close();
    }
}