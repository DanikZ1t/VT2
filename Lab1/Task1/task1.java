package Task1;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        int x = 5;
        System.out.println(x);
        System.out.println("Enter y:");
        int y = 12;
        System.out.println(y);
        System.out.println("Result: " + ((1 + Math.pow(2, Math.sin(x+y)))/(2 + Math.abs(x - (2*x)/(1 + x*x*y*y))) + x));
    }
}