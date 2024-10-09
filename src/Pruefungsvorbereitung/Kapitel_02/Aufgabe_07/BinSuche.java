package Pruefungsvorbereitung.Kapitel_02.Aufgabe_07;

public class BinSuche implements Suche{
    @Override
    public boolean search(int[] a, int x) {
        int left = 0, right = a.length - 1, middle = 0, iIter = 0;

        while(left <= right) {
            iIter ++;
            middle = left + (right - left) / 2;

            if(a[middle] == x) {
                System.out.printf("Binäre Suche für %d hat %d Schleifendurchläufe gedauert!\n", x, iIter);
                return true;
            }
            else if(a[middle] < x) {
                left = middle + 1;
            }
            else if(a[middle] > x) {
                right = middle - 1;
            }
        }

        return false;
    }
}
