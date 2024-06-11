import java.util.Scanner;
public class Notas {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        float nota, promAlu, promCurso, promMayor=0, sumNotaAlu, sumaPromCurso=0, notaMenor;
        String nomAlumno, aluMayProm="";
        int totalAlu = 0;
        nomAlumno = sc.next();

        System.out.println("Notas del Curso");
        System.out.printf("%-14s %-14s%n","Nombre Alumno", "Promedio Alumno");
        System.out.println("----------------------------");
        
        while (!(nomAlumno.equalsIgnoreCase("Fin"))) {
            totalAlu++;
            sumNotaAlu = 0;
            notaMenor = 99;
            
            for (int i = 0; i < 10; i++) {
                nota = sc.nextFloat();
                
                if (nota < notaMenor) {
                    notaMenor = nota;
                }
                sumNotaAlu += nota;
            }
            
            promAlu = (sumNotaAlu - notaMenor)/(float)9;
            if (promAlu > promMayor){
                promMayor = promAlu;
                aluMayProm = nomAlumno;
            }

            sumaPromCurso += promAlu;
            System.out.printf("%-14s %-14f%n", nomAlumno, promAlu);

            nomAlumno = sc.next();
        }
        promCurso = sumaPromCurso/totalAlu;
        System.out.println("------------------------------");
        System.out.printf("%-20s : %-10d%n", "Total de alumnos", totalAlu);
        System.out.printf("%-20s : %-10f%n", "Promedio del curso", promCurso);
        System.out.printf("%-20s : %-10f%n", "Promedio mayor", promMayor);
        System.out.printf("%-20s : %-10s%n", "Alumno prom. mayor", aluMayProm);
        sc.close();
    }
}