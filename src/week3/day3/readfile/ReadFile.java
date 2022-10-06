package week3.day3.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    //지정한 파일의 1 byte 읽어오는 메소드를 만들어 보세요
    public static void readOneLetter(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        System.out.println((char) br.read());
    }

    public static void readTwoLetters(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        for (int i = 0; i < 2; i++) {
            System.out.print((char) br.read());
        }
        System.out.println();
    }
    public static void readNLetters(String fileName,int N) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        for (int i = 0; i < N; i++) {
            System.out.print((char) br.read());
        }
        System.out.println();
    }
}
