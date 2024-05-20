package Kapitel_02.Aufgabe_07;

public class TestSuchen {
    public static void main(String[] args) {
        Suchen oSearch = new SeqSuche();
        Suchen oSearch2 = new BinSuche();
        try {
            System.out.printf("Seq.: %d Schleifendurchläufe gebraucht!\n", oSearch.search(TestSuchen.init(80), 62));
            System.out.printf("Seq.: %d Schleifendurchläufe gebraucht!\n", oSearch2.search(TestSuchen.init(80), 62));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int[] init(int n) {
        int[] aNumbers = new int[n];

        for (int i = 0; i < aNumbers.length; i++) {
            aNumbers[i] = (i + 1);
        }

        return aNumbers;
    }
}
