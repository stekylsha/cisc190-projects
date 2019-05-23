package edu.sdccd.mesa.cisc190.hashes;

public class HashTestGood {
    private Integer i;

    public HashTestGood(int i) {
        this.i = Integer.valueOf(i);
    }

    public Integer get() {
        return i;
    }

    public int hashCode() {
        return i.intValue() % 3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HashTestGood) &&
                (this.i.equals(((HashTestGood)obj).i));
    }
}
