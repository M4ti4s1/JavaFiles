
import java.util.Scanner;
class Desafio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingres la cantidad de cursos: ");
        int cantCursos = sc.nextInt();
        
        if (cantCursos >0){
            int i = 0;
            while (i < cantCursos){
                System.out.println("Ingresa ID del curso");
                String id = sc.next();
                System.out.println("Ingresa la cantidad de estudiantes: ");
                int cantEstudiantes = sc.nextInt();
                float estMenor, estMayor, estatura1, estatura2;
                if (cantEstudiantes >0){
                    int j = 1;
                    System.out.println("Ingresa la estatura del alumnos numero "+j);
                    estatura1 = sc.nextFloat();
                    estMenor = estatura1;
                    estMayor = estatura1;
                    while (j<cantEstudiantes){
                        System.out.println("Ingresa la estatura del alumnos numero "+(j+1));
                        estatura2 = sc.nextFloat();
                        if (estatura2 < estatura1){
                            estMenor = estatura2;
                        }else if(estatura2>estatura1){
                            estMayor = estatura2;
                        }


                        j++;
                        
                    }
                    System.out.printf("%-10s %-10s %-10s %-12s%n","Id curso","E.Menor","E.Mayor","E.Promedio");
                    System.out.printf("%10s %10.2f %-10.2f ", id,estMenor, estMayor);
                }
                i++;
            }   
        }else{
            System.out.println("No hay cursos que procesar");
        }
    }
}
