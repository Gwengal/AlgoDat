package Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Wiederholung;

import Pruefungsvorbereitung.Kapitel_04.Aufgabe_01.Sort;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int elem = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > elem) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = elem;
        }
    }

}
