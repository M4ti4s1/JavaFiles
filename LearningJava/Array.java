import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        
        /* 
        To create an array we have to choose a data type for our array
        Then we add the [] to make sure that we are creating an array
        Then we have to use the key word new and Again using the data 
        type that we choose along with the size of our array
        */

        String[] names = new String[3];
        String[] cars = {"Mustang", "Bugatti", "Koeniggseg"};
        cars[0] = "Gtr-r34";


        /*
        To assign values to the array we use indexes, starting from 0 using brackets
        Or we can direcly assign values when we creat it
        */

        names[0] = "Nick";
        names[1] = "Mike";
        names[2] = "Jack";

        int[] ages = new int[]{12,15,17};
        for (int age: ages){
            System.out.println(age);
        }

        // To find the length of the array we use the length method
        
        /* 




        int arrLength = names.length;
        System.out.println(arrLength);


        //Dispay the values of the array
        for (int i=0; i<3; i++){
            System.out.print(names[i] + "\t");
            System.out.println(ages[i]);
        }



        */

        // Filling an array using the user inputs
        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];

        for (int i=0; i<values.length; i++){
            // This will add the value directly
            values[i] = sc.nextInt();
            
            /* 
            This will first store the input and the assign it
            This is better if we want to check the input

            int num = sc.nextInt();
            values[i]= num;
            */
        }
        
        
        for(int j:values){
            System.out.println(j);
        }
        sc.close();
    }   
}

class Array2D{
    public static void main(String[] args) {
        // 2D arrays
        Scanner sc = new Scanner(System.in);
        String [][] cars = new String[2][2];
        for (int i = 0; i<2; i++){
            System.out.println("Enter the items in the row #"+(i+1));
            for (int j=0; j<2; j++){
                cars[i][j] = sc.next();
                
            }
        }

        for (int i = 0; i<2; i++){
            System.lineSeparator();
            for (int j=0; j<2; j++){
                System.out.println(cars[i][j]);
            }
        }
 



        String[][] drivers = {{"Perez","Verstappen"},{"Sains","Leclerc"},{"Hamilton","Russel"},{"Norris","Piastri"}};
        sc.close();
    }
}
