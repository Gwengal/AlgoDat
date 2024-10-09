package Pruefungsvorbereitung.Kapitel_05.Aufgabe_06;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Flugzeug> flugzeuge = new TreeSet<>(new FlugzeugCom());
        flugzeuge.add(new Flugzeug(2, "ABC"));
        flugzeuge.add(new Flugzeug(1, "BCD"));
        flugzeuge.add(new Flugzeug(4, "KAF"));
        flugzeuge.add(new Flugzeug(1, "CDE"));
        flugzeuge.add(new Flugzeug(2, "HJI"));
        flugzeuge.add(new Flugzeug(2, "KLI"));
        flugzeuge.add(new Flugzeug(1, "UUI"));
        flugzeuge.add(new Flugzeug(3, "NLÖ"));

        Iterator<Flugzeug> iter = flugzeuge.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }

    }
}
