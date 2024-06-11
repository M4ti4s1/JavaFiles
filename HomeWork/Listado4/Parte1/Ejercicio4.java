import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numMax, suma=0, num;

        numMax = sc.nextFloat();

        num = sc.nextFloat();
        if (num > numMax){
            System.out.println("Primer valor es mayor al maximo");
        }else{
            while (suma < numMax){
                suma += num;
                num = sc.nextFloat(); 
            }

        }
        sc.close();
    }
}
