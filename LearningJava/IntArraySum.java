
import java.util.Scanner;
public class IntArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size, sum;
        sum = 0;

        System.out.println("Enter the amount of numbers to sum");
        size = sc.nextInt();
        
        int[] sumArr = new int[size];

        System.out.println("Enter the numbers to sum");
        for (int i=0;i<sumArr.length; i++){
            sumArr[i] = sc.nextInt();
        }

        for (int element:sumArr){
            sum += element;
        }

        System.out.println("The sum is: " + sum);

        sc.close();

    }
}
