package week3.day4;

import java.io.IOException;
import java.util.ArrayList;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido){
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}

