package week3.day3.set;

import java.util.HashSet;
import java.util.Set;

public class RndNumNoDuplication {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        NumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        //랜덤 숫자 발생
        for(int i=0; i<50; i++) {
            int r = randomNumberGenerator.generate(10);
        }
        //중복 없이 set에 랜덤 숫자 저장
        while(numbers.size() < 50){
            numbers.add(randomNumberGenerator.generate(200));
        }

    }
}
