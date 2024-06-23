import java.util.Scanner;
public class Ejercicio22y23P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean juegoIniciado = false, juegoTerminado = true, validOpc = false, winORLose;
        int opc = 0, numeroAdivinar = 0, intento, nroIntentos = 0;
        System.out.println("ADIVINA EL NUMERO");
        System.out.println("1. Ingresa intento");
        System.out.println("2. Iniciar nuevo juego");
        System.out.println("3. Salir");


        while (!validOpc) {
            try {
                System.out.println("Ingresa una opcion (1-3)");
                opc = sc.nextInt();
                
                if (opc < 1 || opc > 3) {
                    System.out.println("Opcion fuera de rango... intenta denuevo");
                } else {
                    validOpc = true;
                }
            } catch (Exception e) {
                System.out.println("La opcion debe ser un entero... intenta denuevo");
                sc.next();
            }
        }
        
        if (opc == 3) {
            System.out.println("Saliendo...");
        }

        while (opc != 3) {            
            validOpc = false;
            switch (opc) {
                case 1:
                    if (juegoIniciado && !juegoTerminado) {
                        intento = ingresaIntento(sc);
                        winORLose = procesaIntento(intento, numeroAdivinar, nroIntentos);
                        nroIntentos = contarIntentos(winORLose, nroIntentos);
                        if (winORLose) {
                            juegoTerminado = true;
                            juegoIniciado = false;
                        }
                    } else {
                        System.out.println("No hay un juego iniciado... inicia uno primero");
                    }
                    break;

                case 2:
                    if (!juegoIniciado && juegoTerminado) {
                        numeroAdivinar = generarNumero();
                        juegoIniciado = true;
                        juegoTerminado = false;
                        nroIntentos = 0;
                   } else {
                        System.out.println("Un juego esta iniciado, terminalo para iniciar otro");
                    }
                    break;
            }

            System.out.println();
            System.out.println("ADIVINA EL NUMERO");
            System.out.println("1. Ingresa intento");
            System.out.println("2. Iniciar nuevo juego");
            System.out.println("3. Salir");
            while (!validOpc) {
                try {
                    System.out.println("Ingresa una opcion (1-3)");
                    opc = sc.nextInt();
                    
                    if (opc < 1 || opc > 3) {
                        System.out.println("Opcion fuera de rango... intenta denuevo");
                    } else {
                        validOpc = true;
                    }
                } catch (Exception e) {
                    System.out.println("La opcion debe ser un entero... intenta denuevo");
                    sc.next();
                }
            }

            if (opc == 3) {
                System.out.println("Saliendo...");
            }
            
        }



    }  
    
    public static int generarNumero() {
        return (int)(Math.random() * 1000 + 1);
    }
    

    public static int ingresaIntento (Scanner sc) {
        int intento = 0;
        boolean intentoValido = false; 
        while (!intentoValido) {
            try {
                System.out.println("Ingresa tu intento (1 - 1000)");
                intento = sc.nextInt();
                
                if (intento < 1 || intento > 1000) {
                    System.out.println("Intento fuera de rango... intenta denuevo");
                } else {
                    intentoValido = true;
                }

            } catch (Exception e) {
                System.out.println("El intento debe ser un entero... intenta denuevo");
                sc.next(); // catch the invalid input
            }
        }
        return intento;
    }
    

    public static boolean procesaIntento (int intento, int numeroAdvinar, int nroIntentos) {

        if (intento == numeroAdvinar) {
            System.out.println("Felicidades, ¡adivino el numero!");
            
            if (nroIntentos < 10) {
                System.out.println("¡O ya sabia usted el secreto, o tuvo suerte!");
            } else if (nroIntentos > 10) {
                System.out.println("¡Deberia haberlo hecho mejor!");
            } else {
                System.out.println("¡Aja, Sabía usted el secreto!");
            }
            return true;
        } else if (intento < numeroAdvinar) {
            System.out.println("Demasiado bajo, intente de nuevo");
        } else {
            System.out.println("Demasiado alto, intente denuevo");
        }
        return false;
    }
    
    public static int contarIntentos (boolean intentoProcesado, int nroIntentos) {
        if (!intentoProcesado) {
            nroIntentos++;
        }
        return nroIntentos;
    }
}


