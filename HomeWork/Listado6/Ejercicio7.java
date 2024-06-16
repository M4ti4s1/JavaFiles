import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] str = new String[3][4];
        String[] vocales = {"a","e","i","o","u"};
        int count = 1, moreThan5 = 0, startVowel = 0, atLeast3Vowel = 0;


        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                System.out.println("Ingresa palabra #" + (count));
                str[i][j] = sc.next();
                count++;
            }
        }
        


        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                // with 5 or more character
                if (str[i][j].length() >= 5) {
                    moreThan5++;
                }
                
                // start with a vowel
                for (int k = 0; k < vocales.length; k++) {
                    // first character
                    String first = Character.toString(str[i][j].charAt(0)) ;                
                    if (vocales[k].equalsIgnoreCase(first)){
                        startVowel++;
                    }
                }

                // contain 3 or more vowels
                int vowelWord = 0;
                for (int k = 0; k < vocales.length; k++){
                    for (int l = 0; l < str[i][j].length(); l++) {

                        String word = str[i][j];

                        String character = Character.toString(word.charAt(l));

                        if (vocales[k].equalsIgnoreCase(character)) {
                            vowelWord++;
                        }
                    }
                }
                
                if (vowelWord >= 3) {
                    atLeast3Vowel++;
                }
            }
        }
        
        System.out.println(moreThan5);
        System.out.println(startVowel);
        System.out.println(atLeast3Vowel);
        /*
        for (String[] row : str) {
            for (String column : row) {
                System.out.println(column);
            }
        }
        */
    }
}