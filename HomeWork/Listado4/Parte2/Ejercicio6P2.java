
import java.util.Scanner;

public class Ejercicio6P2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String equipo,equipo1, equipo2, opc;
        int nroProblema, minutos, resultado, sumMinEquipo1=0, sumMinEquipo2=0;
        int problemasResEqui1=0,problemasResEqui2=0, cantIncorrectasEq1=0, cantIncorrectasEq2=0;
        System.out.println("Ingresa el nombre de ambos equipos");
        equipo1 = sc.next();
        equipo2 = sc.next();

        do{
            System.out.println("Ingresa nombre de equipo: ");
            equipo = sc.next();
            System.out.println("Ingresa Numero del problema resuelto: ");
            nroProblema = sc.nextInt();
            System.out.println("Ingresa minutos en que entrega: ");
            minutos = sc.nextInt();
            System.out.println("Ingresa resultado (1: correcto      0: Incorrecto): ");
            resultado = sc.nextInt();

            if (equipo.equals(equipo1)) {
                if (resultado == 1){
                    problemasResEqui1 ++;
                    sumMinEquipo1 += minutos;
                }else{
                    sumMinEquipo1 += minutos+20;
                    cantIncorrectasEq1 +=1;

                }

            } else if (equipo.equals(equipo2)) {
                if (resultado == 1){
                    problemasResEqui2 ++;
                    sumMinEquipo2 += minutos;
                }else{
                    sumMinEquipo2 += minutos+20;
                    cantIncorrectasEq2 +=1;
                }
            }
            System.out.println("Ingresa S o FIN para terminar");
            opc = sc.next();
        }while(!(opc.equals("FIN")));


        // Ganador
        


        if ((problemasResEqui1 > problemasResEqui2) || (sumMinEquipo1 < sumMinEquipo2) || (cantIncorrectasEq1 < cantIncorrectasEq2)){
            System.out.println("Ganador Equipo "+ equipo1);

        }else if ((problemasResEqui2 > problemasResEqui1) || (sumMinEquipo2 < sumMinEquipo1) || (cantIncorrectasEq2 < cantIncorrectasEq1)){
            System.out.println("Ganador Equipo "+equipo2);
            
        }else{
            System.out.println("Empate");
        }
        sc.close();
    }
}