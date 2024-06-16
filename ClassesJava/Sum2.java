
import Learn.Dog; //Import a class from another package
public class Sum2{
    
    public int[] twoSum(int[] nums, int target) {
        int goal = target;

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] + nums[j] == goal){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }
}
