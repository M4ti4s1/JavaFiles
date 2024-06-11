<<<<<<< HEAD
/*  Escriba un programa Java que lea una fecha con el formato dd-mm-aaaa, luego la
despliegue usando el formato dd de xxxx de aaaa.
Por ejemplo, si se lee 26-04-2024, se deberá desplegar 26 de abril de 2024.     */

package Listado2;
import java.util.Scanner;
public class DiaMesAnio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 10-11-2024
        // 0123456789
        String date = sc.next();
        String day = date.substring(0,2);
        String month = date.substring(3,5);
        String year = date.substring(6,10);
        int intDay = Integer.parseInt(day);
        int intMonth = Integer.parseInt(month);
        int intYear = Integer.parseInt(year);


        switch(intMonth){
            case 1 -> month = "Enero";
            case 2 -> month = "Febrero";
            case 3 -> month = "Marzo";
            case 4 -> month = "Abril";
            case 5 -> month = "Mayo";
            case 6 -> month = "Junio";
            case 7 -> month = "Julio";
            case 8 -> month = "Agosto";
            case 9 -> month = "Septiempre";
            case 10 -> month = "Octubre";
            case 11 -> month = "Noviembre";
            case 12 -> month = "Diciembre";
            default -> month = "No valid";
        }
        if (!(month.equals("No valid"))){
            System.out.println(intDay + " de "+month+" de "+intYear);
        }else{
            System.out.println("Invalid data");
        }
=======
public class DiaMesAnio{
    public static void main(String[] args){
        
>>>>>>> 7aa5afd131f3f7737825d09ef3fe8a6a3a88453d
    }
}