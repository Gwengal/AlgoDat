package Pruefungsvorbereitung.Kapitel_03.Aufgabe_04;

public class Flugzeug implements Comparable<Flugzeug> {
    private int prio;
    private String name;

    public Flugzeug(int prio, String name) {
        this.prio = prio;
        this.name = name;
    }

    @Override
    public int compareTo(Flugzeug o) {
        return this.prio - o.prio;
    }

    @Override
    public String toString() {
        return String.format("Flugzeug [%s] hat die Priorität [%d].", this.name, this.prio);
    }
}
