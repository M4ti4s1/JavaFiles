
import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size;
        float grade, sum, finalGrade;

        System.out.println("Enter the number of grades");
        size = sc.nextInt();

        float[] grades = new float[size];

        // Assign grades to the array
        for(int i=0; i<grades.length; i++){
            do {
                grade = (float) sc.nextFloat();

            }while(grade < 0);

            grades[i]= grade;
        }

        // Calculate the sum of the grades
        sum = 0;
        for(float element:grades){
            sum += element;
        }

        finalGrade = sum/size;
        finalGrade = Math.round(finalGrade * 10)/10f;

        System.out.println(finalGrade);
    }
}
