package MethodEx;
public class SmallestOf3 {
    public static void main(String[] args) {
        int x = smallestof3(2,3,4);
        System.out.println(x);
    }

    
    public static int smallestof3(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }else if (b <= a && b <= c) {
            return b;
        }else if (c <= a && c <= b) {
            return c;
        }

        return -1; // in case there is not smallest

    }
     
}
