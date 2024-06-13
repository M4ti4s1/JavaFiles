public class Overloaded_Methods{
    public static void main(String[] args) {
        // Overloaded methods
        // With these now the sum method will take from 2 to 4 int arguments
        // Also the same method will take from 2 to 4 float arguments 
    }
    
    public static int sum(int a, int b){
        System.out.println("Overloaded method #1");
        return a+b;
    }
    public static int sum(int a, int b, int c){
        System.out.println("Overloaded method #2");
        return a+b+c;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("Overloadee method #3");
        return a+b+c+d;
    }
    
    
    public static int sum(float a, float b){
        System.out.println("Overloaded method #4");
        return a+b;
    }
    public static int sum(float a, float b, float c){
        System.out.println("Overloaded method #5");
        return a+b+c;
    }
    public static int sum(float a, float b, float c, float d){
        System.out.println("Overloadee method #6");
        return a+b+c+d;
    }
}
