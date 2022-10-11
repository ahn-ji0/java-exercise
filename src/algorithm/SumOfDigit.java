package algorithm;
import java.util.*;
public class SumOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;
        List<String> myList = List.of(String.valueOf(N).split(""));

        for(String val: myList){
            answer += Integer.parseInt(val);
        }
        System.out.println(answer);
    }
}
