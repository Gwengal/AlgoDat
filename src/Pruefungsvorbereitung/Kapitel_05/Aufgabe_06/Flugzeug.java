package Pruefungsvorbereitung.Kapitel_05.Aufgabe_06;

public class Flugzeug {
    private int prio;
    private String name;

    public Flugzeug(int prio, String name) {
        this.prio = prio;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Prio:\t%d\nName:\t%s\n\n", this.prio, this.name);
    }

    public int getPrio() {
        return this.prio;
    }
}
