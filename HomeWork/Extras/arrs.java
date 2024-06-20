public class arrs {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


        System.out.println("\n");

        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i< arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}