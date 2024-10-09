package Pruefungsvorbereitung.Kapitel_02.Aufgabe_07;

public class Test {
    public static void main(String[] args) {
        Suche[] search = {new SeqSuche(), new BinSuche()};
        int[] array = Test.createArray(123);

        for(Suche s : search) {
            s.search(array, 45);
        }
    }

    private static int[] createArray(int n) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i+1;
        }

        return a;
    }
}
