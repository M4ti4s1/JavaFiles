// Matias Antonio Constazo Monsalve
// Fernanda Antonia Flores Chavez
// Nicolas Ignacio Figueroa Mendoza

/*
Cada uno hizo una funcion, Fernanda la de ingresar intento, 
Nicolas la de procesar el intento y Matias la de generar el numero

Entre todos hicimos el menu en la funcion main
*/


import java.util.Scanner;
public class Lab13{
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int opc, numeroAdivinar=0;
        boolean juegoIniciado = false;
        boolean juegoTerminado = false;
        do{
            System.out.println("ADIVINA EL NUMERO");
            System.out.println("1: Iniciar juego");
            System.out.println("2: Ingresa intento");
            System.out.println("3: Salir");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    if(juegoIniciado == false){
                        juegoIniciado = true;
                        juegoTerminado = false;
                        numeroAdivinar = generarNumeroParaAdivinar();
                        System.out.println("Adivina el numero entre 1 y 1000");
                    }else{
                        System.out.println("El juego ya esta iniciado");
                    }
                    break;
                case 2:
                    if(juegoIniciado == true && juegoTerminado == false){
                        int intento = ingresaIntento(1, 1000); 
                        boolean resultado = procesaIntento(numeroAdivinar, intento);
                        if (resultado == true){
                            juegoTerminado = true;
                        }

                    }else{
                        System.out.println("Juego no iniciado");
                    }
                    break;
                case 3:
                        System.out.println("Saliendo del juego...");
                        break;
                default:
                    System.out.println("Opcion invalida. Intente denuevo");
            }
        }while(opc != 3);
        

    
    }

    public static int generarNumeroParaAdivinar (){
        return (int)(Math.random()*1000 + 1);
    }

    public static int ingresaIntento(int limInferior, int limSuperior){

        Scanner sc = new Scanner(System.in);
        int intento;
        do{
            intento = sc.nextInt();
        }while(intento < limInferior && intento > limSuperior);
        return intento;
    }

    public static boolean procesaIntento (int numeroAdivinar, int intento){
        if (intento == numeroAdivinar){
            System.out.println("Felicidades, ¡adivino el numero!");
            return true;
        }else if(intento < numeroAdivinar){
            System.out.println("Demasiado bajo, intente de nuevo");
        }else if(intento > numeroAdivinar){
            System.out.println("Demasiado alto, intente de nuevo");
        } 
        return false;
    }
}
