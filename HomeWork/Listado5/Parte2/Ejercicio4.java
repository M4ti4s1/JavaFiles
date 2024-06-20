import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // asignatura 1
        float[] notas1;
        String[] alumnos1;
        
        // asignatura 2
        float[] notas2;
        String[] alumnos2;
        
        // cant asignatura 1

        System.out.println("Ingresa la cantidad de alumnos de la asignatura 1");
        int cantAlumnos1 = sc.nextInt();

        notas1 = new float[cantAlumnos1];
        alumnos1 = new String[cantAlumnos1];


        for (int i = 0; i < cantAlumnos1; i++) {
            System.out.println("Ingresa el nombre y la nota del alumno #" + (i+1));
            alumnos1[i] = sc.next();
            notas1[i] = sc.nextFloat();
        }
        
        System.out.println("Ingresa la cantidad de alumons de la asignaturta 2");
        int cantAlumnos2 = sc.nextInt();

        notas2 = new float[cantAlumnos2];
        alumnos2 = new String[cantAlumnos2];

        for (int i = 0; i < cantAlumnos2; i++) {
            System.out.println("Ingresa el nombre y la nota del alumno #" + (i+1));
            alumnos2[i] = sc.next();
            notas2[i] = sc.nextFloat();
        }
        

        System.out.println("REPORTE DE SITUACION POR ALUMNO");
        System.out.printf("%-15s %-17s %-17s%n", "Nombre Alumno", "Nota Asignatura 1", "Nota Asignatura 2");
        for (int i = 0; i < cantAlumnos1; i++) {
            for (int j = 0; j < cantAlumnos2; j++) {
                if (alumnos1[i].equals(alumnos2[j])) {
                    System.out.printf("%-15s %17.1f %17.1f%n", alumnos1[i], notas1[i], notas2[j]);
                }
            }
        }
        sc.close();
    }
}