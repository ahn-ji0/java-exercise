package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int classNum;
    private String names;
    private String gitRepositoryAddress;

    public Student(int classNum, String names, String gitRepositoryAddress) {
        this.classNum = classNum;
        this.names = names;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }
}
