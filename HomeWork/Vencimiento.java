
import java.util.Scanner;
public class Vencimiento {
    public static void main(String[] args){

        int dia, mes, anio;
        boolean vencido;
        Scanner sc = new Scanner(System.in);

        dia = 15;
        mes = 04;
        anio = 2024;

        vencido = (anio < 2024) || (anio == 2024 && mes < 04) || (anio == 2024 && mes == 04 && dia < 13);
        System.out.println(vencido);

    }
    
}
