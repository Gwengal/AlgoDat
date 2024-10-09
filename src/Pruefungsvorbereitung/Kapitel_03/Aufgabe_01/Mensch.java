package Pruefungsvorbereitung.Kapitel_03.Aufgabe_01;

public class Mensch implements Comparable<Mensch> {
    private String name;
    private int groeße;

    public Mensch(String name, int groeße) {
        this.name = name;
        this.groeße = groeße;
    }

    @Override
    public int compareTo(Mensch o) {
        return this.groeße - o.groeße;
    }

    @Override
    public String toString() {
        return String.format("%s ist %d groß.", this.name, this.groeße);
    }
}