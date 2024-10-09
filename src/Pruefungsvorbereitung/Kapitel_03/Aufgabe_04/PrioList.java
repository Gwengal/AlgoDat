package Pruefungsvorbereitung.Kapitel_03.Aufgabe_04;

import java.util.Iterator;
import java.util.LinkedList;

public class PrioList<t extends Comparable<? super t>> {
    private LinkedList<t> queue;

    public PrioList() {
        this.queue = new LinkedList<>();
    }

    public t remove() {
        return this.queue.removeFirst();
    }

    public void insert(t data) {
        Iterator<t> it = queue.iterator();
        int index = 0;

        while (it.hasNext()) {
            if (it.next().compareTo(data) > 0) {
                break;
            }

            index++;
        }

        this.queue.add(index, data);
    }

    public void print() {
        Iterator<t> it = queue.iterator();
        t value = null;
        boolean firstMsg = false;

        while (it.hasNext()) {
            value = it.next();
            if (!firstMsg) {
                System.out.printf("PrioListe für [%s]:\n", value.getClass().getSimpleName());
                firstMsg = true;
            }

            System.out.printf("- %s\n", value);
        }
    }
}
