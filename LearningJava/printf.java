/* 
%s: String
%d: Integer
%f: Float
%c: Character
%b: Boolean
%t: Date/Time


Padding:
    %xs: x positive aligne to the right, x negative aligne to the left
    %2f: this specify the amount of difits after the decimal point
    %n: do a jump line
*/


import java.util.ArrayList;
import java.util.Scanner;
public class printf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println("How many people do you want to add: ");
        int size = sc.nextInt();


        for (int i= 0; i<size; i++){
            System.out.printf("Name person #%d: ",i+1);
            names.add(sc.next());
            System.out.printf("Age person #%d: ", i+1);
            ages.add(sc.nextInt());
            System.lineSeparator();
        }
        System.out.printf("%-3s %-10s %-5s%n","id","Name", "age");
        for (int i=0; i<size; i++){
            System.out.printf("%-3d %-10s %-5d%n", i+1, names.get(i), ages.get(i));
        }

        sc.close();
    }
    
}
