package week3.day3.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    //지정한 파일의 1 byte 읽어오는 메소드를 만들어 보세요
    public static char readOneByte() throws IOException {
        char c;

        BufferedReader br = new BufferedReader(new FileReader("afile.txt"));
        c = (char)br.read();
        return c;
    }
}
