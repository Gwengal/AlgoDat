package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Alt;

import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Sort;

public class InsertionSortAlt implements Sort {
    @Override
    public void sort(int[] arr) {
        int i, j, elem;

        for (i = 1; i < arr.length; i++) {
            elem = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > elem) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = elem;
        }
    }
}
