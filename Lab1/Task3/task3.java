package Task3;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Enter a:");
        double a = 32.5;
        System.out.println(a);
        System.out.println("Enter b:");
        double b = 235.65;
        System.out.println(b);
        System.out.println("Enter h:");
        double h = 5.6;
        System.out.println(h);
        double i = a;
        while (i <= b){
            System.out.printf("tg(%.4f) = %.4f \n", i, Math.tan(i) );
            i+=h;
        }
    }
}
