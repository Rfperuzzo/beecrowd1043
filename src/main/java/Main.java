
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c ,peri , area ;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            peri = a + b + c ;
            System.out.printf("Perimetro = %.1f%n", peri);
        } else {
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n",area); 
        }

    }
}
