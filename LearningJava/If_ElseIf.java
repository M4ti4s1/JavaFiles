public class If_ElseIf{


    public static void main(String[] args) {
        
        // Basic Syntaxis
        
        /* 
        boolean condition = true;
        
        if (condition == true){
            System.out.println("Hello world");
        }else if(condition == false){
            System.out.println("Bye World");
        }else{
            System.out.println("This will be never showed");
        }
        */



        //Compare Strings you use the objetc.equals(<String>)
        String name1, name2;
        name1 = "Matias";
        name2 = "Matias";

        if (name1.equals(name2)){
            System.out.println("The names are equal");
        }else{
            System.out.println("The names are different");
        }
    }
}