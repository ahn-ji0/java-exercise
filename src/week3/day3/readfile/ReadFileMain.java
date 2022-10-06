package week3.day3.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {

    public static void main(String[] args) throws IOException {
        int N = 6;
        System.out.println("read one letter:");
        ReadFile.readOneLetter("afile.txt");

        System.out.println("read two letters:");
        ReadFile.readTwoLetters("afile.txt");

        System.out.printf("read %d letters:\n",N);
        ReadFile.readNLetters("afile.txt",6);

    }
}
