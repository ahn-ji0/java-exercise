package week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopulationStatics {

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/ahnjy/Downloads/2021_인구관련연간자료_20220927_66125.csv";
        List<PopulationMove> myList = new ArrayList<>();

        ReadByLine readByLine = new ReadByLine();
        myList = readByLine.read(fileName);
        System.out.println("done");
    }
}

