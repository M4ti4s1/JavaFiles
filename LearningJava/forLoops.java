public class forLoops {
    public static void main(String[] args){

        int[] nums = new int[]{1,2,3,4,5,6};

        /*
            This way we can iterate for all the items in an array, we also can iterate in certain positions only, like even or odd, changing the i++ istatement for the one that we want
        */
        System.out.println("First way");
        for (int i=0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("Seecond way");
        /*
            This way we can iterate for all the items in a array, always through all of them
            We have to specify the data type that our variable will have then asssign a name for our variable
            and then we have to use the colon to assign the array tha we are going to be looping in

            To keep track of the indexes we add a outside counter
        */

        int counter = 0;
        for (int element:nums){
            System.out.println(counter +"\t" +element);
            counter++;
        }


        
        // Break statement

        for (int element:nums){
            System.out.println(counter +"\t" +element);

            if (element == 5){
                break;
            }
        }
    }
}
