// 4*(1- (1/3)  +  (1/5)...)

// Sumatoria (−1)^k / 2k+1, con k termino desde 0
import java.util.Scanner;
class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int terminos = sc.nextInt();
        int k= 0;
        double num, den, sum=0, pi;

        //Calcular sumatoria de terminos
        while (k<terminos){
            num = Math.pow(-1,k);
            den = 2*k+1;

            sum += num/den;
            k +=1;
        }
        // 4*(sumatoria)
        pi = 4*sum;

        System.out.println(pi);
        sc.close();
    }
}
//  𝜋/4 = tan^(−1) 1/2 + tan^(−1) 1/5 + tan^(−1) 1/13 + tan^(−1) 1/34 + …

class Ejercicio5{
    public static void main(String[] args){
        //Math.atan()
        //Fibonacci
        Scanner sc = new Scanner(System.in);
        double a=0,b=1,aux; 
        int i =0, terminos;
        double sum = 0, termino, pi;

        System.out.println("Cuantos terminos de la serie se consideran: ");
        terminos = sc.nextInt();
        while (i< terminos*2){
            
            
            aux =b;
            b = a+b;
            a = aux;
            i +=1;
            
            if (i%2==0){
                termino = Math.atan(1/b);
                sum += termino;
            }
        }
        pi = (double)4*sum;
        System.out.println(pi);
        sc.close();
        
    }
}
