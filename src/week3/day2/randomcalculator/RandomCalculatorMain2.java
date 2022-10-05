package week3.day2.randomcalculator;

public class RandomCalculatorMain2{

    public static void main(String[] args) {
        NumberGenerator numberMaker = new RandomNumberGenerator();
        RandomCalculator2 randomCalculator2 = new RandomCalculator2(numberMaker);
        randomCalculator2.plus(30);
    }
}
