package week3.day4.ooppractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read<T> {
    private Parse<T> parse;

    public Read(Parse<T> parse){
        this.parse = parse;
    }

    public List<T> readLines(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        List<T> myList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            T tmp = parse.parsing(line);
            myList.add(tmp);
        }

        return myList;
    }
}
