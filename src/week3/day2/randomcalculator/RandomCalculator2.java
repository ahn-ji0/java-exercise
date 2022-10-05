package week3.day2.randomcalculator;

public class RandomCalculator2 {
    //NumberGenerator에서 만들어준 숫자를 가지고 사칙 연산한 결과를 출력한다.
       private NumberGenerator numberGenerator;

       public RandomCalculator2(NumberGenerator numberGenerator){
           this.numberGenerator = numberGenerator;
       }
       public void plus(int num) {
           int result = num + this.numberGenerator.generate(10);
           System.out.println(result);
       }
}
