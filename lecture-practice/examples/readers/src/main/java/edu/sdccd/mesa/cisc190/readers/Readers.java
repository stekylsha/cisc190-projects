package edu.sdccd.mesa.cisc190.readers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readers {
    private Scanner scanner;

    public Readers(String fileName) throws IOException {
        this(new File(fileName));
    }

    public Readers(File file) throws IOException {
        this.scanner = new Scanner(file);
    }

    public List<ReadData> readData() {
        List<ReadData> rv = new ArrayList<>();
        while (scanner.hasNext()) {
            int ord = scanner.nextInt();
            String words = scanner.nextLine();
            ReadData rd = new ReadData(ord, words);
            rv.add(rd);
        }
        scanner.close();

        return rv;
    }
}
