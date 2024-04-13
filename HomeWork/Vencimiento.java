
import java.util.Scanner;
public class Vencimiento {

    public static void main(String[] args){

        int dia, mes, anio, diaVen, mesVen, anioVen;
        String medicamento;
        boolean vencido;
        Scanner sc = new Scanner(System.in);
        
        medicamento = sc.next();

        // Ingresar fecha Vencimiento
        diaVen = sc.nextInt();
        mesVen = sc.nextInt();
        anioVen = sc.nextInt();

        // Ingresar fecha a consultar
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();

        // Escribir 
        System.out.println( "Nombre medicamento: " + medicamento);
        System.out.println( "Fecha Vencimiento: " + diaVen +"-"+mesVen+"-"+anioVen);
        System.out.println( "Fecha Consulta: " + dia +"-"+mes+"-"+anio);


        vencido = (anioVen < anio) || (anioVen == anio && mesVen < mes) || (anioVen == anio && mesVen == mes && diaVen < dia);

        if (vencido == true){
            System.out.println("Es Verdadero que el medicamento esta o estara vencido para la fecha de consulta");
        }
        else{
            System.out.println("Es Falso que el medicamento esta o estara vencido para la fecha de consulta");
        }
            
        sc.close();

    }
    
}
