package week3.day3.map;

import java.util.HashMap;
import java.util.Map;

public class AlphabetCnt {
    public static void main(String[] args) {
        String s1 = "https://github.com/ahn-ji0/java_exercise";

        //string 한글자 씩 출력
        for(int idx = 0; idx < s1.length(); idx++) {
            char alphabet = s1.charAt(idx);
            if (Alphabet.isAlphabet(alphabet)){
                System.out.println("is alphabet");
            }
        }
    }
}
