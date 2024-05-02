import java.util.Scanner;
class Ejercicio3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float num, sum=0;
        int den = 2, cont = 0, user;
        user = sc.nextInt();
        do{
            System.out.println("1/"+den);
            num = 1/den;
            den += 2;
            sum = sum + num;
            cont +=1;
        }while (cont < user);

        System.out.println("Terminos: "+ cont);
        System.out.println("Suma: "+ (float)sum);
        sc.close();
    }
}