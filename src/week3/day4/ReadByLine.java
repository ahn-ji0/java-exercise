package week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadByLine implements ReadFile {

    public PopulationMove parse(String data){
        String[] newArr = data.split(",");
        return new PopulationMove(Integer.parseInt(newArr[0]), Integer.parseInt(newArr[6]));
    }

    @Override
    public List<PopulationMove> read(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("/Users/ahnjy/Downloads/2021_인구관련연간자료_20220927_66125.csv"));
        List<PopulationMove> myList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            myList.add(parse(line));
        }
        return myList;
    }
}


