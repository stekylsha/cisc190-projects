package edu.sdccd.mesa.cisc190.readers;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Readers readers = new Readers(new File(Main.class.getResource("input.txt").toURI()));
        List<ReadData> readDataList = readers.readData();
        System.out.println(readDataList);
    }
}
