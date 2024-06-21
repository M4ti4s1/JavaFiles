/*
sueldo liquido = suedo bruto - liquidaciones

Tipo de trabajo
Horas trabajadas
valor por hora trabajada

liquidaciones prevencionales = 20% del sueldo bruto
sueldo bruto = horastrabajadas + bono 
    gerente = 125k
    vendedor = 35k
    secretaria = 15k
*/
package Listado7;
import java.util.Scanner;
public class Ejercicio1P3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipoTrabajo = tipoTrabajo(sc);
        int horas = horasTrabajadas(sc);
        int precio = precioPorHora(sc);
        double sueldoLiquido = sueldoLiquido(tipoTrabajo, horas, precio);
        
        System.out.println("Sueldo final: " + sueldoLiquido);
    }
    


    // methods

    // leer trabajo
    public static String tipoTrabajo (Scanner sc) {
        String tipoTrabajo;

        System.out.println("Ingresa tu tipo de trabajo");
        tipoTrabajo = sc.next();

        while (!tipoTrabajo.equalsIgnoreCase("gerente") && !tipoTrabajo.equalsIgnoreCase("vendedor") && !tipoTrabajo.equalsIgnoreCase("secretaria")) {
            System.out.println("Trabajo invalido... Ingresa un trabajo valido");
            tipoTrabajo = sc.next();
        }

        return tipoTrabajo.toLowerCase();
    }

    // horas trabajas
    public static int horasTrabajadas (Scanner sc) {
        int horas = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {    
                System.out.println("Ingresa el numero de horas trabajadas");
                horas = sc.nextInt();

                if (horas < 1) {
                    System.out.println("Las horas deben ser positivas");
                } else {
                    inputValid = true;
                }

            } catch (Exception e) {
                System.out.println("Las horas deben ser un entero... intenta denuevo");
                sc.next(); // consume invalid input
            }
        }
        
        return horas;
    }
    
    // leer precio por hora
    public static int precioPorHora (Scanner sc) {
        int precioXHora = 0;
        boolean precioValido = false;
        while (!precioValido) {
            try {
                System.out.println("Ingresa el precio por hora trabajada");
                precioXHora = sc.nextInt();
                
                if (precioXHora < 1) {
                    System.out.println("El precio debe ser mayor a 0");
                } else {
                    precioValido = true;
                }
            } catch (Exception e) {
                System.out.println("El precio debe ser un entero... intenta denuevo");
                sc.next(); //consume the invalid intput
            }
        } 
        
        return precioXHora;
    }
    
    // calculo suedo liquido
    public static double sueldoLiquido (String tipoTrabajo, int horasTrabajadas, int precioPorHora) {
        double sueldoFinal = 0; 
        double sueldoBruto = horasTrabajadas * precioPorHora;
        //gerente 
        // vendedor
        // secretaria
        switch (tipoTrabajo) {
            case "gerente" -> sueldoBruto += 125000;
            case "vendedor" -> sueldoBruto += 35000;
            case "secretaria" -> sueldoBruto += 15000;
        }
        
        sueldoFinal = sueldoBruto * 0.8;
        return sueldoFinal;
    }
}