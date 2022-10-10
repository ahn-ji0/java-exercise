package week3.day4.practice;

import week3.day4.ooppractice.PopulationMove;

import java.io.*;
import java.util.List;

public class WriteTo {
    private File file;

    public WriteTo(String fileName) throws IOException {
        file = new File(fileName);
        file.createNewFile();
    }
    public String fromToString(PopulationMove2 populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }
    public void writeToFile(List<PopulationMove2> newList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        for(PopulationMove2 inst : newList)
            bw.write(fromToString(inst));
        bw.close();
    }
}


