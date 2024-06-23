import java.util.Scanner;
public class Ejercicio3P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nroTerminos = numeroTerminos(sc);
        imprimir(nroTerminos);
        sc.close();
    }

    /**
     * This method valid the number of terms that we will print
     * @param sc this parameter is a simply scanner
     * @return the method return a valid number of terms
     */
    public static int numeroTerminos(Scanner sc) {
        int nroTerminos = 0;
        boolean nroValido = false; 
        
        while (!nroValido) {
            try {
                System.out.println("Ingresa el numero de terminos");
                nroTerminos = sc.nextInt();

                if (nroTerminos <= 0) {
                    System.out.println("El numero de terminos debe ser mayor a 0");
                } else {
                    nroValido = true;
                }

            } catch (Exception e) {
                System.out.println("El numero de terminos debe ser un entero");
                sc.next(); // catch the invalid input
            }
        }

        return nroTerminos;
    } 
    
    /**
     * This method will print the secuence 
     * @param nroTerminos this is the verify integer number of terms 
     */
    public static void imprimir (int nroTerminos) {
        int num = 1, den = 2;
        for (int i = 0; i < nroTerminos -1; i++) {
            System.out.print(num + "/" + den + " + ");
            den += 3;
        }
        System.out.print(num + "/" + den);
    }
}