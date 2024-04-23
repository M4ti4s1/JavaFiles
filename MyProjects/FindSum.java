public class FindSum {
    public static void main(String[] args){
        // multidimensional array
        // int[][] some = new int[2][3];



        int[] nums = new int[]{1,2,0,4};
        int target = 3;
        boolean find = false;
        //int[] position = new int[2];

        for (int i=0; i < nums.length; i++){
            if (find) {
                break;
            }

            for (int j= 0; j<nums.length; j++){

                if (find) {
                    break;
                }

                if (nums[i]+nums[j] == target){

                    System.out.println(i);
                    System.out.println(j);
                    find = true;
                }
            }
        }
    }
}   
