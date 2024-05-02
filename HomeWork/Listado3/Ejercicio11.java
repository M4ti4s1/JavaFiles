/*
11. Escriba un programa Java que calcule el Coeficiente Binomial C(n,k). Este valor corresponde al número de
subconjuntos de k elementos escogidos de un conjunto con n elementos. Para realizar el cálculo se emplea la
siguiente fórmula:
𝐶(𝑛, 𝑘) = (𝑛 𝑘) = 𝑛!/(𝑘! (𝑛 − 𝑘)!)
Los valores de n y k deben ser proporcionados por el usuario, tal que k > 0 y k <=n. Si los valores ingresados
no cumplen con lo anterior no se debe realizar el cálculo, sino desplegar un mensaje al usuario indicando
cuál es el problema con el o los datos de entrada. Sea preciso con el mensaje.
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
        // Factorioal de 5 
        for (int i=n; i>0; i--){
            num *= i;
        }
        
        for (int i=k;k>0;k--){
            den1 *=i;
        }
        
        for (int i=(n-k); i>0; i--){
            den2 *=i;
        }
        result = num/(den1*(double)den2); 
        System.out.println(result); 

        
    }
}
