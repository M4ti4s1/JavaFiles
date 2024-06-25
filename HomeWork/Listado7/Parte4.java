// this is more like a library
// 
import java.util.Scanner;
public class Parte4 {
    public static void main(String[] args) {
        System.out.println(valorAbsoluto(-400)); 
        System.out.println(valorAbsoluto(-3.54)); 
        System.out.println(Math.floor(13.2));
        System.out.println(Math.floor(13.7));
        System.out.println(redondearAEntero(2.3));
        System.out.println(redondearAEntero(2.8));
    }
   
    /**
     * Exercise 1 of the list 7, part 1
     * @param num this method take a integer number
     * @return return the absolute value of the number
     */
    public static int valorAbsoluto (int num) {
        if (num < 0) {
            return num * -1;
        }
        return num;
    }

    /**
     * Exercise 1 of the list 7, part 1
     * @param num this method take a decimal number 
     * @return return the absolute value of the number
     */
    public static double valorAbsoluto (double num) {
        if (num < 0) {
            return num * -1;
        }
        return num;
    }

    /**
     * Exercise 2 of the list 7 part 4
     * @param num this method takes a integer number 
     * @return returns true or false if the number is even
     */
    public static boolean paridad (int num) {
        if (num%2 == 0) {
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param num
     * @return
     */
    public static int redondearAEntero(double num) {
        return (int)Math.floor(num + 0.5);
    }
    
    /**
     * 
     * @param num
     * @return
     */
    public static int redondearADecimas(double num) {
        return (int)Math.floor(num*10 + 0.5)/10;
    }
    
    /**
     * 
     * @param num
     * @return
     */
    public static int redondearACentecimas(double num) {
        return (int)Math.floor(num*100 + 0.5)/100;
    }
    
    /**
     * 
     * @param num
     * @return
     */
    public static int redondearAMilesimas(double num) {
        return (int)Math.floor(num*1000 + 0.5)/1000;
    }
}