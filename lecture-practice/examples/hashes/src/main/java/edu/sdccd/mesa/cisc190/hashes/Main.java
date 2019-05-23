package edu.sdccd.mesa.cisc190.hashes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        hashTestBad();
        hashTestGood();
    }

    private static void hashTestBad() {
        List<HashTestBad> htList = new ArrayList<>();
        Set<HashTestBad> htSet = new HashSet<>();
        for (int i = 0 ; i < 20 ; i++) {
            HashTestBad htb = new HashTestBad(i);
            htList.add(htb);
            htSet.add(htb);

        }
        System.out.println("HashTestBad list contains " + htList.size() + " things");
        System.out.println("HashTestBad set contains " + htSet.size() + " things");
        htList.forEach(x -> System.out.println("List has " + x.get()));
        htSet.forEach(x -> System.out.println("Set has " + x.get()));
    }

    private static void hashTestGood() {
        List<HashTestGood> htList = new ArrayList<>();
        Set<HashTestGood> htSet = new HashSet<>();
        for (int i = 0 ; i < 20 ; i++) {
            HashTestGood ht = new HashTestGood(i);
            htList.add(ht);
            htSet.add(ht);

        }
        System.out.println("HashTestBad list contains " + htList.size() + " things");
        System.out.println("HashTestBad set contains " + htSet.size() + " things");
        htList.forEach(x -> System.out.println("List has " + x.get()));
        htSet.forEach(x -> System.out.println("Set has " + x.get()));
    }
}
