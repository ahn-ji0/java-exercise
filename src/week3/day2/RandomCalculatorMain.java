package week3.day2;

import java.util.Scanner;

public class RandomCalculatorMain {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        RandomCalculator randomCalculator = new RandomCalculator(a);
        randomCalculator.genRandNum();

        System.out.println(randomCalculator.randPlus());
        System.out.println(randomCalculator.randMinus());
        System.out.println(randomCalculator.randMultiply());
        System.out.println(randomCalculator.randDivide());

    }
}
