package week3.day3.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileMain {

    public static void main(String[] args) throws IOException {
        String fileName = "afile.txt";

        System.out.print("read one letter : ");
        ReadFile.readOneLetter(fileName);

        System.out.print("read two letters : ");
        ReadFile.readTwoLetters(fileName);

        int N = 6;
        System.out.printf("read %d letters : ",N);
        ReadFile.readNLetters(fileName,N);

    }
}
