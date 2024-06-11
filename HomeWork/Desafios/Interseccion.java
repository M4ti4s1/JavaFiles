public class Interseccion{
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,24,5};
        int[] arr2 = {3,4,1,2};

        // 1,2,3,4
        int sizeArr3=0, numIguales=0;
        
        

        for (int num1:arr1) {
            for (int num2:arr2 ) {
                if(num1==num2){
                    numIguales ++;
                }
            }
        }

        int[] arr3 = new int[numIguales];
        int i =0; //index add the values that are repeted

        
        for (int num1:arr1) {
            for (int num2:arr2 ) {
                if(num1==num2){
                    arr3[i] = num1;
                    i++;
                }                    
            }
        }



        for (int k: arr3){
            System.out.print(k+ " ");
        }
        //System.out.println(numIguales);

        
    }
}