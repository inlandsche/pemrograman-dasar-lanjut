package program.generic.app;

import program.generic.data.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> data = new Pair<>("andi", 170);

        System.out.println(data.getFirst());
        System.out.println(data.getSecond());
    }
}
