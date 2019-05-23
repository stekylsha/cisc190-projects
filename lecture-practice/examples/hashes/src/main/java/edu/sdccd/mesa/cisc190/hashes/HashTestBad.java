package edu.sdccd.mesa.cisc190.hashes;

public class HashTestBad {
    private Integer i;

    public HashTestBad(int i) {
        this.i = Integer.valueOf(i);
    }

    public Integer get() {
        return i;
    }

    public int hashCode() {
        return i.intValue() % 3;
    }

    public boolean equals(Object obj) {
        return (obj.hashCode() == this.hashCode());
    }
}
