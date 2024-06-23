import java.util.Scanner;
public class Ejercicio2P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int pisos = validaPisos(sc);
        System.out.println();
        dibujaEscalera(pisos);

        sc.close();
    }
    
    /**
     * This method will verify the number of steps the stair will have
     * @param sc this parameter is an scanner
     * @return this method return a valid number of steps
     */
    public static int validaPisos (Scanner sc) {
        int pisos = 0;
        boolean pisosValidos = false; 

        while (!pisosValidos) {
            try {
                System.out.println("Ingresa el numero de pisos de la escalera");
                pisos = sc.nextInt();
                
                if (pisos < 1) {
                    System.out.println("Los pisos deben ser mayores a 0");
                } else {
                    pisosValidos = true;
                }
            }catch (Exception e) {
                System.out.println("La cantidad de pisos debe ser un entero... intenta denuevo");
                sc.next();
            }
        }
        return pisos;
    }
    
    /**
     * This method draw the stair, it doesn't return nothing
     * @param pisos This parameter is the number of steps that we will draw
     */
    public static void dibujaEscalera (int pisos) {
        String cadena = "";

        for (int i = 1; i <= pisos; i++) {
            System.out.println(cadena + i);
            cadena += i;
        }
    }
}