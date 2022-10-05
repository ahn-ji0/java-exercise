import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(a,b));
        System.out.println(calculator.minus(a,b));
        System.out.println(calculator.multiply(a,b));
        System.out.println(calculator.divide(a,b));


    }
}
