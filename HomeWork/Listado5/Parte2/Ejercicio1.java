import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantAlumnos, cantMayor=0, sobre4=0;
        float[] alumnos;
        float mayor =0, nota, porcApro, sumNotas=0, promCurso;
        System.out.println("Ingresa la cantidad de alumnos del curso: ");
        cantAlumnos = sc.nextInt();

        alumnos = new float[cantAlumnos];

        for(int i=0; i<alumnos.length; i++){
            nota = sc.nextFloat();
            alumnos[i] = nota;

            sumNotas += nota;
            if (nota > mayor){
                mayor = nota;
            }

        }

        for(float notaA: alumnos){
            if (notaA == mayor){
                cantMayor++;
            }
            if (notaA >= 4){
                sobre4++;
            }
        }

        porcApro = sobre4*100/(float)cantAlumnos;

        promCurso = sumNotas/cantAlumnos;

        // nota mas alta
        // cant que la obtuvo
        // promedio general 
        // % aprobacion >= 4

        System.out.println("Nota mas alta: "+ mayor);
        System.out.println("Cantidad de Alumnos con la nota mas alta: " + cantMayor);
        System.out.println("Promedio general: "+ promCurso);
        System.out.println("Porcentaje de aprobacion: "+ porcApro +"%");
    }
}