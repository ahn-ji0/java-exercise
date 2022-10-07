package week3.day4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ReadFile {
    List<PopulationMove> read(String fileName) throws IOException;
}
