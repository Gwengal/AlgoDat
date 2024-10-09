package Pruefungsvorbereitung.Kapitel_02.Aufgabe_04;

public class Tuerme {
    public static void main(String[] args) {
        int scheiben = 100;

        System.out.printf("Rekursiver Aufruf mit [%d] Scheiben -> [%d].\n", scheiben, Tuerme.rec(scheiben));
        System.out.printf("Iterativer Aufruf mit [%d] Scheiben -> [%d].\n", scheiben, Tuerme.iter(scheiben));
    }

    private static int rec(int n) {
        if (n == 1)
            return 1;

        return 2 * Tuerme.rec(n - 1) + 1;
    }

    private static int iter(int n) {
        int iAmount = 1;

        while (n != 1) {
            iAmount = 2 * iAmount + 1;
            n -= 1;
        }

        return iAmount;
    }
}
