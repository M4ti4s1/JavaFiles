public class Methods{

    public static void main(String[] args) {

        /*
        Classes:    A class is a blueprint or a template for create objects
                    It defines the properties and behaviors that objects of the class will have 

        Objects:    Are instances of a class, are entityes that has state and behavior

        Methods:    Are functions define within a class that performs specific actions
                    Can manipulate the internal state of an object and provide a way to interat with it
        */


        /*          How to use methods           */
        // we call it as a function and if it has parameters we hav eto pass arguments
        noParameters();
        withParameters(2,"Matias");
        noReturn("Matias");
        System.out.println(withReturn(3,5));

        Sum2 some = new Sum2();

        int[] arr = new int[]{1,2,4,5};
        int target = 3;

        System.out.println(some.twoSum(arr, target));

    }
    


    /*          Methods         */
    //      Method that not use parameters
    public static void noParameters(){
        System.out.println("Hello world");
    }
    
    //      Method that use parameters
    public static void withParameters(int num1, String phrase){

        for (int i=1; i<num1;i++){
            System.out.println(phrase);
        }
    }

    //      Method that NO Return a value
    // If we choose not to return a value we have to include "void"
    public static void noReturn(String some){
        System.out.println("This not return nothing "+ some);
    }

    //      Method that Return a value
    public static int withReturn(int x,int y){
        return x + y;
    }

    

}
