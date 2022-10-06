package week3.day3.map;

import java.util.HashMap;

public class AlphabetCntMyVersion {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/ahn-ji0/java_exercise";
        HashMap<String,Integer> alphabetCount = new HashMap<>();

        for(int idx = 0; idx < repoAddr.length(); idx++) {
            char alphabet = repoAddr.charAt(idx);
            if((alphabet >= 65 && alphabet <=90) || (alphabet >= 97 && alphabet <=122)){
                String tmp = Character.toString(alphabet);
                if(!alphabetCount.containsKey(tmp))
                    alphabetCount.put(tmp,0);
                alphabetCount.put(tmp, alphabetCount.get(tmp)+1);
            }
        }
        System.out.println(alphabetCount);
    }
}
