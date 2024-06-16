

import java.util.Random;
public class Random1 {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(6); //number between 0 and 5
        double y = random.nextDouble(); // random double between 0 and 1
        boolean z = random.nextBoolean(); // random true or false
        System.out.println(z);
    }
}
