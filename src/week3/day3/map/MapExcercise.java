package week3.day3.map;

import week3.day2.collection.Student;

import java.util.HashMap;

public class MapExcercise {
    public static void main(String[] args) {
        //key value
        HashMap<String, String> map = new HashMap<>();

        map.put("권하준","https://github.com/dongyeon-0822/java-project-exercise");
        map.put("조성윤","https://github.com/kang-subin/Java");
        map.put("안예은","https://github.com/KoKwanwun/LikeLion.git");
        map.put("남우빈","https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion");
        map.put("최경","https://github.com/cmkxak/likelion-java-course");

        System.out.println(map.get("권하준"));
    }

}
