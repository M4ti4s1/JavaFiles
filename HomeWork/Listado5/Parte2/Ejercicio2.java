import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array nombres de planeta
        // ARray diametro de planetas
        
        int cantPlanetas = sc.nextInt();
        String[] nombres = new String[cantPlanetas];
        int[] diametro = new int[cantPlanetas];
        int bigger, smallest; 

        for (int i = 0; i < cantPlanetas; i++){
            nombres[i] = sc.next();
            diametro[i] = sc.nextInt();

        }
        bigger = 0;
        smallest = 0;


        for(int i = 0; i < cantPlanetas; i++){
            if (diametro[i] > diametro[bigger]){
                bigger = i;
            }
            if (diametro[i] < diametro[smallest]){
                smallest = i;
            } 
        }
        

        System.out.println("Planeta mas grande: "+ nombres[bigger]);
        System.out.println("Planeta mas pequeno: "+ nombres[smallest]);
        sc.close();
    }
}