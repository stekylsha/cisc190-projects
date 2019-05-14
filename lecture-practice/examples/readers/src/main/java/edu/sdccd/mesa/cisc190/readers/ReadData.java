package edu.sdccd.mesa.cisc190.readers;

public class ReadData {
    private int ordinal;
    private String words;

    public ReadData(int ordinal, String words) {
        this.ordinal = ordinal;
        this.words = words;
    }

    public ReadData() {
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getWords() {
        return words;
    }

    @Override
    public String toString() {
        return "ReadData{" +
                "ordinal=" + ordinal +
                ", words='" + words + '\'' +
                '}';
    }
}
