import java.util.ArrayList;
import java.util.Scanner;
public class TipoVacuna{
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0; i<10; i++){
            nums.add(i+1);
        }

        System.out.println(sum(nums));
    }
    public static int sum(ArrayList<Integer> nums){
        int sum = 0;
        for (int num: nums){
            sum += num;
        }
        return sum;
    }
}