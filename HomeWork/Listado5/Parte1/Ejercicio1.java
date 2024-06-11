package Parte1;
public class Ejercicio1{
    public static void main(String[] args) {
        int[] cuentas = new int[100];

        for(int i=0; i<cuentas.length; i++){
            cuentas[i] = 1;
        }
        
        for(int num: cuentas){
            System.out.println(num);
        }
    }
}