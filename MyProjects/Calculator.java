
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
            System.out.println("5. Power");
            System.out.println("6. Exit");
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
                    do{
                        num2 = sc.nextFloat();
                    }while (num2 == 0);
                    System.out.println(num1/num2);
                case 5:
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    double num3 = num1;
                    double num4 = num2;
                    System.out.println(Math.pow(num3,num4));
                default:
                    continue;
            }
        }
        while (option != 6);
        System.out.println("Fuck I'm good");
    }
    
}