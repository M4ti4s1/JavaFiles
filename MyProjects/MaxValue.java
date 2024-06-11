import java.util.Scanner;
public class MaxValue{
    public static int MaxValueArray(int[] nums){
        int max = nums[0];
        for (int num:nums) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(), num2= sc.nextInt();
        System.out.println(num1+num2);
    }
}