import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            The while loop will always analize the condition first 
            and then will execute the instruction
        */
        int i;
        i = sc.nextInt();
        
        while (i>=0){
            System.out.println(i);
            i = sc.nextInt();
        }

        sc.close(); 
    }
}
