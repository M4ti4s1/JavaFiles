import java.util.Scanner;
public class doWhileLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            /*
                This loop will always execute his instructions al least 1 time
            */
            int i = 0;

            do{
                System.out.println(i);
                i++;
            }while(i<10);
    }
}
