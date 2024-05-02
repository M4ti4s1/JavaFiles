/*
a           b               c                             d  
*           **********      **********                    *
**          *********        *********                   **
***         ********          ********                  ***
****        *******            *******                 ****
*****       ******              ******                *****
******      *****                *****               ******
*******     ****                  ****              *******
********    ***                    ***             ********
*********   **                      **            *********
**********  *                        *           **********

*/

import java.util.Scanner; //import for the 10th exercise


class Ejercicio7a{
    public static void main(String[] args){
        int row, columns;
        row = 10;
        columns = 10;

        for (int i=0;i<row; i++){
            for (int j=0; j<columns; j++){
                System.out.print("*");
                if (j==i){
                    break;
                }
            }
            System.out.println();
        }
    }
}

class Ejercicio7b{
    public static void main(String[] args){
        int row, columns;
        row = 10;
        columns = 10;

        for (int i=0;i<row; i++){
            for (int j=columns-1; j>=0; j--){
                System.out.print("*");
                if (j == i){
                    break;
                }
            }
            System.out.println();
        }
    }
}

class Ejercicio7c{
    public static void main(String[] args){
        int row, columns;
        row = 10;
        columns = 10;

        for (int i=0;i<row; i++){

            for (int k=0;k<columns; k++){
                if (i == k){
                    break;
                }
                System.out.print(" ");
            }
            
            for (int j=columns; j>0; j--){
                if (j == i){
                    break;
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}

class Ejercicio7d{
    public static void main(String[] args){
        int row, columns;
        row = 10;
        columns = 10;

        for (int i=0;i<row; i++){

            for (int j=columns-1; j>=0; j--){
                if (j == i){
                    break;
                }
                System.out.print(" ");
            }
            
            for (int k=0; k<= columns; k++){
                System.out.print("*");
                if (i==k){
                    break;
                }
            }
            
            System.out.println();
        }
    }
}

class Ejercicio9{
    public static void main(String[] args){
        int row, columns;
        row = 10;
        columns = 10;

        for (int i=0; i<row;i++){

            
            
            // First Trangle
            for (int j=0; j<columns; j++){
                System.out.print("*");
                if (j==i){
                    break;
                }
            }
            for (int j=15; j>0; j--){
                if (j == i){
                    break;
                }
                System.out.print(" ");
            }
            

            // Second 
            for (int j=columns-1; j>=0; j--){
                System.out.print("*");
                if (j == i){
                    break;
                }
            }

            for (int k=-5; k<= columns; k++){
                System.out.print(" ");
                if (i==k){
                    break;
                }
            }
            
            // Third
            for (int k=0;k<columns; k++){
                if (i == k){
                    break;
                }
                System.out.print(" ");
            }
            
            for (int j=columns; j>0; j--){
                if (j == i){
                    break;
                }
                System.out.print("*");
            }
            

            // Forth
            for (int j=16-1; j>=0; j--){
                if (j == i){
                    break;
                }
                System.out.print(" ");
            }
            
            for (int k=0; k<= columns; k++){
                System.out.print("*");
                if (i==k){
                    break;
                }
            }
            
            System.out.println();
    
        }
    }
}

// work 30x30, but if you give different rows and columns it will not work
class Ejercicio10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row, columns;
        boolean opc = false;
        
        while (opc == false){
            row = sc.nextInt();
            columns = sc.nextInt();
            for (int i=0; i<row;i++){
                
                // First Trangle
                for (int j=0; j<columns; j++){
                    System.out.print("*");
                    if (j==i){
                        break;
                    }
                }
                for (int j=columns; j>0; j--){
                    if (j == i){
                        break;
                    }
                    System.out.print(" ");
                }
                

                // Second 
                for (int j=columns-1; j>=0; j--){
                    System.out.print("*");
                    if (j == i){
                        break;
                    }
                }

                for (int k=0; k<= columns; k++){
                    System.out.print(" ");
                    if (i==k){
                        break;
                    }
                }
                
                // Third
                for (int k=0;k<columns; k++){
                    if (i == k){
                        break;
                    }
                    System.out.print(" ");
                }
                
                for (int j=columns; j>0; j--){
                    if (j == i){
                        break;
                    }
                    System.out.print("*");
                }
                

                // Forth
                for (int j=columns; j>=0; j--){
                    if (j == i){
                        break;
                    }
                    System.out.print(" ");
                }
                
                for (int k=0; k<= columns; k++){
                    System.out.print("*");
                    if (i==k){
                        break;
                    }
                }
                
                System.out.println();
        
            } 
            //Condition to break aut of the loop
            System.out.println("Are you satisfied? (y/n)");
            String comprobation = sc.next();
            if (comprobation.equalsIgnoreCase((String)"y")){
                break;
            }else if(comprobation.equalsIgnoreCase((String)"n")){
                opc = false;
            }
        }
        sc.close();   
    }
}