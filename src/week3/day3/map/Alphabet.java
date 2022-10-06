package week3.day3.map;

public class Alphabet {
    public static boolean isAlphabet(char alphabet) {
        if ((alphabet >= 65 && alphabet <= 90) || (alphabet >= 97 && alphabet <= 122)) {
            return true;
        }
        return false;
    }
}

