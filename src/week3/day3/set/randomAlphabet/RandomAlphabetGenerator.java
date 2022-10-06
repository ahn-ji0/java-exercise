package week3.day3.set.randomAlphabet;

import week3.day3.set.randomAlphabet.AlphabetGenerator;

public class RandomAlphabetGenerator implements AlphabetGenerator {
    @Override
    public char generate(int from, int to) {
        return (char) ((Math.random() * (to-from+1)) + from);
    }
}
