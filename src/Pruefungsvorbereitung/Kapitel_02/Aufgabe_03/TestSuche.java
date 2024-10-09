package Pruefungsvorbereitung.Kapitel_02.Aufgabe_03;

public class TestSuche {
    public static void main(String[] args) {
        int[] array = TestSuche.createArray(100);
        TestSuche.binarySearch(array, 64);
    }

    private static int[] createArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n ; i++) {
            array[i] = i+1;
        }

        return array;
    }

    private static boolean binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1, middle = 0, iIter = 0;
        boolean found = false;

        while(left <= right) {
            iIter++;
            middle = left + (right - left) / 2;

            if(a[middle] == x) {
                found = true;
                break;
            }
            else if(a[middle] < x) {
                left = middle + 1;
            }
            else if(a[middle] > x) {
                right = middle - 1;
            }
        }

        if(found) {
            System.out.printf("Wert [%d] gefunden auf Index-Stelle [%d]\n", x, middle);
            System.out.printf("--> [%d] Schleifendurchläufe gebraucht!\n", iIter);
        }
        else {
            System.out.printf("Wert [%d] konnte nicht gefunden werden!\n", x);
        }

        return found;
    }
}
