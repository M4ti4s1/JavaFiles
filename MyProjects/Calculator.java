
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        float num1, num2;
        int option = 0;

        do {
            System.out.println("Choose one");
            System.out.println("1. Adition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            option = sc.nextInt();


            switch (option) {
                case 1:
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    System.out.println(num1+num2);

                case 2:
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    System.out.println(num1-num2);

                case 3:
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    System.out.println(num1*num2);

                case 4:
                    num1 = sc.nextFloat();
                    num2 = sc.nextFloat();
                    System.out.println(num1/num2);

                default:
                    continue;
            }
        }
        while (option != 5);
        System.out.println("Fuck I'm good");
    }
    
}