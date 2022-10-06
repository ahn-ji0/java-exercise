package week3.day3.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {

    public static void main(String[] args) throws IOException {
        char c = ReadFile.readOneByte();
        System.out.println(c);
    }
}
