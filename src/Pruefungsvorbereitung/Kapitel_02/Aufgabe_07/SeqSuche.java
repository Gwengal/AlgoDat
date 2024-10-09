package Pruefungsvorbereitung.Kapitel_02.Aufgabe_07;

public class SeqSuche implements Suche{

    @Override
    public boolean search(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.printf("Iterative Suche für %d hat %d Schleifendurchläufe gedauert!\n", x, i);
                return true;
            }
        }

        return false;
    }
}
