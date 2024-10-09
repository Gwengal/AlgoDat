package Pruefungsvorbereitung.Kapitel_05.Aufgabe_06;

import java.util.Comparator;

public class FlugzeugCom implements Comparator<Flugzeug> {
    @Override
    public int compare(Flugzeug o1, Flugzeug o2) {
        int pos = o1.getPrio() - o2.getPrio();

        if (pos == 0) {
            return 1;
        } else {
            return pos;
        }
    }

}
