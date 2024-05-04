/*
11. Escriba un programa Java que calcule el Coeficiente Binomial C(n,k). Este valor corresponde al número de
subconjuntos de k elementos escogidos de un conjunto con n elementos. Para realizar el cálculo se emplea la
siguiente fórmula:
𝐶(𝑛, 𝑘) = (𝑛 𝑘) = 𝑛!/(𝑘! (𝑛 − 𝑘)!)
Los valores de n y k deben ser proporcionados por el usuario, tal que k > 0 y k <=n. Si los valores ingresados
no cumplen con lo anterior no se debe realizar el cálculo, sino desplegar un mensaje al usuario indicando
cuál es el problema con el o los datos de entrada. Sea preciso con el mensaje.



12. Escriba una variante del programa definido para el problema anterior, tal que permita a un usuario calcular
uno o más coeficientes binomiales, según lo que requiera. Determine usted el modo en que permitirá al
usuario realizar lo indicado.
*/
import java.util.Scanner;
class Ejercicio11 {
    public static void main(String[] args){
        int n, k;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        int num = 1, den1 =1, den2 =1;
        double result;

        // Calcular factoriales 
        for (int i=n; i>0; i--){
            num *= i;
        }
        System.out.println(num);
        
        for (int i=k;i>0;i--){
            den1 *=i;
        }
        System.out.println(den1);

        for (int i=(n-k); i>0; i--){
            den2 *=i;
        }
        result = num/(den1*(double)den2); 
        System.out.println((Math.round(result *100))/(double)100); 
        sc.close();
        
    }
}


class Ejercicio12{

    public static void main(String[] args){
        String opc = "y";
        Scanner sc = new Scanner(System.in);
        do{
            int n, k;
            System.out.println("Ingresa los terminos del producto binomial: ");
            n = sc.nextInt();
            k = sc.nextInt();
            int num = 1, den1 =1, den2 =1;
            double result;

            // Calcular factoriales
            for (int i=n; i>0; i--){
                num *= i;
            }
            System.out.println(num);
            
            for (int i=k;i>0;i--){
                den1 *=i;
            }
            System.out.println(den1);

            for (int i=(n-k); i>0; i--){
                den2 *=i;
            }
            result = num/(den1*(double)den2); 
            System.out.println((Math.round(result *100))/(double)100); 
    
            System.out.println("Quieres calcular otro (y/n)");
            opc = sc.next();
        }while(opc.equalsIgnoreCase("y"));
        sc.close();
    }
}